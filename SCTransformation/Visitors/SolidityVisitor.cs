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
            Solidity = new Solidity {Contracts = new List<Solidity.Contract>(), Imports = new List<string>()};
        }
        
        public override object VisitSourceUnit(SolidityParser.SourceUnitContext context)
        {
            var contracts = context.contractDefinition();
            var pragma = context.pragmaDirective(0);
            var imports = context.importDirective();
            Solidity.Pragma = pragma.pragmaName().GetText() +
                              pragma.pragmaValue().GetText();
            if (imports != null)
            {
                foreach (var import in imports)
                {
                    Solidity.Imports.Add(import.StringLiteral().GetText());
                }
            }

            foreach (var contract in contracts)
            {
                var solidityContract = new Solidity.Contract
                {
                    Name = contract.identifier().GetText(),
                    Events = new List<Solidity.Event>(),
                    Enums = new List<Solidity.SolidityEnum>(),
                    Structs = new List<Solidity.Struct>(),
                    Functions = new List<Solidity.Function>(),
                    Modifiers = new List<Solidity.Modifier>(),
                    StateVariables = new List<Solidity.StateVariable>()
                };
                if (contract.GetText().Contains("contract"))
                {
                    solidityContract.ContractType = Solidity.ContractType.Contract;
                }
                else if (contract.GetText().Contains("interface"))
                {
                    solidityContract.ContractType = Solidity.ContractType.Interface;
                }
                else
                {
                    solidityContract.ContractType = Solidity.ContractType.Library;
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
                            {Name = contractPart.enumDefinition().identifier().GetText(), Enums = enums});
                    }

                    else if (contractPart.structDefinition() != null && contractPart.structDefinition().GetType() ==
                        typeof(SolidityParser.StructDefinitionContext))
                    {
                        var variables = new List<Solidity.Variable>();
                        int index = 0;
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
                        solidityContract.Structs.Add(new Solidity.Struct()
                            {Name = contractPart.structDefinition().identifier().GetText(), Variables = variables});
                    }

                    else if (contractPart.modifierDefinition() != null && contractPart.modifierDefinition().GetType() ==
                        typeof(SolidityParser.ModifierDefinitionContext))
                    {
                        var parameters = new List<Solidity.Parameter>();
                        int index = 0;
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
                                        contractPart.modifierDefinition().parameterList()?.parameter(index)
                                            ?.storageLocation()?.GetText() ?? "none", true)
                                });
                            });
                        }

                        solidityContract.Modifiers.Add(new Solidity.Modifier()
                        {
                            Name = contractPart.modifierDefinition().identifier().GetText(), Parameters = parameters
                        });
                    }

                    //TODO:
                    else if (contractPart.constructorDefinition() != null && contractPart.constructorDefinition()
                        .GetType() == typeof(SolidityParser.ConstructorDefinitionContext))
                    {
                    }
                    //TODO:
                    else if (contractPart.eventDefinition() != null && contractPart.eventDefinition().GetType() ==
                        typeof(SolidityParser.EventDefinitionContext))
                    {
                    }
                    //TODO:
                    else if (contractPart.functionDefinition() != null && contractPart.functionDefinition().GetType() ==
                        typeof(SolidityParser.FunctionDefinitionContext))
                    {
                        solidityContract.Functions.Add(new Solidity.Function()
                        {
                            Name = contractPart.functionDefinition()?.identifier()?.GetText() ?? null,
                            Scope = Enum.Parse<Solidity.Scope>(
                                contractPart.functionDefinition().scopeDefinition()?.GetText() ?? "public", true)
                        });
                    }
                    //TODO:
                    else if (contractPart.stateVariableDeclaration() != null && contractPart.stateVariableDeclaration()
                        .GetType() == typeof(SolidityParser.StateVariableDeclarationContext))
                    {
                        solidityContract.StateVariables.Add(new Solidity.StateVariable
                        {
                            Name = contractPart.stateVariableDeclaration()?.identifier()?.GetText() ?? null,
                            Type = contractPart.stateVariableDeclaration().typeName().GetText()
                        });
                    }
                }
                Solidity.Contracts.Add(solidityContract);
            }
            return null;
        }
    }
}