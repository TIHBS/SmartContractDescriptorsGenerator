using System.ComponentModel.DataAnnotations;

namespace SCTransformation.API.Models
{
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
    }
}