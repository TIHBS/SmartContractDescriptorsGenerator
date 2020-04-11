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
                    var contractPartText = contractPart.GetText();
                    if (contractPartText.StartsWith("enum"))
                    {
                        solidityContract.Enums.Add(new Solidity.SolidityEnum { Name = contractPart.enumDefinition().identifier().GetText(), Enums = new List<string>() });
                    }

                    else if (contractPartText.StartsWith("struct"))
                    {
                        solidityContract.Structs.Add(new Solidity.Struct() { Name = contractPart.structDefinition().identifier().GetText(), Variables = new Dictionary<string, string>() });
                    }

                    else if (contractPartText.StartsWith("modifier"))
                    {
                        solidityContract.Modifiers.Add(new Solidity.Modifier() { Name = contractPart.modifierDefinition().identifier().GetText(), Scope = Solidity.Scope.Private});

                    }

                    else if (contractPartText.StartsWith("constructor"))
                    {
                    }

                    else if (contractPartText.StartsWith("event"))
                    {
                    }

                    else if (contractPartText.StartsWith("function"))
                    {
                        solidityContract.Functions.Add(new Solidity.Function() { Name = contractPart.functionDefinition().identifier().GetText(), Scope = Solidity.Scope.Private});
                    }

                }

                Solidity.Contracts.Add(solidityContract);
            }
            return null;
        }
    }
}