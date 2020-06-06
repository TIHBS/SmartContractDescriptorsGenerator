using SCTransformation.Grammars.JavaScript;
using SCTransformation.Models;

namespace SCTransformation.Visitors
{
    public class JavaScriptVisitor:JavaScriptParserBaseVisitor<object>
    {
        public JavaScript JavaScript { get; }

        public JavaScriptVisitor()
        {
            
        }

        public override object VisitProgram(JavaScriptParser.ProgramContext context)
        {
            //TODO:
            return null;
        }
    }
}