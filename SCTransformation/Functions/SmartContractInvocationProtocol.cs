using System;
using System.Collections.Generic;
using System.IO;
using System.Reflection;
using System.Runtime.InteropServices;
using System.Text.RegularExpressions;
using Antlr4.StringTemplate;
using Newtonsoft.Json;
using SCTransformation.Models;

namespace SCTransformation.Functions
{
    public static class SmartContractInvocationProtocol
    {
        public static void Main(string[] args)
        {
            var functions = new List<Models.SmartContractDescriptor.Function>
                {new Models.SmartContractDescriptor.Function {Name = "Function1"}};
            var path = CreateSmartContractClientApp<Java>(new Models.SmartContractDescriptor
                {Author = "Umut", Functions = functions});
        }

        public static string CreateSmartContractClientApp<T>(Models.SmartContractDescriptor smartContractDescriptor)
        {
            try
            {
                switch (typeof(T).Name)
                {
                    case nameof(CSharp):
                        return BuildCSharpApplication(smartContractDescriptor);
                    case nameof(Java):
                        return BuildJavaApplication(smartContractDescriptor);
                }
            }
            catch (Exception e)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e);
                Console.ForegroundColor = ConsoleColor.White;
            }

            return string.Empty;
        }

        private static string BuildJavaApplication(Models.SmartContractDescriptor smartContractDescriptor)
        {
            var files = new List<KeyValuePair<string, string>>();
            var assembly = Assembly.GetExecutingAssembly();
            var names = assembly.GetManifestResourceNames();
            foreach (var name in names)
            {
                var stream = assembly.GetManifestResourceStream(name);
                if (stream != null)
                {
                    var reader = new StreamReader(stream);
                    var template = new Template(reader.ReadToEnd(), '€', '€');
                    template.Add("packageName", "com.artuvan");
                    
                    files.Add(new KeyValuePair<string, string>(name, Regex.Escape(template.Render())));
                }

                Console.WriteLine(name);
            }

            //Template hello = new Template();
            // Console.WriteLine(result);
            return WriteFiles(files);
        }

        private static string BuildCSharpApplication(Models.SmartContractDescriptor smartContractDescriptor)
        {
            //TODO:
            var files = new List<KeyValuePair<string, string>>();
            return WriteFiles(files);
        }

        public static string WriteFiles(List<KeyValuePair<string, string>> files)
        {
            var directory = $"{Environment.GetFolderPath(Environment.SpecialFolder.UserProfile)}/ClientApplication";
          
            foreach (var (key, value) in files)
            {
                var nameParts= key.Split(".");
                var projectPath="";
                for (var i = 3; i < nameParts.Length - 3; i++)
                {
                    projectPath += $"/{nameParts[i]}";
                    Directory.CreateDirectory($"{directory}{projectPath}");
                }

                projectPath += $"/{nameParts[^3]}.{nameParts[^2]}";
                var path = $"{directory}{projectPath}";
                try
                {
                    if (File.Exists(path))    
                    {    
                        File.Delete(path);    
                    }   
                    using (var fileStream = File.Create(path)){}
                    File.WriteAllText(path, Regex.Unescape(value));
                }
                catch( Exception e)
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine(e);
                    Console.ForegroundColor = ConsoleColor.White;
                }
            }

            return directory;
        }

        public static string Build(string textOfFile, string type)
        {
            var smartContractDescriptor = JsonConvert.DeserializeObject<Models.SmartContractDescriptor>(textOfFile);
            switch (type)
            {
                case nameof(Java):
                    return CreateSmartContractClientApp<Java>(smartContractDescriptor);
                case nameof(CSharp):
                    return CreateSmartContractClientApp<CSharp>(smartContractDescriptor);
            }

            return string.Empty;
        }
    }
}