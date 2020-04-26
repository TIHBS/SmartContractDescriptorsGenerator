using System.ComponentModel.DataAnnotations;

namespace SCTransformation.API.Models
{
    public class Input
    {
        [Required] public string Content { get; set; }

        [Required] public string Type { get; set; }
    }
}