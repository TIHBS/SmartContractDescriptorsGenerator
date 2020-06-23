using System.Collections.Generic;

namespace SCTransformation.Models
{
    public class Go
    {
        public string RawFileContent { get; set; }
        public string PackageName { get; set; }
        public List<string> Imports { get; set; }
        public List<Function> Functions { get; set; }
        public List<Method> Methods { get; set; }
        public List<Var> Vars { get; set; }
        public List<Const> Consts { get; set; }
        public List<Type_> Types { get; set; }
        public BlockChainType BlockChainType { get; set; }

        public class Function
        {
            public string Name { get; set; }
            public List<Parameter> Inputs { get; set; }
            public List<Parameter> Returns { get; set; }
        }

        public class Method
        {
            public string Name { get; set; }
            public List<Parameter> Receiver { get; set; }
            public List<Parameter> Inputs { get; set; }
            public List<Parameter> Returns { get; set; }
        }

        public class Var
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }

        public class Const
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }

        public class Type_
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }

        public class Parameter
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }
    }
}