import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class MyVisitor extends SjBaseVisitor<String> {

    public static List<Element> ts = new ArrayList<Element>();
    public static Iterator<Element> itrt = ts.iterator();
    public static List<String> errors = new ArrayList<String>();

    public class Element {
        public String ident; public String type; public Object val;
        public Element(String id, String tp){ident = id; type =tp;}
        @Override
        public String toString() {return String.valueOf(this.val);}
    }

    public static boolean elemExist(String v){
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).ident.equals(v))
                return true;
        }
        return false;
    }
    public boolean toBool(int v) {   return v > 0; }

    @Override
    public String visitStart(SjParser.StartContext ctx) {
        visitChildren(ctx);
        if(errors.size() == 0) { // no errors
            showText("program compiled without errors!",TextDisplayer.COMPILERTEXTS);
            showText("symbols table: ",TextDisplayer.COMPILERTEXTS);
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
            for (int i = 0; i < ts.size(); i++) {
                showText(  "#" + i +" id: " + ts.get(i).ident + " type: " + ts.get(i).type + " val: " + ts.get(i).val ,TextDisplayer.COMPILERTEXTS);
            }
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        }
        else
        {
            showText("program compiled with the following errors",TextDisplayer.COMPILERTEXTS);
            for (int i = 0; i < errors.size(); i++) {
                showText(errors.get(i),TextDisplayer.ERROR);
            }
        }
        return "";
    }


    @Override
    public String visitDeclaration(SjParser.DeclarationContext ctx) {
        String type = String.valueOf( visit(ctx.type()) );

        if (ctx.vars() != null) {
            for (SjParser.IdentifierContext tokenNode : ctx.vars().identifier()) {
                if ( elemExist( tokenNode.getText() ) )
                {
                    errors.add("variable with the name '" + tokenNode.getText() + "' already declared.");
                    return "";
                }
                else
                    ts.add( new Element( tokenNode.getText(), type ) );
            }
        }
        return "ok";
    }

    @Override
    public String visitType(SjParser.TypeContext ctx) {
        return String.valueOf(ctx.getText());
    }

    private void showText(String text, int typeOfText)
    {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.SEMANTICERR);
    }
}
