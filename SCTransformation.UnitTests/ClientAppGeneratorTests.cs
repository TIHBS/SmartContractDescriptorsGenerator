using System.Collections.Generic;
using Newtonsoft.Json;
using SCTransformation.Models;
using Xunit;

namespace SCTransformation.UnitTests
{
    public class ClientAppGeneratorTests
    {
        [Fact]
        public void TestBuild()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "main",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "DeployWinnerTakesAll"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "bindWinnerTakesAll"
                    }
                }
            };
            var path = ClientApplicationGenerator.Build(JsonConvert.SerializeObject(smartContractDescriptor),"package","callback");
            Assert.NotNull(path);
        }
        
        [Fact]
        public void TestBuildTextEmpty()
        {
            var path = ClientApplicationGenerator.Build("","package","callback");
            Assert.NotNull(path);
        }
        
        [Fact]
        public void TestBuildPackageNameEmpty()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "main",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "DeployWinnerTakesAll"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "bindWinnerTakesAll"
                    }
                }
            };
            var path = ClientApplicationGenerator.Build(JsonConvert.SerializeObject(smartContractDescriptor),"","callback");
            Assert.NotNull(path);
        }
        
        [Fact]
        public void TestBuildCallbackUrlEmpty()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "main",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "DeployWinnerTakesAll"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "bindWinnerTakesAll"
                    }
                }
            };
            var path = ClientApplicationGenerator.Build(JsonConvert.SerializeObject(smartContractDescriptor),"package","");
            Assert.NotNull(path);
        }
        
        [Fact]
        public void TestBuildAllEmpty()
        {
            var path = ClientApplicationGenerator.Build("","","");
            Assert.NotNull(path);
        }
    }
}