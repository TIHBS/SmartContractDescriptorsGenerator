using System;
using System.Collections.Generic;
using System.IO;
using SCTransformation.Helpers;
using SCTransformation.Models;
using System.Linq;
using System.Runtime.Versioning;
using Antlr4.Runtime;
using Newtonsoft.Json;
using SCTransformation.Grammars.Solidity;
using SCTransformation.Visitors;

namespace SCTransformation.Functions
{
    public static class StaticFunctions
    {
        public static T ReadFileTo<T>(string contents) where T : class
        {
            try
            {
                switch (typeof(T).Name)
                {
                    case nameof(Solidity):
                        return ParseSolidity(contents) as T;
                    case nameof(Vyper):
                        return ParseVyper(contents) as T;
                }
            }
            catch (Exception e)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e);
                Console.ForegroundColor = ConsoleColor.White;
            }

            return null;
        }

        public static Solidity ParseSolidity(string contents)
        {
            var stream = new AntlrInputStream(contents);
            SolidityLexer lexer = new SolidityLexer(stream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            SolidityParser parser = new SolidityParser(commonTokenStream);
            var tree = parser.sourceUnit();
            SolidityVisitor visitor = new SolidityVisitor();
            visitor.VisitSourceUnit(tree);
            return visitor.Solidity;
        }

        public static Vyper ParseVyper(string contents)
        {
            return new Vyper { };
        }

        public static IEnumerable<SmartContractDescriptor> Transform(string textOfFile, string type)
        {
            switch (type)
            {
                case nameof(Solidity):
                    var solidity = ReadFileTo<Solidity>(textOfFile);
                    var scdList = new List<SmartContractDescriptor>();
                    //TODO:
                    foreach (var contract in solidity.Contracts)
                    {
                        var functions = new List<SmartContractDescriptor.Function>();
                        contract.Functions.ForEach(x => functions.Add(new SmartContractDescriptor.Function {Name = x.Name}));
                        scdList.Add(new SmartContractDescriptor {ScdlVersion = solidity.Pragma, Functions = functions});
                    }
                    return scdList;
            }
            return null;
        }
    }
}