using System.ComponentModel.DataAnnotations;

namespace SCTransformation.API.Models
{
    /// <summary>
    /// Input of SCD
    /// </summary>
    public class SCDInput
    {
        /// <summary>
        /// Content of Smart contract
        /// </summary>
        [Required]
        public string Content { get; set; }
        /// <summary>
        /// Provide type of Smart Contract file, case sensitive
        /// Solidity, Go, JavaScript
        /// </summary>
        [Required]
        public string Type { get; set; }
        

    }
}