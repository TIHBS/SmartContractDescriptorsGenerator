using System;
using System.Collections.Generic;
using SCTransformation.Models;
using SCTransformation.Grammars;
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
            Solidity.Interfaces = new List<Solidity.Interface>();
        }
        public override object VisitSourceUnit(SolidityParser.SourceUnitContext context)
        {
            var contract = context.contractDefinition();
            var pragma = context.pragmaDirective();
            Solidity.Pragma = pragma.pragmaName().GetText() +
                             pragma.pragmaValue().GetText();
            Solidity.Contracts.Add(new Solidity.Contract{Name = contract.identifier().GetText()});
            return null;
        }
    }
}