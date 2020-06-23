using System;
using System.Collections.Generic;
using System.Security.Cryptography;
using System.Text;
using Antlr4.Runtime;
using SCTransformation.Grammars.Go;
using SCTransformation.Grammars.JavaScript;
using SCTransformation.Grammars.Solidity;
using SCTransformation.Helpers;
using SCTransformation.Models;
using SCTransformation.Visitors;

namespace SCTransformation
{
    public static class SmartContractDescriptorGenerator
    {
        private static T ReadFileTo<T>(string contents) where T : class
        {
            return typeof(T).Name switch
            {
                nameof(Solidity) => ParseSolidity(contents) as T,
                nameof(Go) => ParseGo(contents) as T,
                nameof(JavaScript) => ParseJavaScript(contents) as T,
                _ => null
            };
        }

        public static Solidity ParseSolidity(string contents)
        {
            var stream = new AntlrInputStream(contents);
            var lexer = new SolidityLexer(stream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new SolidityParser(commonTokenStream);
            var tree = parser.sourceUnit();
            var visitor = new SolidityVisitor();
            visitor.VisitSourceUnit(tree);
            var solidity = visitor.Solidity;
            solidity.RawFileContent = contents;
            return solidity;
        }

        public static Go ParseGo(string contents)
        {
            var stream = new AntlrInputStream(contents);
            var lexer = new GoLexer(stream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new GoParser(commonTokenStream);
            var tree = parser.sourceFile();
            var visitor = new GoVisitor();
            visitor.VisitSourceFile(tree);
            var go = visitor.Go;
            go.RawFileContent = contents;
            return go;
        }

        public static JavaScript ParseJavaScript(string contents)
        {
            var stream = new AntlrInputStream(contents);
            var lexer = new JavaScriptLexer(stream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new JavaScriptParser(commonTokenStream);
            var tree = parser.program();
            var visitor = new JavaScriptVisitor();
            visitor.VisitProgram(tree);
            var javaScript = visitor.JavaScript;
            javaScript.RawFileContent = contents;
            return javaScript;
        }

        /// <summary>
        /// Transform given smart contract content <paramref name="textOfFile"/>
        /// and type <paramref name="type"/> {Solidity, JavaScript, Go} (Case sensitive) to Smart contract Descriptor
        /// </summary>
        /// <param name="textOfFile"></param>
        /// <param name="type"></param>
        /// <returns></returns>
        public static IEnumerable<SmartContractDescriptor> Transform(string textOfFile, string type)
        {
            return type switch
            {
                nameof(Solidity) => SolidityToScd(ReadFileTo<Solidity>(textOfFile)),
                nameof(JavaScript) => JavaScriptToScd(ReadFileTo<JavaScript>(textOfFile)),
                nameof(Go) => GoToScd(ReadFileTo<Go>(textOfFile)),
                _ => null
            };
        }

        private static string ComputeSha256Hash(string rawData)
        {
            using var sha256Hash = SHA256.Create();
            var bytes = sha256Hash.ComputeHash(Encoding.UTF8.GetBytes(rawData));

            var builder = new StringBuilder();
            foreach (var t in bytes)
            {
                builder.Append(t.ToString("x2"));
            }

            return builder.ToString();
        }

        private static IEnumerable<SmartContractDescriptor> SolidityToScd(Solidity solidity)
        {
            //TODO: description, author
            var scdList = new List<SmartContractDescriptor>();
            foreach (var contract in solidity.Contracts)
            {
                var functions = new List<SmartContractDescriptor.Function>();
                var events = new List<SmartContractDescriptor.Event>();
                foreach (var function in contract.Functions)
                {
                    var inputs = new List<SmartContractDescriptor.Parameter>();
                    var outputs = new List<SmartContractDescriptor.Parameter>();
                    foreach (var input in function.Parameters)
                    {
                        inputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = input.Name,
                            Type = input.Type,
                            IsIndexed = false
                        });
                    }

                    foreach (var output in function.ReturnParameters)
                    {
                        outputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = output.Name,
                            Type = output.Type,
                            IsIndexed = false
                        });
                    }

                    functions.Add(new SmartContractDescriptor.Function
                    {
                        Name = function.Name,
                        Description = string.Empty,
                        Dispatcher = "", //TODO: 
                        Events = new List<string>(), //TODO:
                        HasSideEffects = false, //TODO:
                        Inputs = inputs,
                        Outputs = outputs,
                        Scope = function.Scope
                    });
                }

                foreach (var contractEvent in contract.Events)
                {
                    var outputs = new List<SmartContractDescriptor.Parameter>();
                    foreach (var output in contractEvent.EventParameters)
                    {
                        outputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = output.Name,
                            Type = output.Type,
                            IsIndexed = output.IsIndexed
                        });
                    }

                    events.Add(new SmartContractDescriptor.Event
                    {
                        Name = contractEvent.Name,
                        Description = string.Empty,
                        Outputs = outputs
                    });
                }

