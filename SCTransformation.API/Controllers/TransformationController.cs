using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.Xml;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using SCTransformation.Models;

namespace SCTransformation.API.Controllers
{
    [Route("api/")]
    public class TransformationController : Controller
    {
        [HttpGet]
        [Route("GetSmartContractDescriptor")]
        public string GetSmartContractDescriptor(string textOfFile, string type)
        {
            var scd = Functions.StaticFunctions.Transform(textOfFile, type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }
        
        [HttpGet]
        [Route("GetSmartContractInvocationProtocol")]
        public string GetSmartContractInvocationProtocol(string textOfFile, string type)
        {
            //TODO: SCIP
            //TODO: Consider template engines and direct serialization
            var scd = Functions.StaticFunctions.Transform(textOfFile, type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }
    }
}
