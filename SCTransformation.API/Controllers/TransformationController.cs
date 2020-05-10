using Microsoft.AspNetCore.Mvc;
using SCTransformation.API.Models;

namespace SCTransformation.API.Controllers
{
    /// <summary>
    /// 
    /// </summary>
    [Route("api/")]
    public class TransformationController : Controller
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        [HttpPost]
        [Route("GetSmartContractDescriptor")]
        public string GetSmartContractDescriptor([FromBody] Input input)
        {
            var scd = Functions.SmartContractDescriptor.Transform(input.Content, input.Type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        [HttpPost]
        [Route("GetSmartContractInvocationProtocol")]
        public string GetSmartContractInvocationProtocol([FromBody] Input input)
        {
            var path = Functions.SmartContractInvocationProtocol.Build(input.Content, input.Type);
            return path;
        }
    }
}