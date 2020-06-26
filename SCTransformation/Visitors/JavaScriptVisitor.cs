using System.Collections.Generic;
using System.Linq;
using SCTransformation.Grammars.JavaScript;
using SCTransformation.Models;

namespace SCTransformation.Visitors
{
    public class JavaScriptVisitor : JavaScriptParserBaseVisitor<object>
    {
        public JavaScript JavaScript { get; }

        public JavaScriptVisitor()
        {
            JavaScript = new JavaScript()
            {
                Imports = new List<string>(),
                Exports = new List<string>(),
                Variables = new List<JavaScript.Variable>(),
                Functions = new List<JavaScript.Function>()
            };
        }

        public override object VisitProgram(JavaScriptParser.ProgramContext context)
        {
            JavaScript.BlockChainType = GetBlockChainType(context);
            var sourceElements = context.sourceElements().sourceElement();
            foreach (var sourceElement in sourceElements)
            {
                var statement = sourceElement.statement();
                if (statement?.importStatement() != null &&
                    statement.importStatement().GetType() ==
                    typeof(JavaScriptParser.ImportStatementContext))
                {
                    var import = statement.importStatement().importFromBlock().importFrom().GetText();
                    JavaScript.Imports.Add(import);
                }
                else if (statement?.exportStatement() != null && statement.exportStatement().GetType() ==
                    typeof(JavaScriptParser.ExportStatementContext))
                {
                    var export = statement.exportStatement().GetText();
                    JavaScript.Exports.Add(export);
                }
                else if (statement?.variableStatement() != null && statement.variableStatement().GetType() ==
                    typeof(JavaScriptParser.VariableStatementContext))
                {
                    foreach (var variable in statement.variableStatement().variableDeclarationList()
                        .variableDeclaration())
                    {
                        var type = statement.variableStatement().variableDeclarationList()?.varModifier()?.GetText();
                        var objectName = variable.assignable()?.objectLiteral()?.propertyAssignment(0)?.GetText();
                        JavaScript.Variables.Add(new JavaScript.Variable
                        {
                            Name = objectName,
                            Type = type?? "string"
                        });
                    }
                }
                else if (statement?.functionDeclaration() != null && statement.functionDeclaration().GetType() ==
                    typeof(JavaScriptParser.FunctionDeclarationContext))
                {
                    var inputs = new List<JavaScript.Parameter>();
                    var outputs = new List<JavaScript.Parameter>();
                    var events = new List<string>();
                    var hasSideEffects = false;
                    foreach (var parameterArg in statement.functionDeclaration().formalParameterList()
                        .formalParameterArg().Skip(1))
                    {
                        inputs.Add(new JavaScript.Parameter
                        {
                            Name = parameterArg.assignable()?.identifier()?.GetText(),
                            Type = parameterArg.singleExpression()?.GetText() ?? "string"
                        });
                    }

                    foreach (var body in statement.functionDeclaration().functionBody().sourceElements()
                        .sourceElement())
                    {
                        var bodyExpression = body.statement()?.expressionStatement()?.expressionSequence()
                            ?.singleExpression();
                        if (bodyExpression != null &&
                            bodyExpression.GetType() ==
                            typeof(JavaScriptParser.SingleExpressionContext))
                        {
                            foreach (var expression in bodyExpression)
                            {
                                var text = expression.GetText().ToLower();
                                if (text.Contains("setevent"))
                                {
                                    if (expression.GetChild(1)?.GetType() ==
                                        typeof(JavaScriptParser.ArgumentsContext))
                                    {
                                        var eventName = expression.GetChild(1).GetChild(1).GetText();
                                        events.Add(eventName.Substring(1, eventName.Length - 2));
                                    }
                                }

                                if (text.Contains("putstate"))
                                {
                                    JavaScript.IsStateful = true;
                                    hasSideEffects=true;
                                }
                            }
                        }

                        var returnExpression = body.statement()?.returnStatement()?.expressionSequence()
                            ?.singleExpression();
                        if (returnExpression != null &&
                            returnExpression.GetType() ==
                            typeof(JavaScriptParser.SingleExpressionContext))
                        {
                            foreach (var expression in returnExpression)
                            {
                                outputs.Add(new JavaScript.Parameter
                                {
                                    Name = expression.GetText(),
                                    Type = "string"
                                });
                            }
                        }
                    }

                    JavaScript.Functions.Add(new JavaScript.Function
                    {
                        Name = statement.functionDeclaration().identifier()?.GetText(),
                        Inputs = inputs,
                        Events = events,
                        HasSideEffects = hasSideEffects,
                        Outputs = outputs
                    });
                }
                else if (statement?.classDeclaration() != null && statement.classDeclaration().GetType() ==
                    typeof(JavaScriptParser.ClassDeclarationContext))
                {
                    var methods = new List<JavaScript.Function>();

                    foreach (var classElement in statement.classDeclaration().classTail().classElement())
                    {
                        if (classElement.methodDefinition() != null && classElement.methodDefinition().GetType() ==
                            typeof(JavaScriptParser.MethodDefinitionContext))
                        {
                            var inputs = new List<JavaScript.Parameter>();
                            var outputs = new List<JavaScript.Parameter>();
                            var events =new List<string>();
                            var hasSideEffects = false;
                            foreach (var parameterArg in classElement.methodDefinition().formalParameterList()
                                .formalParameterArg().Skip(1))
                            {
                                inputs.Add(new JavaScript.Parameter
                                {
                                    Name = parameterArg.assignable()?.identifier()?.GetText(),
                                    Type = parameterArg.singleExpression()?.GetText() ?? "string"
                                });
                            }

                            foreach (var body in classElement.methodDefinition().functionBody().sourceElements()
                                .sourceElement())
                            {
                                var bodyExpression = body.statement()?.expressionStatement()?.expressionSequence()
                                    ?.singleExpression();
                                if (bodyExpression != null &&
                                    bodyExpression.GetType() ==
                                    typeof(JavaScriptParser.SingleExpressionContext[]))
                                {
                                    foreach (var expression in bodyExpression)
                                    {
                                        var text = expression.GetText().ToLower();
                                        if (text.Contains("setevent"))
                                        {
                                            if (expression.GetChild(1)?.GetType() ==
                                                typeof(JavaScriptParser.ArgumentsContext))
                                            {
                                                var eventName = expression.GetChild(1).GetChild(1).GetText();
                                                events.Add(eventName.Substring(1, eventName.Length - 2));
                                            }
                                        }
                                        
                                        if (text.Contains("putstate"))
                                        {
                                            hasSideEffects = true;
                                            JavaScript.IsStateful = true;
                                        }
                                    }
                                }

                                var returnExpression = body.statement()?.returnStatement()?.expressionSequence()
                                    ?.singleExpression();
                                if (returnExpression != null &&
                                    returnExpression.GetType() ==
                                    typeof(JavaScriptParser.SingleExpressionContext))
                                {
                                    foreach (var expression in returnExpression)
                                    {
                                        outputs.Add(new JavaScript.Parameter
                                        {
                                            Name = expression?.GetText(),
                                            Type = "string"
                                        });
                                    }
                                }
                            }

                            methods.Add(new JavaScript.Function()
                            {
                                Name = classElement.methodDefinition()?.propertyName()?.GetText(),
                                Events = events,
                                HasSideEffects = hasSideEffects,
                                Inputs = inputs,
                                Outputs = outputs
                            });
                        }
                    }

                    JavaScript.JavaScriptClass = new JavaScript.Class
                    {
                        Name = statement.classDeclaration().identifier()?.GetText(),
                        Extends = statement.classDeclaration().classTail()?.singleExpression()?.GetText(),
                        Methods = methods
                    };
                }
            }

            return null;
        }

        private BlockChainType GetBlockChainType(JavaScriptParser.ProgramContext context)
        {
            if (context.GetText().ToLower().Contains("ethereum"))
            {
                return BlockChainType.Ethereum;
            }

            if (context.GetText().ToLower().Contains("bitcoin"))
            {
                return BlockChainType.Bitcoin;
            }

            if (context.GetText().ToLower().Contains("neo"))
            {
                return BlockChainType.Neo;
            }

            if (context.GetText().ToLower().Contains("fabric"))
            {
                return BlockChainType.Fabric;
            }

            return BlockChainType.Ethereum;
        }
    }
}