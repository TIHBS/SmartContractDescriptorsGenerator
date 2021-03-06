using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text.RegularExpressions;
using Antlr4.StringTemplate;
using Newtonsoft.Json;
using SCTransformation.Helpers;
using SCTransformation.Models;

namespace SCTransformation
{
    public static class ClientApplicationGenerator
    {
        private static readonly string ApplicationDirectory =
            $"{Environment.GetFolderPath(Environment.SpecialFolder.UserProfile)}/client_application";

        private static string BuildJavaApplication(SmartContractDescriptor smartContractDescriptor,
            string packageName, string callbackUrl)
        {
            var files = new List<KeyValuePair<string, string>>();
            var assembly = Assembly.GetExecutingAssembly();
            var paths = assembly.GetManifestResourceNames();
            var controllerHeader = string.Empty;
            var controllerFunctions = string.Empty;
            var controllerEvents = string.Empty;
            var controllerFooter = string.Empty;
            foreach (var path in paths)
            {
                var stream = assembly.GetManifestResourceStream(path);
                if (stream != null)
                {
                    if (path.Contains("FunctionParameter"))
                    {
                        var smartContractPath = path.Replace("smartcontract", smartContractDescriptor.Name.ToLower());
                        foreach (var function in smartContractDescriptor.Functions)
                        {
                            var tempPath = smartContractPath.Replace("Function", ToUpperFirstLetter(function.Name));

                            var functionTemplate = CreateFreshTemplate(stream, smartContractDescriptor, packageName,
                                callbackUrl);
                            functionTemplate.Add("functionParameterName", ToUpperFirstLetter(function.Name));
                            foreach (var parameter in function.Inputs)
                            {
                                functionTemplate.Add("parameterarray",
                                    new[] {parameter.Name});
                            }

                            files.Add(new KeyValuePair<string, string>(CreateDirectory(tempPath, packageName),
                                Regex.Escape(functionTemplate.Render())));
                        }

                        continue;
                    }

                    if (path.Contains("ControllerHeader"))
                    {
                        var template = CreateFreshTemplate(stream, smartContractDescriptor, packageName,
                            callbackUrl);
                        controllerHeader = template.Render();
                        continue;
                    }

                    if (path.Contains("ControllerFunctions"))
                    {
                        foreach (var function in smartContractDescriptor.Functions)
                        {
                            var template = CreateFreshTemplate(stream, smartContractDescriptor, packageName,
                                callbackUrl);
                            template.Add("functionParameter", ToUpperFirstLetter(function.Name));
                            var privateFunction = new Function
                            {
                                Name = function.Name,
                                FirstCapital = ToUpperFirstLetter(function.Name)
                            };
                            template.Add("functionArray", new[] {privateFunction});
                            foreach (var parameter in function.Inputs)
                            {
                                var privateParameter = new Parameter
                                {
                                    FirstCapital = ToUpperFirstLetter(parameter.Name),
                                    Name = parameter.Name,
                                    ParamType = parameter.Type
                                };
                                template.Add("inputparameterarray",
                                    new[] {privateParameter});
                            }

                            foreach (var parameter in function.Outputs)
                            {
                                var privateParameter = new Parameter
                                {
                                    FirstCapital = ToUpperFirstLetter(parameter.Name),
                                    Name = parameter.Name,
                                    ParamType = parameter.Type
                                };
                                template.Add("outputparameterarray", new[] {privateParameter});
                            }

                            controllerFunctions += template.Render();
                        }

                        continue;
                    }

                    if (path.Contains("ControllerEvents"))
                    {
                        foreach (var scEvent in smartContractDescriptor.Events)
                        {
                            var template = CreateFreshTemplate(stream, smartContractDescriptor, packageName,
                                callbackUrl);
                            var privateEvent = new Event
                            {
                                Name = scEvent.Name,
                                FirstCapital = ToUpperFirstLetter(scEvent.Name)
                            };
                            template.Add("eventArray", new[] {privateEvent});
                            foreach (var parameter in scEvent.Outputs)
                            {
                                var privateParameter = new Parameter
                                {
                                    FirstCapital = ToUpperFirstLetter(parameter.Name),
                                    Name = parameter.Name,
                                    ParamType = parameter.Type
                                };
                                template.Add("eventoutputparameterarray", new[] {privateParameter});
                            }

                            controllerEvents += template.Render();
                        }

                        continue;
                    }

                    if (path.Contains("ControllerFooter"))
                    {
                        var template = CreateFreshTemplate(stream, smartContractDescriptor, packageName,
                            callbackUrl);
                        controllerFooter = template.Render();
                        continue;
                    }

                    if (path.Contains("SmartContract"))
                    {
                        var smartContractPath = path.Replace("smartcontract", smartContractDescriptor.Name.ToLower());
                        smartContractPath = smartContractPath.Replace("SmartContract",
                            ToUpperFirstLetter(smartContractDescriptor.Name));
                        files.Add(new KeyValuePair<string, string>(CreateDirectory(smartContractPath, packageName),
                            Regex.Escape(
                                $"{controllerHeader}{controllerFunctions}{controllerEvents}{controllerFooter}")));
                        continue;
                    }

                    files.Add(new KeyValuePair<string, string>(CreateDirectory(path, packageName),
                        Regex.Escape(CreateFreshTemplate(stream, smartContractDescriptor, packageName, callbackUrl)
                            .Render())));
                }
            }

            return WriteFiles(files) ? ApplicationDirectory : "Something went wrong";
        }

