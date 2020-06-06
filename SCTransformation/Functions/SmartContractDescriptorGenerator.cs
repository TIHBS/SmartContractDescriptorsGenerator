using System;
using System.Collections.Generic;
using SCTransformation.Models;
using Antlr4.Runtime;
using SCTransformation.Grammars.Go;
using SCTransformation.Grammars.JavaScript;
using SCTransformation.Grammars.Solidity;
using SCTransformation.Visitors;

namespace SCTransformation.Functions
{
    public static class SmartContractDescriptorGenerator
    {
        private static T ReadFileTo<T>(string contents) where T : class
        {
            try
            {
                switch (typeof(T).Name)
                {
                    case nameof(Solidity):
                        return ParseSolidity(contents) as T;
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

        private static Go ParseGo(string contents)
        {
            var stream = new AntlrInputStream(contents);
            GoLexer lexer = new GoLexer(stream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            GoParser parser = new GoParser(commonTokenStream);
            var tree = parser.sourceFile();
            GoVisitor visitor = new GoVisitor();
            visitor.VisitSourceFile(tree);
            return visitor.Go;
        }

        private static JavaScript ParseJavaScript(string contents)
        {
            var stream = new AntlrInputStream(contents);
            JavaScriptLexer lexer = new JavaScriptLexer(stream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            JavaScriptParser parser = new JavaScriptParser(commonTokenStream);
            var tree = parser.program();
            JavaScriptVisitor visitor = new JavaScriptVisitor();
            visitor.VisitProgram(tree);
            return visitor.JavaScript;
        }

        public static IEnumerable<SmartContractDescriptor> Transform(string textOfFile, string type)
        {
            switch (type)
            {
                case nameof(Solidity):
                    return SolidityToScd(ReadFileTo<Solidity>(textOfFile));
                case nameof(JavaScript):
                    return JavaScriptToScd(ReadFileTo<JavaScript>(textOfFile));
                case nameof(Go):
                    return GoToScd(ReadFileTo<Go>(textOfFile));
            }

            return null;
        }


        private static IEnumerable<SmartContractDescriptor> SolidityToScd(Solidity solidity)
        {
            //TODO
            var scdList = new List<SmartContractDescriptor>();
            foreach (var contract in solidity.Contracts)
            {
                var functions = new List<SmartContractDescriptor.Function>();
                var events = new List<SmartContractDescriptor.Event>();
                contract.Functions.ForEach(x => functions.Add(new SmartContractDescriptor.Function
                    {Name = x.Name}));
                contract.Events.ForEach(x => events.Add(new SmartContractDescriptor.Event {Name = x.Name}));
                scdList.Add(new SmartContractDescriptor
                    {Name = contract.Name, ScdlVersion = solidity.Pragma, Functions = functions, Events = events});
            }

            return scdList;
        }

        private static IEnumerable<SmartContractDescriptor> JavaScriptToScd(JavaScript javaScript)
        {
            //TODO:
            return null;
        }

        private static IEnumerable<SmartContractDescriptor> GoToScd(Go go)
        {
            //TODO;
            return null;
        }
    }
}