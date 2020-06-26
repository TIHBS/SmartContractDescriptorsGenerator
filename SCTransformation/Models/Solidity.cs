using System.Collections.Generic;

namespace SCTransformation.Models
{
    public class Solidity
    {
        public string RawFileContent { get; set; }
        public string Pragma { get; set; }
        public List<string> Imports { get; set; }
        public List<Contract> Contracts { get; set; }
        public BlockChainType BlockChainType { get; set; }

        public class Contract
        {
            public bool IsStateful { get; set; }
            public string Name { get; set; }
            public List<StateVariable> StateVariables { get; set; }
            public List<Function> Functions { get; set; }
            public List<Event> Events { get; set; }
            public List<Modifier> Modifiers { get; set; }
            public List<SolidityEnum> Enums { get; set; }
            public List<Struct> Structs { get; set; }
            public bool Abstract { get; set; }
        }

        public class StateVariable
        {
            public string Type { get; set; }
            public string Name { get; set; }
            public List<string> Keywords { get; set; }
        }

        public class Function
        {
            public string Name { get; set; }
            public List<Parameter> Parameters { get; set; }
            public List<Parameter> ReturnParameters { get; set; }
            public ModifierList ModifierList { get; set; }
            public List<string> Events { get; set; }
            public Scope Scope { get; set; }
            public bool HasSideEffects { get; set; }
        }

        public class Event
        {
            public string Name { get; set; }
            public List<EventParameter> EventParameters { get; set; }
            public bool Anonymous { get; set; }
        }

        public class Modifier
        {
            public string Name { get; set; }
            public List<Parameter> Parameters { get; set; }
        }

        public class ModifierList
        {
            public StateMutability StateMutability { get; set; }
            public ModifierInvocation ModifierInvocation { get; set; }
            public bool IsVirtual { get; set; }
            public List<string> Override { get; set; }
        }

        public class ModifierInvocation
        {
            public string Identifier { get; set; }
            public List<string> Expressions { get; set; }
        }

        public enum StateMutability
        {
            None,
            Pure,
            Constant,
            View,
            Payable
        }

        public class Parameter
        {
            public string Type { get; set; }
            public string Name { get; set; }
            public StorageLocation StorageLocation { get; set; }
        }

        public class EventParameter
        {
            public string Type { get; set; }
            public string Name { get; set; }
            public bool IsIndexed { get; set; }
        }

        public class SolidityEnum
        {
            public string Name { get; set; }
            public List<string> Enums { get; set; }
        }

        public class Struct
        {
            public string Name { get; set; }
            public List<Variable> Variables { get; set; }
        }

        public class Variable
        {
            public string Type { get; set; }
            public string Name { get; set; }
            public StorageLocation StorageLocation { get; set; }
        }

        public enum StorageLocation
        {
            None,
            Memory,
            Storage,
            CallData
        }
    }
}