                scdList.Add(new SmartContractDescriptor
                {
                    ScdlVersion = Constants.ScdlVersion,
                    Name = contract.Name,
                    Version = "1.0",
                    LatestUrl = null,
                    Description = contract.Name,
                    Author = string.Empty,
                    CreatedOn = DateTime.UtcNow,
                    UpdatedOn = DateTime.UtcNow,
                    LifeCycle = LifeCycle.Ready,
                    SclAddress = null,
                    BlockChainType = solidity.BlockChainType,
                    BlockChainVersion = string.Empty,
                    InternalAddress = string.Empty,
                    MetaData = null,
                    Hash = ComputeSha256Hash(solidity.RawFileContent),
                    IsStateful = contract.IsStateful,
                    ContractLanguage = Constants.Solidity,
                    ContractLanguageVersion = solidity.Pragma,
                    Functions = functions,
                    Events = events
                });
            }

            return scdList;
        }

        private static IEnumerable<SmartContractDescriptor> JavaScriptToScd(JavaScript javaScript)
        {
            //TODO: description, author
            var functions = new List<SmartContractDescriptor.Function>();
            var events = new List<SmartContractDescriptor.Event>();
            var methods = javaScript.JavaScriptClass.Methods;
            methods.AddRange(javaScript.Functions);
            foreach (var function in methods)
            {
                if (function.EventName != null)
                {
                    var inputs = new List<SmartContractDescriptor.Parameter>();
                    var outputs = new List<SmartContractDescriptor.Parameter>();
                    foreach (var input in function.Inputs)
                    {
                        inputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = input.Name,
                            Type = input.Type,
                            IsIndexed = false
                        });
                    }

                    foreach (var output in function.Outputs)
                    {
                        outputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = output.Name,
                            Type = output.Type,
                            IsIndexed = false
                        });
                    }

                    functions.Add(new SmartContractDescriptor.Function
                    {
                        Name = function.Name,
                        Description = string.Empty,
                        Dispatcher = "", //TODO: 
                        Events = new List<string>(), //TODO:
                        HasSideEffects = false, //TODO:
                        Inputs = inputs,
                        Outputs = outputs,
                        Scope = Scope.Public
                    });
                }
                else
                {
                    var outputs = new List<SmartContractDescriptor.Parameter>();
                    foreach (var output in function.Outputs)
                    {
                        outputs.Add(new SmartContractDescriptor.Parameter
                        {
                            Name = output.Name,
                            Type = output.Type,
                            IsIndexed = false
                        });
                    }

                    events.Add(new SmartContractDescriptor.Event
                    {
                        Name = function.Name,
                        Description = string.Empty,
                        Outputs = outputs
                    });
                }
            }

            var scdList = new List<SmartContractDescriptor>
            {
                new SmartContractDescriptor
                {
                    ScdlVersion = Constants.ScdlVersion,
                    Name = javaScript.JavaScriptClass.Name,
                    Version = "1.0",
                    LatestUrl = null,
                    Description = javaScript.JavaScriptClass.Name,
                    Author = string.Empty,
                    CreatedOn = DateTime.UtcNow,
                    UpdatedOn = DateTime.UtcNow,
                    LifeCycle = LifeCycle.Ready,
                    SclAddress = null,
                    BlockChainType = javaScript.BlockChainType,
                    BlockChainVersion = string.Empty,
                    InternalAddress = string.Empty,
                    MetaData = null,
                    Hash = ComputeSha256Hash(javaScript.RawFileContent),
                    IsStateful = javaScript.IsStateful,
                    ContractLanguage = Constants.JavaScript,
                    ContractLanguageVersion = string.Empty,
                    Functions = functions,
                    Events = events
                }
            };
            return scdList;
        }

        private static IEnumerable<SmartContractDescriptor> GoToScd(Go go)
        {
            //TODO: description, author
            var functions = new List<SmartContractDescriptor.Function>();
            var events = new List<SmartContractDescriptor.Event>();
            foreach (var function in go.Functions)
            {
                var inputs = new List<SmartContractDescriptor.Parameter>();
                var outputs = new List<SmartContractDescriptor.Parameter>();
                foreach (var input in function.Inputs)
                {
                    inputs.Add(new SmartContractDescriptor.Parameter
                    {
                        Name = input.Name,
                        Type = input.Type,
                        IsIndexed = false
                    });
                }

                foreach (var output in function.Returns)
                {
                    outputs.Add(new SmartContractDescriptor.Parameter
                    {
                        Name = output.Name,
                        Type = output.Type,
                        IsIndexed = false
                    });
                }

                functions.Add(new SmartContractDescriptor.Function
                {
                    Name = function.Name,
                    Description = string.Empty,
                    Dispatcher = "", //TODO: 
                    Events = new List<string>(), //TODO:
                    HasSideEffects = false, //TODO:
                    Inputs = inputs,
                    Outputs = outputs,
                    Scope = Scope.Public
                });
            }

            var scdList = new List<SmartContractDescriptor>
            {
                new SmartContractDescriptor
                {
                    ScdlVersion = Constants.ScdlVersion,
                    Name = go.PackageName,
                    Version = "1.0",
                    LatestUrl = null,
                    Description = go.PackageName,
                    Author = string.Empty,
                    CreatedOn = DateTime.Now,
                    UpdatedOn = DateTime.Now,
                    LifeCycle = LifeCycle.Ready,
                    SclAddress = null,
                    BlockChainType = go.BlockChainType,
                    BlockChainVersion = string.Empty,
                    InternalAddress = string.Empty,
                    MetaData = null,
                    Hash = ComputeSha256Hash(go.RawFileContent),
                    IsStateful = false,
                    ContractLanguage = Constants.Go,
                    ContractLanguageVersion = string.Empty,
                    Functions = functions,
                    Events = events
                }
            };
            return scdList;
        }
    }
}