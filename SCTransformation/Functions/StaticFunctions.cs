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
            string contents = null;
            try
            {
                contents = File.ReadAllText(filePath);
                var stream = new AntlrInputStream(contents);
                SolidityLexer lexer= new SolidityLexer(stream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                SolidityParser parser = new SolidityParser(commonTokenStream);
                var tree = parser.sourceUnit();
                SolidityVisitor visitor = new SolidityVisitor();
                visitor.VisitSourceUnit(tree);
                return visitor.Solidity as T;
            }
            catch (Exception e)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e);
                Console.ForegroundColor = ConsoleColor.White;
            }
            
            switch (typeof(T).Name)
            {
                case nameof(CSharp):
                    return CSharpParser.ParseFromString(contents) as T;
                case nameof(CPP):
                    return CPPFromFile(contents) as T;
                case nameof(Java):
                    return JavaParser.ParseFromString(contents) as T;
                case nameof(LLL):
                    return LLLFromFile(contents) as T;
                case nameof(Solidity):
                    return CustomSolidityParser.ParseFromString(contents) as T;
                case nameof(Vyper):
                    return VyperParser.ParseFromString(contents) as T;
                default:
                    return null;
            }
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
        
        public static CPP CPPFromFile(string contents)
        {
            return new CPP { };
        }

        public static LLL LLLFromFile(string contents)
        {
            return new LLL { };
        }

        static void Main(string[] args)
        {
            Solidity solidity = ReadFileTo<Solidity>();
        }

        public static List<string> ExtractWords(string str)
        {
            var singleSpaceStr = new string(str.SkipWhile(p => p.Equals(' ')).ToArray())
                .Replace(Environment.NewLine, " ").Replace("\r", " ");
            var words = new List<string>();

            foreach (var word in singleSpaceStr.Split(' '))
            {
                if (!string.IsNullOrEmpty(word))
                {
                    words.Add(word);
                }
            }
            return words;
        }
    }
}