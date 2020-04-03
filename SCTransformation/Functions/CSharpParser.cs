using System;
using System.Collections.Generic;
using System.Linq;
using SCTransformation.Models;

namespace SCTransformation.Functions
{
    public class CSharpParser
    {
        public static CSharp ParseFromString(string contents)
        {
            var words = StaticFunctions.ExtractWords(contents);

            var cSharp = new CSharp
            {
                Usings = new List<string>(),
                Classes = new List<CSharp.Class>(),
                Interfaces = new List<CSharp.Interface>()
            };
            var methods = new List<CSharp.Method>();
            for (var i = 0; i < words.Count; i++)
            {
                if (words[i].Equals("using"))
                {
                    cSharp.Usings.Add(words[i + 1]);
                }

                if (words[i].Equals("namespace"))
                {
                    cSharp.NameSpace = words[i + 1];
                }

                if (words[i].Equals("class"))
                {
                    var classTemp = new CSharp.Class {ClassName = words[i + 1]};
                    if (Enum.IsDefined(typeof(CSharp.AccessSpecifier),
                        words[i - 1].First().ToString().ToUpper() + words[i - 1].Substring(1)))
                    {
                        classTemp.AccessSpecifier = Enum.Parse<CSharp.AccessSpecifier>(words[i - 1], true);
                    }
                    //else if (words[i-1].Equals("abstract"))
                    //{
                    //    classTemp.AccessSpecifier = Enum.Parse<CSharp.AccessSpecifier>(words[i - 1], true);
                    //}

                    cSharp.Classes.Add(classTemp);
                }
                else if (words[i].Equals("interface"))
                {
                    var interfaceTemp = new CSharp.Interface {InterfaceName = words[i + 1]};

                    if (Enum.IsDefined(typeof(CSharp.AccessSpecifier),
                        words[i - 1].First().ToString().ToUpper() + words[i - 1].Substring(1)))
                    {
                        interfaceTemp.AccessSpecifier = Enum.Parse<CSharp.AccessSpecifier>(words[i - 1], true);
                    }

                    cSharp.Interfaces.Add(interfaceTemp);
                }

                // else if (words[i + 1].Equals("abstract"))
                // {
                //     cSharp.Interfaces.Add(new CSharp.Interface
                //     {
                //         AccessSpecifier = Enum.Parse<CSharp.AccessSpecifier>(words[i],true),
                //         Methods = methods
                //     });
                // }
            }

            return cSharp;
        }
    }
}