using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace SCTransformation.Models
{
    public class SmartContractDescriptor
    {
        public string ScdlVersion { get; set; }
        public string Name { get; set; }
        public string Version { get; set; }
        public Uri LatestUrl { get; set; }
        public string Description { get; set; }
        public string Author { get; set; }
        public DateTime CreatedOn { get; set; }
        public DateTime UpdatedOn { get; set; }
        public LifeCycle LifeCycle { get; set; }
        public string SclAddress { get; set; } //TODO: Type SCL Address
        public BlockChainType BlockChainType { get; set; }
        public string BlockChainVersion { get; set; }
        public string InternalAddress { get; set; }
        public Uri MetaData { get; set; }
        public string Hash { get; set; }
        public bool IsStateful { get; set; }
        //TODO: add as missing part
        public string ContractLanguage { get; set; }
        public string ContractLanguageVersion { get; set; }
        public List<Function> Functions { get; set; }
        public List<Event> Events { get; set; }

        public class Parameter
        {
            public string Name { get; set; }
            public string Type { get; set; }
            public bool IsIndexed { get; set; }
        }

        public class Event
        {
            [Required] public string Name { get; set; }
            public string Description { get; set; }
            [Required] public List<Parameter> Outputs { get; set; }
        }

        public class Function
        {
            public string Name { get; set; }
            public string Description { get; set; }
            public Scope Scope { get; set; }
            public bool HasSideEffects { get; set; }
            public string Dispatcher { get; set; }
            public List<Parameter> Inputs { get; set; }
            public List<Parameter> Outputs { get; set; }
            public List<string> Events { get; set; }
        }

        public enum Scope
        {
            Public,
            Private,
            Internal,
            External
        }
    }

    public enum BlockChainType
    {
        Ethereum,
        Bitcoin,
        Fabric,
        Neo
    }

    public enum LifeCycle
    {
        Ready,
        Destroyed
    }
}