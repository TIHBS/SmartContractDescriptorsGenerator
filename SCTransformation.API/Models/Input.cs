using System.ComponentModel.DataAnnotations;

namespace SCTransformation.API.Models
{
    /// <summary>
    /// 
    /// </summary>
    public class Input
    {
        /// <summary>
        /// 
        /// </summary>
        [Required]
        public string Content { get; set; }

        /// <summary>
        /// 
        /// </summary>
        [Required]
        public string Type { get; set; }
    }
}