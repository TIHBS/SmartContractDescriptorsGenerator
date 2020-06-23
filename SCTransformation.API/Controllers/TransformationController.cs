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
        public string GetSmartContractDescriptor([FromBody] SCDInput input)
        {
            var scd = SmartContractDescriptorGenerator.Transform(input.Content, input.Type);
            return Newtonsoft.Json.JsonConvert.SerializeObject(scd);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        [HttpPost]
        [Route("GetSmartContractInvocationProtocol")]
        public string GetSmartContractInvocationProtocol([FromBody] SCIPInput input)
        {
            var path = ClientApplicationGenerator.Build(input.Content, input.PackageName, input.CallbackUrl);
            return path;
        }
    }
}