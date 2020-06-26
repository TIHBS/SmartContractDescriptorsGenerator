using System.Collections.Generic;
using SCTransformation.Models;
using SCTransformation.Grammars.Solidity;
using System;
using System.Linq;

namespace SCTransformation.Visitors
{
    public class SolidityVisitor : SolidityBaseVisitor<object>
    {
        public Solidity Solidity { get; }

        public SolidityVisitor()
        {
            Solidity = new Solidity
            {
                Contracts = new List<Solidity.Contract>(),
                Imports = new List<string>()
            };
        }

        public override object VisitSourceUnit(SolidityParser.SourceUnitContext context)
        {
            var contracts = context.contractDefinition();
            var pragma = context.pragmaDirective().FirstOrDefault();
            var imports = context.importDirective();
            Solidity.BlockChainType = GetBlockChainType(context);
            Solidity.Pragma = pragma?.pragmaName()?.GetText() +
                              pragma?.pragmaValue()?.GetText();
            if (imports != null)
            {
                foreach (var import in imports)
                {
                    Solidity.Imports.Add(import.StringLiteralFragment()?.GetText());
                }
            }

            foreach (var contract in contracts)
            {
                var solidityContract = new Solidity.Contract
                {
                    Name = contract.identifier()?.GetText(),
                    Events = new List<Solidity.Event>(),
                    Enums = new List<Solidity.SolidityEnum>(),
                    Structs = new List<Solidity.Struct>(),
                    Functions = new List<Solidity.Function>(),
                    Modifiers = new List<Solidity.Modifier>(),
                    StateVariables = new List<Solidity.StateVariable>(),
                    Abstract = contract.GetText().Contains("abstract")
                };
                if (contract.GetText().Contains("interface"))
                {
                    continue;
                }
                if (contract.GetText().Contains("library"))
                {
                   continue;
                }

                foreach (var contractPart in contract.contractPart())
                {
                    if (contractPart.enumDefinition() != null && contractPart.enumDefinition().GetType() ==
                        typeof(SolidityParser.EnumDefinitionContext))
                    {
                        var enums = new List<string>();
                        contractPart.enumDefinition().enumValue().ToList()
                            .ForEach(x => enums.Add(x.identifier().GetText()));

                        solidityContract.Enums.Add(new Solidity.SolidityEnum
                        {
                            Name = contractPart.enumDefinition().identifier().GetText(),
                            Enums = enums
                        });
                    }

                    else if (contractPart.structDefinition() != null && contractPart.structDefinition().GetType() ==
                        typeof(SolidityParser.StructDefinitionContext))
                    {
                        var variables = new List<Solidity.Variable>();
                        var index = 0;
                        contractPart.structDefinition().variableDeclaration().ToList().ForEach(x =>
                        {
                            index++;
                            variables.Add(new Solidity.Variable
                            {
                                Name = x.identifier().GetText(),
                                StorageLocation = Enum.Parse<Solidity.StorageLocation>(
                                    contractPart.structDefinition().variableDeclaration(index)?.storageLocation()
                                        ?.GetText() ?? "none", true),
                                Type = x.typeName().GetText()
                            });
                        });
                        solidityContract.Structs.Add(new Solidity.Struct
                        {
                            Name = contractPart.structDefinition().identifier().GetText(),
                            Variables = variables
                        });
                    }

                    else if (contractPart.modifierDefinition() != null && contractPart.modifierDefinition().GetType() ==
                        typeof(SolidityParser.ModifierDefinitionContext))
                    {
                        var parameters = new List<Solidity.Parameter>();
                        var index = 0;
                        if (contractPart.modifierDefinition().parameterList() != null)
                        {
                            contractPart.modifierDefinition().parameterList().parameter().ToList().ForEach(x =>
                            {
                                index++;
                                parameters.Add(new Solidity.Parameter
                                {
                                    Type = x.typeName().GetText(),
                                    Name = x.identifier().GetText(),
                                    StorageLocation = Enum.Parse<Solidity.StorageLocation>(
                                        contractPart.modifierDefinition().parameterList().parameter(index)
                                            ?.storageLocation()?.GetText() ?? "none", true)
                                });
                            });
                        }

                        solidityContract.Modifiers.Add(new Solidity.Modifier()
                        {
                            Name = contractPart.modifierDefinition().identifier().GetText(), Parameters = parameters
                        });
                    }

                    else if (contractPart.eventDefinition() != null && contractPart.eventDefinition().GetType() ==
                        typeof(SolidityParser.EventDefinitionContext))
                    {
                        var eventDefinition = contractPart.eventDefinition();
                        var parameters = new List<Solidity.EventParameter>();
                        eventDefinition.eventParameterList()?.eventParameter()?.ToList().ForEach(x =>
                            parameters.Add(new Solidity.EventParameter
                            {
                                Type = x.typeName()?.GetText(),
                                Name = x.identifier()?.GetText(),
                                IsIndexed = x.IndexedKeyword()?.GetText() != "indexed"
                            }));

                        solidityContract.Events.Add(new Solidity.Event
                        {
                            Name = eventDefinition.identifier()?.GetText(),
                            EventParameters = parameters,
                            Anonymous = eventDefinition.AnonymousKeyword()?.GetText() == "anonymous"
                        });
                    }

                    else if (contractPart.functionDefinition() != null && contractPart.functionDefinition().GetType() ==
                        typeof(SolidityParser.FunctionDefinitionContext))
                    {
                        var functionDefinition = contractPart.functionDefinition();
                        var parameters = new List<Solidity.Parameter>();
                        var index = 0;
                        if (functionDefinition.parameterList() != null)
                        {
                            functionDefinition.parameterList().parameter().ToList().ForEach(x =>
                            {
                                index++;
                                parameters.Add(new Solidity.Parameter
                                {
                                    Type = x.typeName().GetText(),
                                    Name = x.identifier().GetText(),
                                    StorageLocation = Enum.Parse<Solidity.StorageLocation>(
                                        functionDefinition.parameterList().parameter(index)
                                            ?.storageLocation()?.GetText() ?? "none", true)
                                });
                            });
                        }

                        var returnParameters = new List<Solidity.Parameter>();
                        var returnIndex = 0;
                        if (functionDefinition.returnParameters()?.parameterList() != null)
                        {
                            functionDefinition.returnParameters()?.parameterList()?.parameter().ToList().ForEach(x =>
                            {
                                returnIndex++;
                                parameters.Add(new Solidity.Parameter
                                {
                                    Type = x.typeName()?.GetText(),
                                    Name = x.identifier()?.GetText(),
                                    StorageLocation = Enum.Parse<Solidity.StorageLocation>(
                                        functionDefinition.returnParameters()?.parameterList()?.parameter(returnIndex)
                                            ?.storageLocation()?.GetText() ?? "none", true)
                                });
                            });
                        }
                        
                        var events= new List<string>();
                        if (functionDefinition.block()?.statement() != null && functionDefinition.block()?.statement().GetType()== typeof(SolidityParser.StatementContext[]))
                        {
                            foreach (var body in functionDefinition.block().statement())
                            {
                                if (body?.emitStatement()!=null && body.emitStatement().GetType() == typeof(SolidityParser.EmitStatementContext))
                                {
                                    events.Add(body.emitStatement().functionCall().expression().GetText());
                                }
                            }
                        }

                        var overrides = new List<string>();
                        functionDefinition.modifierList()?.overrideSpecifier()?.ToList()
                            .ForEach(x => overrides.Add(x.userDefinedTypeName().ToString()));
                        var expressions = new List<string>();
                        functionDefinition.modifierList()?.modifierInvocation().FirstOrDefault()?.expressionList()
                            ?.expression()
                            .ToList().ForEach(x => expressions.Add(x.GetText()));

                        var function = new Solidity.Function
                        {
                            Name = functionDefinition.functionDescriptor()?.identifier()?.GetText(),
                            Scope = Enum.Parse<Scope>(
                                functionDefinition.scopeDefinition()?.GetText() ?? "public", true),
                            Parameters = parameters,
                            Events = events,
                            ReturnParameters = returnParameters,
                            HasSideEffects = IsStateful(GetStateMutability(functionDefinition.modifierList()
                                ?.stateMutability().FirstOrDefault()?.GetText())),
                            ModifierList = new Solidity.ModifierList
                            {
                                ModifierInvocation = new Solidity.ModifierInvocation
                                {
                                    Identifier = functionDefinition.modifierList()?.modifierInvocation()
                                        .FirstOrDefault()?.identifier()
                                        .GetText(),
                                    Expressions = expressions
                                },
                                IsVirtual =
                                    functionDefinition.modifierList()?.VirtualKeyword()?.ToString() == "virtual",
                                StateMutability = GetStateMutability(functionDefinition.modifierList()
                                    ?.stateMutability().FirstOrDefault()?.GetText()),
                                Override = overrides,
                            }
                        };
                        solidityContract.IsStateful = IsStateful(function.ModifierList.StateMutability);
                        solidityContract.Functions.Add(function);
                    }

                    else if (contractPart.stateVariableDeclaration() != null && contractPart.stateVariableDeclaration()
                        .GetType() == typeof(SolidityParser.StateVariableDeclarationContext))
                    {
                        var stateVar = contractPart.stateVariableDeclaration();
                        var keywords = new List<string>
                        {
                            stateVar.ConstantKeyword()?.ToString(),
                            stateVar.ImmutableKeyword()?.ToString(),
                            stateVar.InternalKeyword()?.ToString(),
                            stateVar.PrivateKeyword()?.ToString(),
                            stateVar.PublicKeyword()?.ToString()
                        };

                        solidityContract.StateVariables.Add(new Solidity.StateVariable
                        {
                            Name = contractPart.stateVariableDeclaration()?.identifier()?.GetText(),
                            Type = contractPart.stateVariableDeclaration()?.typeName()?.GetText(),
                            Keywords = keywords
                        });
                    }
                }

                Solidity.Contracts.Add(solidityContract);
            }

            return null;
        }

        private Solidity.StateMutability GetStateMutability(string stateText)
        {
            return stateText != null ? Enum.Parse<Solidity.StateMutability>(stateText, true) : Solidity.StateMutability.None;
        }

        private bool IsStateful(Solidity.StateMutability stateMutability)
        {
            return stateMutability switch
            {
                Solidity.StateMutability.View => true,
                Solidity.StateMutability.Pure => true,
                _ => false
            };
        }

        private BlockChainType GetBlockChainType(SolidityParser.SourceUnitContext context)
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