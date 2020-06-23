using System.Collections.Generic;

namespace SCTransformation.Models
{
    public class JavaScript
    {
        public string RawFileContent { get; set; }
        public bool IsStateful { get; set; }
        public List<string> Imports { get; set; }
        public List<string> Exports { get; set; }
        public List<Variable> Variables { get; set; }
        public Class JavaScriptClass { get; set; }
        public List<Function> Functions { get; set; }
        public BlockChainType BlockChainType { get; set; }
        public class Class
        {
            public string Name { get; set; }
            public string Extends { get; set; }
            public List<Function> Methods { get; set; }
            public List<Variable> Variables { get; set; }
        }

        public class Parameter
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }

        public class Variable
        {
            public string Name { get; set; }
            public string Type { get; set; }
        }

        public class Function
        {
            public string Name { get; set; }
            public string EventName { get; set; }
            public List<Parameter> Inputs { get; set; }
            public List<Parameter> Outputs { get; set; }
        }
    }
}