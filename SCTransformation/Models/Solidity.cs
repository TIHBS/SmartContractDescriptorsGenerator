using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;

namespace SCTransformation.Models
{
    public class Solidity
    {
        public string Pragma { get; set; }
        public List<string> Imports { get; set; }
        public List<Contract> Contracts { get; set; }
        public List<Interface> Interfaces { get; set; }

        public class Contract
        {
            public string Name { get; set; }
            public List<StateVariable> StateVariables { get; set; }
            public List<Function> Functions { get; set; }
            public List<Event> Events { get; set; }
            public List<Modifier> Modifiers { get; set; }
            public List<SolidityEnum> Enums { get; set; }
            public List<Struct> Structs { get; set; }
            public bool IsAbstract { get; set; }
        }

        public class Interface
        {
            public string Name { get; set; }
            public List<StateVariable> StateVariables { get; set; }
            public List<Function> Functions { get; set; }
            public List<Event> Events { get; set; }
            public List<Modifier> Modifiers { get; set; }
            public List<SolidityEnum> Enums { get; set; }
            public List<Struct> Structs { get; set; }
        }

        public class StateVariable
        {
            public string Type { get; set; }
            public string Name { get; set; }
            public bool IsConstant { get; set; }
        }

        public class Function
        {
            public string Name { get; set; }
            public Scope Scope { get; set; }
        }

        public class Event
        {
            public string Name { get; set; }
            public Scope Scope { get; set; }
        }

        public class Modifier
        {
            public Scope Scope { get; set; }
        }

        public class SolidityEnum
        {
            public string Name { get; set; }
            public List<string> Enums { get; set; }
        }

        public class Struct
        {
            public string Name { get; set; }
            public IDictionary<string, string> Variables { get; set; }
        }

        public enum Scope
        {
            Public,
            Internal,
            External,
            Private
        }
    }
}