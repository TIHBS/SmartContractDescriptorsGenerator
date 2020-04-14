using System.Collections.Generic;
using SCTransformation.Models;
using SCTransformation.Grammars.Solidity;
using System;

namespace SCTransformation.Visitors
{
    public class SolidityVisitor : SolidityBaseVisitor<object>
    {
        public Solidity Solidity { get; set; }

        public SolidityVisitor()
        {
            Solidity = new Solidity();
            Solidity.Contracts = new List<Solidity.Contract>();
            Solidity.Imports = new List<string>();
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
                Console.ForegroundColor = ConsoleColor.Blue;
                Console.WriteLine(contract.identifier().GetText());
                Console.ForegroundColor = ConsoleColor.White;
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
                    if (contractPart.enumDefinition() != null && contractPart.enumDefinition().GetType().Equals(typeof(SolidityParser.EnumDefinitionContext)))
                    {
                        solidityContract.Enums.Add(new Solidity.SolidityEnum { Name = contractPart.enumDefinition().identifier().GetText(), Enums = new List<string>() });
                    }

                    else if (contractPart.structDefinition() != null && contractPart.structDefinition().GetType().Equals(typeof(SolidityParser.StructDefinitionContext)))
                    {
                        solidityContract.Structs.Add(new Solidity.Struct() { Name = contractPart.structDefinition().identifier().GetText(), Variables = new Dictionary<string, string>() });
                    }

                    else if (contractPart.modifierDefinition() != null && contractPart.modifierDefinition().GetType().Equals(typeof(SolidityParser.ModifierDefinitionContext)))
                    {
                        solidityContract.Modifiers.Add(new Solidity.Modifier() { Name = contractPart.modifierDefinition().identifier().GetText(), Scope = Solidity.Scope.Private });

                    }

                    else if (contractPart.constructorDefinition() != null && contractPart.constructorDefinition().GetType().Equals(typeof(SolidityParser.ConstructorDefinitionContext)))
                    {
                    }

                    else if (contractPart.eventDefinition() != null && contractPart.eventDefinition().GetType().Equals(typeof(SolidityParser.EventDefinitionContext)))
                    {

                    }

                    else if (contractPart.functionDefinition() != null && contractPart.functionDefinition().GetType().Equals(typeof(SolidityParser.FunctionDefinitionContext)))
                    {
                        Console.ForegroundColor = ConsoleColor.Green;
                        Console.WriteLine(contractPart.functionDefinition()?.identifier()?.GetText()??null);
                        Console.ForegroundColor = ConsoleColor.White;
                        solidityContract.Functions.Add(new Solidity.Function() { Name = contractPart.functionDefinition()?.identifier()?.GetText() ?? null, Scope = Solidity.Scope.Private });
                    }
                    else if (contractPart.stateVariableDeclaration() != null && contractPart.stateVariableDeclaration().GetType().Equals(typeof(SolidityParser.StateVariableDeclarationContext)))
                    {
                        solidityContract.StateVariables.Add(new Solidity.StateVariable { Name = contractPart.stateVariableDeclaration().identifier().GetText(), Type = contractPart.stateVariableDeclaration().typeName().GetText() });
                    }

                }

                Solidity.Contracts.Add(solidityContract);
            }
            return null;
        }
    }
}