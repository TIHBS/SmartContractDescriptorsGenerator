using System.Collections.Generic;
using Antlr4.Runtime;
using SCTransformation.Models;

namespace SCTransformation.Functions
{
    public class SolidityParser
    {
        public static Solidity ParseFromString(string contents)
        {
            var words = StaticFunctions.ExtractWords(contents);
            
            var solidity = new Solidity
            {
                Contracts = new List<Solidity.Contract>(),
                Imports = new List<string>(),
                Interfaces = new List<Solidity.Interface>()
            };
            for (var i = 0; i < words.Count; i++)
            {
                if (words[i].Equals("pragma"))
                {
                    solidity.Pragma = string.Join(" ", words.GetRange(i + 1, words.FindIndex(p => p.Contains(";"))));
                }

                if (words[i].Equals("import"))
                {
                    solidity.Imports.Add(string.Join(" ",
                        words.GetRange(i + 1, words.FindIndex(p => p.Contains(";")))));
                }

                if (words[i].Equals("contract"))
                {
                    var x = TextBetween(words.GetRange(i + 1, words.Count - (i+1)).ToArray());
                    var solidityContract = GetContract(x);
                    solidity.Contracts.Add(solidityContract);
                }

                if (words[i].Equals("interface"))
                {
                    var x = TextBetween(words.GetRange(i + 1, words.Count - (i+1)).ToArray());
                    var solidityInterface = GetInterface(x);
                    solidity.Interfaces.Add(solidityInterface);
                }
            }

            return solidity;
        }
        
        private static Solidity.Contract GetContract(IEnumerable<string> list)
        {
            foreach (var word in list)
            {
                if (word.Equals(""))
                {
                    
                }
            }
            return new Solidity.Contract();
        }
        
        private static Solidity.Interface GetInterface(IEnumerable<string> list)
        {
            return new Solidity.Interface();
        }

        private static IEnumerable<string> TextBetween(IEnumerable<string> list)
        {
            var returnList = new List<string>();
            foreach (var t in list)
            {
                if (t.Equals("contract")||t.Equals("interface"))
                {
                    return returnList;
                }

                returnList.Add(t);
            }

            return returnList;
        }
    }
}