        private static Template CreateFreshTemplate(Stream stream, SmartContractDescriptor smartContractDescriptor,
            string packageName, string callbackUrl)
        {
            var reader = new StreamReader(stream);
            var template = new Template(reader.ReadToEnd(), '€', '€');
            stream.Position = 0;
            template.Add("packageName", packageName);
            template.Add("sclAddress", smartContractDescriptor.SclAddress);
            template.Add("callbackUrl", callbackUrl);
            template.Add("contractPackageName", smartContractDescriptor.Name.ToLower());
            template.Add("contractName", ToUpperFirstLetter(smartContractDescriptor.Name));
            return template;
        }

        private static string CreateDirectory(string path, string packageName)
        {
            Directory.CreateDirectory(ApplicationDirectory);
            if (path.ToLower().Contains("pom.xml"))
            {
                return $"{ApplicationDirectory}/pom.xml";
            }

            var sourceDirectory = $"{ApplicationDirectory}/src/main/java/";
            if (packageName.Contains("."))
            {
                var packageFolders = packageName.Split(".");
                foreach (var package in packageFolders)
                {
                    sourceDirectory += $"{package}/";
                }
            }
            else
            {
                sourceDirectory += $"{packageName}/";
            }

            sourceDirectory += $"client_application/";
            var pathParts = path.Split(".").Skip(3).ToArray();
            var length = pathParts.Length;
            for (var i = 0; i < length - 3; i++)
            {
                sourceDirectory += $"{pathParts[i]}/";
            }

            Directory.CreateDirectory(sourceDirectory);
            sourceDirectory += $"{pathParts[length - 3]}.{pathParts[length - 2]}";
            return $"{sourceDirectory}";
        }

        private static bool WriteFiles(IEnumerable<KeyValuePair<string, string>> files)
        {
            foreach (var (path, renderedTemplate) in files)
            {
                if (File.Exists(path))
                {
                    File.Delete(path);
                }

                using (File.Create(path))
                {
                }

                Console.WriteLine(path);
                File.WriteAllText(path, Regex.Unescape(renderedTemplate));
            }

            return true;
        }

        public static string Build(string textOfFile, string packageName, string callbackUrl)
        {
            try
            {
                var smartContractDescriptor = JsonConvert.DeserializeObject<SmartContractDescriptor>(textOfFile);
                return BuildJavaApplication(smartContractDescriptor, packageName, callbackUrl);
            }
            catch (Exception)
            {
                return Constants.ErrorBuildingApp;
            }
        }

        private class Parameter
        {
            public string Name;
            public string FirstCapital;
            public string ParamType;
        }

        private class Function
        {
            public string Name;
            public string FirstCapital;
        }

        private class Event
        {
            public string Name;
            public string FirstCapital;
        }

        private static string ToUpperFirstLetter(string source)
        {
            if (string.IsNullOrEmpty(source))
            {
                return string.Empty;
            }

            var letters = source.ToCharArray();
            letters[0] = char.ToUpper(letters[0]);
            return new string(letters);
        }
    }
}