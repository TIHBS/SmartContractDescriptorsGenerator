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
        public static T ReadFileTo<T>(string filePath = Constants.SolidityInPath) where T : class
        {
            try
            {
                string contents = File.ReadAllText(filePath);

                switch (typeof(T).Name)
                {
                    case nameof(CSharp):
                        return ParseCSharp(contents) as T;
                    case nameof(CPP):
                        return ParseCPP(contents) as T;
                    case nameof(Java):
                        return ParseJava(contents) as T;
                    case nameof(LLL):
                        return ParseLLL(contents) as T;
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

        public static bool WriteFileIn(string filePath, object obj)
        {
            try
            {
                File.WriteAllText(filePath, JsonConvert.SerializeObject(obj));
                return true;
            }
            catch (Exception e)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e);
                Console.ForegroundColor = ConsoleColor.White;
            }

            return false;
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
        public static CPP ParseCPP(string contents)
        {
            return new CPP { };
        }

        public static LLL ParseLLL(string contents)
        {
            return new LLL { };
        }

        public static CSharp ParseCSharp(string contents)
        {
            return new CSharp { };
        }

        public static Java ParseJava(string contents)
        {
            return new Java { };
        }

        public static Vyper ParseVyper(string contents)
        {
            return new Vyper { };
        }

        static void Main(string[] args)
        {
            Solidity solidity = ReadFileTo<Solidity>();
        }
    }
}