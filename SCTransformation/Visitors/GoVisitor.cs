using SCTransformation.Grammars.Go;
using SCTransformation.Models;

namespace SCTransformation.Visitors
{
    public class GoVisitor : GoParserBaseVisitor<object>
    {
        public Go Go { get; }

        public GoVisitor()
        {
            
        }

        public override object VisitSourceFile(GoParser.SourceFileContext context)
        {
            //TODO:
            return null;
        }
    }
}