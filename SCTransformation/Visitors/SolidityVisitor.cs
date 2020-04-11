using System.Collections.Generic;
using SCTransformation.Models;
using SCTransformation.Grammars.Solidity;

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
                    }else if (contract.GetText().Contains("interface"))
                    {
                        solidityContract.ContractType = Solidity.ContractType.Interface;
                    }
                    else
                    {
                        solidityContract.ContractType = Solidity.ContractType.Library;
                    }
                    Solidity.Contracts.Add(solidityContract);
            }
            return null;
        }
    }
}