using SCTransformation.Grammars.Go;
using SCTransformation.Models;

namespace SCTransformation.Visitors
{
    public class GoVisitor : GoParserBaseVisitor<object>
    {
        public Go Go { get; }
    }
}