using System.ComponentModel.DataAnnotations;

namespace SCTransformation.API.Models
{
    /// <summary>
    /// 
    /// </summary>
    public class SCIPInput
    {
        /// <summary>
        /// Content of Smart contract descriptor
        /// </summary>
        [Required]
        public string Content { get; set; }
        /// <summary>
        /// Package name of client app to be generated
        /// </summary>
        [Required]
        public string PackageName { get; set; }
        /// <summary>
        /// CallbackUrl for Client App
        /// </summary>
        [Required]
        public string CallbackUrl { get; set; }
    }
}