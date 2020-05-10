using System;
using System.Collections.Generic;
using SCTransformation.Models;
using Antlr4.Runtime;
using SCTransformation.Grammars.Solidity;
using SCTransformation.Visitors;

namespace SCTransformation.Functions
{
    public static class SmartContractDescriptor
    {
        private static T ReadFileTo<T>(string contents) where T : class
        {
            try
            {
                switch (typeof(T).Name)
                {
                    case nameof(Solidity):
                        return ParseSolidity(contents) as T;
                    case nameof(Vyper):
                        return ParseVyper(contents) as T;
                    case nameof(Go):
                        return ParseGo(contents) as T;
                    case nameof(JavaScript):
                        return ParseJavaScript(contents) as T;
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

        private static Solidity ParseSolidity(string contents)
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

        private static Vyper ParseVyper(string contents)
        {
            var stream = new AntlrInputStream(contents);
            return new Vyper();
        }

        private static Go ParseGo(string contents)
        {
            var stream = new AntlrInputStream(contents);
            return new Go();
        }

        private static JavaScript ParseJavaScript(string contents)
        {
            var stream = new AntlrInputStream(contents);
            return new JavaScript();
        }

        public static IEnumerable<Models.SmartContractDescriptor> Transform(string textOfFile, string type)
        {
            switch (type)
            {
                case nameof(Solidity):
                    return SolidityToScd(ReadFileTo<Solidity>(textOfFile));
                case nameof(JavaScript):
                    return JavaScriptToScd(ReadFileTo<JavaScript>(textOfFile));
                case nameof(Go):
                    return GoToScd(ReadFileTo<Go>(textOfFile));
                case nameof(Vyper):
                    return VyperToScd(ReadFileTo<Vyper>(textOfFile));
            }

            return null;
        }


        private static IEnumerable<Models.SmartContractDescriptor> SolidityToScd(Solidity solidity)
        {
            //TODO
            var scdList = new List<Models.SmartContractDescriptor>();
            foreach (var contract in solidity.Contracts)
            {
                var functions = new List<Models.SmartContractDescriptor.Function>();
                var events = new List<Models.SmartContractDescriptor.Event>();
                contract.Functions.ForEach(x => functions.Add(new Models.SmartContractDescriptor.Function
                    {Name = x.Name}));
                contract.Events.ForEach(x => events.Add(new Models.SmartContractDescriptor.Event {Name = x.Name}));
                scdList.Add(new Models.SmartContractDescriptor
                    {Name = contract.Name, ScdlVersion = solidity.Pragma, Functions = functions, Events = events});
            }

            return scdList;
        }

        private static IEnumerable<Models.SmartContractDescriptor> JavaScriptToScd(JavaScript javaScript)
        {
            //TODO:
            return null;
        }

        private static IEnumerable<Models.SmartContractDescriptor> VyperToScd(Vyper vyper)
        {
            //TODO:
            return null;
        }

        private static IEnumerable<Models.SmartContractDescriptor> GoToScd(Go go)
        {
            //TODO;
            return null;
        }
    }
}