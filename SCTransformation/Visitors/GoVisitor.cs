using System.Collections.Generic;
using SCTransformation.Grammars.Go;
using SCTransformation.Models;

namespace SCTransformation.Visitors
{
    public class GoVisitor : GoParserBaseVisitor<object>
    {
        public Go Go { get; }

        public GoVisitor()
        {
            Go = new Go
            {
                Imports = new List<string>(),
                Methods = new List<Go.Method>(),
                Vars = new List<Go.Var>(),
                Consts = new List<Go.Const>(),
                Types = new List<Go.Type_>(),
                Functions = new List<Go.Function>()
            };
        }

        public override object VisitSourceFile(GoParser.SourceFileContext context)
        {
            Go.PackageName = context.packageClause()?.IDENTIFIER()?.GetText();
            Go.BlockChainType = GetBlockChainType(context);
            if (context.importDecl() != null && context.importDecl().GetType() == typeof(GoParser.ImportDeclContext[]))
            {
                var imports = context.importDecl();
                foreach (var import in imports)
                {
                    if (import.importSpec() != null)
                    {
                        foreach (var importSpec in import.importSpec())
                        {
                            Go.Imports.Add(
                                $"{importSpec.IDENTIFIER()?.GetText()} Path: {importSpec.importPath()?.GetText()}");
                        }
                    }
                }
            }

            if (context.declaration() != null &&
                context.declaration().GetType() == typeof(GoParser.DeclarationContext[]))
            {
                foreach (var declaration in context.declaration())
                {
                    if (declaration.constDecl()?.constSpec() != null)
                    {
                        foreach (var constant in declaration.constDecl().constSpec())
                        {
                            if (constant.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in constant.identifierList().IDENTIFIER())
                                {
                                    Go.Consts.Add(new Go.Const
                                    {
                                        Name = identifier.GetText(),
                                        Type = constant.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    if (declaration.varDecl()?.varSpec() != null)
                    {
                        foreach (var var in declaration.varDecl().varSpec())
                        {
                            if (var.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in var.identifierList().IDENTIFIER())
                                {
                                    Go.Vars.Add(new Go.Var
                                    {
                                        Name = identifier.GetText(),
                                        Type = var.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    if (declaration.typeDecl()?.typeSpec() != null)
                    {
                        foreach (var type in declaration.typeDecl().typeSpec())
                        {
                            Go.Types.Add(new Go.Type_()
                            {
                                Name = type.IDENTIFIER()?.GetText(),
                                Type = type.type_()?.GetText()
                            });
                        }
                    }
                }
            }

            if (context.functionDecl() != null &&
                context.functionDecl().GetType() == typeof(GoParser.FunctionDeclContext[]))
            {
                foreach (var function in context.functionDecl())
                {
                    var inputs = new List<Go.Parameter>();
                    var returns = new List<Go.Parameter>();
                    if (function.signature()?.parameters()?.parameterDecl() != null)
                    {
                        foreach (var parameter in function.signature().parameters().parameterDecl())
                        {
                            if (parameter.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in parameter.identifierList().IDENTIFIER())
                                {
                                    inputs.Add(new Go.Parameter
                                    {
                                        Name = identifier.GetText(),
                                        Type = parameter.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    if (function.signature()?.result()?.parameters()?.parameterDecl() != null)
                    {
                        foreach (var parameter in function.signature().result().parameters().parameterDecl())
                        {
                            if (parameter.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in parameter.identifierList().IDENTIFIER())
                                {
                                    returns.Add(new Go.Parameter
                                    {
                                        Name = identifier.GetText(),
                                        Type = parameter.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    Go.Functions.Add(new Go.Function
                    {
                        Name = function.IDENTIFIER()?.GetText(),
                        Inputs = inputs,
                        Returns = returns
                    });
                }
            }

            if (context.methodDecl() != null &&
                context.methodDecl().GetType() == typeof(GoParser.MethodDeclContext[]))
            {
                foreach (var method in context.methodDecl())
                {
                    var inputs = new List<Go.Parameter>();
                    var returns = new List<Go.Parameter>();
                    var receiver = new List<Go.Parameter>();

                    if (method.signature()?.parameters()?.parameterDecl() != null)
                    {
                        foreach (var parameter in method.signature().parameters().parameterDecl())
                        {
                            if (parameter.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in parameter.identifierList().IDENTIFIER())
                                {
                                    inputs.Add(new Go.Parameter
                                    {
                                        Name = identifier.GetText(),
                                        Type = parameter.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    if (method.signature()?.result()?.parameters()?.parameterDecl() != null)
                    {
                        foreach (var parameter in method.signature().result().parameters().parameterDecl())
                        {
                            if (parameter.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in parameter.identifierList().IDENTIFIER())
                                {
                                    returns.Add(new Go.Parameter
                                    {
                                        Name = identifier.GetText(),
                                        Type = parameter.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    if (method.receiver()?.parameters()?.parameterDecl() != null)
                    {
                        foreach (var parameter in method.receiver().parameters().parameterDecl())
                        {
                            if (parameter.identifierList()?.IDENTIFIER() != null)
                            {
                                foreach (var identifier in parameter.identifierList().IDENTIFIER())
                                {
                                    receiver.Add(new Go.Parameter
                                    {
                                        Name = identifier.GetText(),
                                        Type = parameter.type_()?.GetText()
                                    });
                                }
                            }
                        }
                    }

                    Go.Methods.Add(new Go.Method
                    {
                        Name = method.IDENTIFIER()?.GetText(),
                        Inputs = inputs,
                        Returns = returns,
                        Receiver = receiver
                    });
                }
            }

            return null;
        }

        private BlockChainType GetBlockChainType(GoParser.SourceFileContext context)
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