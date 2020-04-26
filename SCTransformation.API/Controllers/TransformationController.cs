using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Security.Cryptography.Xml;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using SCTransformation.API.Models;
using SCTransformation.Models;

namespace SCTransformation.API.Controllers
{
    [Route("api/")]
    public class TransformationController : Controller
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <param name="type"></param>
        /// <returns></returns>
        [HttpPost]
        [Route("GetSmartContractDescriptor")]
        public string GetSmartContractDescriptor([FromBody] Input input)
        {
            var scd = Functions.StaticFunctions.Transform(input.Content, input.Type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <param name="type"></param>
        /// <returns></returns>
        [HttpPost]
        [Route("GetSmartContractInvocationProtocol")]
        public string GetSmartContractInvocationProtocol([FromBody] Input input)
        {
            //TODO: SCIP
            //TODO: Consider template engines and direct serialization
            var scd = Functions.StaticFunctions.Transform(input.Content, input.Type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }
    }
}