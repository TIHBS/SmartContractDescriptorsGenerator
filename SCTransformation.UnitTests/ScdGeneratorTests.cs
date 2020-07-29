using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using Xunit;
using SCTransformation.Models;

namespace SCTransformation.UnitTests
{
    public class ScdGeneratorTests
    {
        private Assembly _assembly;
        private string _solidityResourceName;
        private string _javaScriptResourceName;
        private string _goResourceName;

        public ScdGeneratorTests()
        {
            _assembly = Assembly.GetExecutingAssembly();
            _solidityResourceName = "SCTransformation.UnitTests.Resources.in.sol";
            _javaScriptResourceName = "SCTransformation.UnitTests.Resources.in.js";
            _goResourceName = "SCTransformation.UnitTests.Resources.in.go";
        }

        [Fact]
        public void TestTransformJavaScriptEqual()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "diary",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerMilkBatch"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "transportMilkBatch"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerMilkCarton",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "transportCarton",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerCartonInInventory",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerSelling"
                    }
                },
                Events = new List<SmartContractDescriptor.Event>
                {
                    new SmartContractDescriptor.Event
                    {
                        Name = "milkBatchRegistered",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "milkBatchTransported",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonRegistered",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonTransported",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonRegisteredInInventory",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonSold",
                    }
                }
            };

            var test = SmartContractDescriptorGenerator.Transform(
                new StreamReader(_assembly.GetManifestResourceStream(_javaScriptResourceName)!).ReadToEnd(),
                "JavaScript");

            Assert.NotNull(test);
            Assert.Equal(smartContractDescriptor.Name, test.Name);
            Assert.Equal(smartContractDescriptor.Functions.First().Name, test.Functions.First().Name);
            Assert.Equal(smartContractDescriptor.Functions.Last().Name, test.Functions.Last().Name);
            Assert.Equal(smartContractDescriptor.Events.First().Name, test.Events.First().Name);
            Assert.Equal(smartContractDescriptor.Events.Last().Name, test.Events.Last().Name);
        }

        [Fact]
        public void TestTransformJavaScriptNotEqual()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "diary",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerMilkBatch"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "transportMilkBatch"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerMilkCarton",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "transportCarton",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerCartonInInventory",
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "registerSelling"
                    }
                },
                Events = new List<SmartContractDescriptor.Event>
                {
                    new SmartContractDescriptor.Event
                    {
                        Name = "milkBatchRegistered",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "milkBatchTransported",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonRegistered",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonTransported",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonRegisteredInInventory",
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "cartonSold",
                    }
                }
            };

            var test = SmartContractDescriptorGenerator.Transform("",
                "JavaScript");

            Assert.NotNull(test);
            Assert.NotEqual(smartContractDescriptor.Name, test.Name);
            Assert.NotNull(test.Functions);
            Assert.NotNull(test.Events);
        }

        [Fact]
        public void TestTransformSolidityEqual()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "test",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "f"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "g"
                    }
                },
                Events = new List<SmartContractDescriptor.Event>
                {
                    new SmartContractDescriptor.Event
                    {
                        Name = "e"
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "a"
                    }
                }
            };

            var test = SmartContractDescriptorGenerator.Transform(
                new StreamReader(_assembly.GetManifestResourceStream(_solidityResourceName)!).ReadToEnd(),
                "Solidity");

            Assert.NotNull(test);
            Assert.Equal(smartContractDescriptor.Name, test.Name);
            Assert.Equal(smartContractDescriptor.Functions.First().Name, test.Functions.First().Name);
            Assert.Equal(smartContractDescriptor.Functions.Last().Name, test.Functions.Last().Name);
            Assert.Equal(smartContractDescriptor.Events.First().Name, test.Events.First().Name);
            Assert.Equal(smartContractDescriptor.Events.Last().Name, test.Events.Last().Name);
        }

        [Fact]
        public void TestTransformSolidityNotEqual()
        {
            var smartContractDescriptor = new SmartContractDescriptor
            {
                Name = "test",
                Functions = new List<SmartContractDescriptor.Function>
                {
                    new SmartContractDescriptor.Function
                    {
                        Name = "f"
                    },
                    new SmartContractDescriptor.Function
                    {
                        Name = "g"
                    }
                },
                Events = new List<SmartContractDescriptor.Event>
                {
                    new SmartContractDescriptor.Event
                    {
                        Name = "e"
                    },
                    new SmartContractDescriptor.Event
                    {
                        Name = "a"
                    }
                }
            };

            var test = SmartContractDescriptorGenerator.Transform("",
                "Solidity");

            Assert.NotNull(test);
            Assert.NotEqual(smartContractDescriptor.Name, test.Name);
            Assert.Null(test.Functions);
            Assert.Null(test.Events);
        }

        [Fact]
        public void TestTransformGoEqual()
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

            var test = SmartContractDescriptorGenerator.Transform(
                new StreamReader(_assembly.GetManifestResourceStream(_goResourceName)!).ReadToEnd(), "Go");

            Assert.NotNull(test);
            Assert.Equal(smartContractDescriptor.Name, test.Name);
            Assert.Equal(smartContractDescriptor.Functions.First().Name, test.Functions.First().Name);
            Assert.Equal(smartContractDescriptor.Functions.Last().Name, test.Functions.Last().Name);
        }

        [Fact]
        public void TestTransformGoNotEqual()
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
                        Name = "WatchProjectSupported"
                    }
                }
            };

            var test = SmartContractDescriptorGenerator.Transform("", "Go");

            Assert.NotNull(test);
            Assert.NotEqual(smartContractDescriptor.Name, test.Name);
            Assert.NotNull(test.Functions);
            Assert.NotNull(test.Events);
        }
    }
}