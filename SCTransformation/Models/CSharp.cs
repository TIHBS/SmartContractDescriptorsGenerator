using System.Collections.Generic;

namespace SCTransformation.Models
{
    public class CSharp
    {
        public string NameSpace { get; set; }
        public List<string> Usings { get; set; }
        public List<Class> Classes { get; set; }
        public List<Interface> Interfaces { get; set; }


        public class Class
        {
            public AccessSpecifier AccessSpecifier { get; set; }
            public string ClassName { get; set; }
            public List<Method> Methods { get; set; }
        }

        public class Interface
        {
            public AccessSpecifier AccessSpecifier { get; set; }
            public string InterfaceName { get; set; }
            public List<Method> Methods { get; set; }
        }

        public class Method
        {
            public AccessSpecifier AccessSpecifier { get; set; }
            public string ReturnType { get; set; }
            public string MethodName { get; set; }
            public List<Parameter> Parameters { get; set; }
        }

        public class Parameter
        {
            public string AttributeType { get; set; }
            public string AttributeName { get; set; }
        }

        public enum AccessSpecifier
        {
            Protected,
            Public,
            Internal
        }
    }
}