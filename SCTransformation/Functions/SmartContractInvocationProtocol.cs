using System;
using System.Collections.Immutable;
using SCTransformation.Models;

namespace SCTransformation.Functions
{
    public static class SmartContractInvocationProtocol
    {
        public static string CreateSmartContractClientApp<T>(string contents)
        {
            try
            {
                switch (typeof(T).Name)
                {
                    case nameof(CSharp):
                        return BuildCSharpApplication(contents);
                    case nameof(Vyper):
                        return BuildJavaApplication(contents);
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

        private static string BuildJavaApplication(string contents)
        {
            //TODO:
            return WriteFiles();
        }

        private static string BuildCSharpApplication(string contents)
        {
            //TODO:
            return WriteFiles();
        }

        public static string WriteFiles()
        {
            //TODO:
            return "path";
        }

        public static string Build(string textOfFile, string type)
        {
            //TODO: SCIP
            //TODO: Consider template engines and direct serialization
            switch (type)
            {
                case nameof(Java):
                    return CreateSmartContractClientApp<Java>(textOfFile);
                case nameof(CSharp):
                    return CreateSmartContractClientApp<CSharp>(textOfFile);
            }
            return string.Empty;
        }
    }
}