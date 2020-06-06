using System;
using System.Collections.Generic;
using System.IO;
using System.Reflection;
using System.Text.RegularExpressions;
using Antlr4.StringTemplate;
using Newtonsoft.Json;
using SCTransformation.Models;

namespace SCTransformation.Functions
{
    public static class ClientApplicationGenerator
    {
        private static string _applicationDirectory =
            $"{Environment.GetFolderPath(Environment.SpecialFolder.UserProfile)}/client_application";

        //TODO: Delete
        public static void Main(string[] args)
        {
            var functions = new List<SmartContractDescriptor.Function>
                {new SmartContractDescriptor.Function {Name = "Function1"}};
            BuildJavaApplication(new SmartContractDescriptor
                {Author = "Umut", Functions = functions}, "com.artuvan");
        }

        private static string BuildJavaApplication(SmartContractDescriptor smartContractDescriptor,
            string packageName)
        {
            var files = new List<KeyValuePair<string, string>>();
            var assembly = Assembly.GetExecutingAssembly();
            var paths = assembly.GetManifestResourceNames();
            foreach (var path in paths)
            {
                var stream = assembly.GetManifestResourceStream(path);
                if (stream != null)
                {
                    var reader = new StreamReader(stream);
                    var template = new Template(reader.ReadToEnd(), '€', '€');
                    template.Add("packageName", packageName);
                    template.Add("url", smartContractDescriptor.LatestUrl);
                    template.Add("scAddress", smartContractDescriptor.SclAddress);
                    //TODO:
                    files.Add(new KeyValuePair<string, string>(CreateDirectory(path, packageName),
                        Regex.Escape(template.Render())));
                }

                Console.WriteLine(path);
            }

            return WriteFiles(files) ? _applicationDirectory : "Something went wrong";
        }

        private static string CreateDirectory(string path, string packageName)
        {
            Directory.CreateDirectory(_applicationDirectory);
            if (path.ToLower().Contains("pom.xml"))
            {
                return $"{_applicationDirectory}/pom.xml";
            }

            var sourceDirectory = $"{_applicationDirectory}/src/main/java/{packageName}";
            //TODO:
            return $"{sourceDirectory}/";
        }

        private static bool WriteFiles(IEnumerable<KeyValuePair<string, string>> files)
        {
            try
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

                    File.WriteAllText(path, Regex.Unescape(renderedTemplate));
                }

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

        public static string Build(string textOfFile, string packageName)
        {
            try
            {
                var smartContractDescriptor = JsonConvert.DeserializeObject<SmartContractDescriptor>(textOfFile);
                return BuildJavaApplication(smartContractDescriptor, packageName);
            }
            catch (Exception e)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e);
                Console.ForegroundColor = ConsoleColor.White;
            }

            return string.Empty;
        }
    }
}