import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class MyVisitor extends SjBaseVisitor<String> {

    public static List<Element> ts = new ArrayList<Element>();
    public static Iterator<Element> itrt = ts.iterator();
    public static List<String> imports = new ArrayList<String>();
    public static List<String> errors = new ArrayList<String>();

    public class Element {
        public String ident; public String type; public Object val;
        public Element(String id, String tp){ident = id; type =tp;}
        @Override
        public String toString() {return String.valueOf(this.val);}
    }

    public static int elemExist(String v){
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).ident.equals(v))
                return i;
        }
        return -1;
    }
    public static boolean imported(String v){
        for (int i = 0; i < imports.size(); i++) {
            if (imports.get(i).equals(v))
                return true;
        }
        return false;
    }
    public static boolean toBool(int v) {   return v > 0; }
    private static void showText(String text, int typeOfText) {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.SEMANTICERR);
    }
    private static void nl(){
        System.out.println();
    }

    @Override
    public String visitStart(SjParser.StartContext ctx) {
        visitChildren(ctx);
        if(errors.size() == 0) { // no errors
            showText("program compiled without errors!",TextDisplayer.COMPILERTEXTS);
            //
            nl();
            showText("------------------------------------------------------",TextDisplayer.COMPILERTEXTS);
            showText("imports table: ",TextDisplayer.COMPILERTEXTS);
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
            for (int i = 0; i < imports.size(); i++) {
                showText(  "#" + i +": " + imports.get(i) ,TextDisplayer.COMPILERTEXTS);
            }
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
            //
            nl();
            showText("------------------------------------------------------",TextDisplayer.COMPILERTEXTS);
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

        for (SjParser.IdentifierContext tokenNode : ctx.vars().identifier()) {
            if ( elemExist( tokenNode.getText() ) != -1 )
            {
                errors.add("variable with the name '" + tokenNode.getText() + "' already declared.");
                return "";
            }
            else
                ts.add( new Element( tokenNode.getText(), type ) );
        }
        return "ok";
    }

    @Override
    public String visitType(SjParser.TypeContext ctx) {
        return String.valueOf(ctx.getText());
    }

    @Override
    public String visitImport_(SjParser.Import_Context ctx) {

        String left = String.valueOf( visit(ctx.identifier(0)) );
        String right = String.valueOf( visit(ctx.identifier(1)));
        String fname = left + "." + right;
        if ( imported(fname) )
        {
            errors.add("Package with the name '" + fname + "' already imported.");
            return "";
        }
        else
            imports.add( fname );
        return "";
    }

    @Override
    public String visitIdentifier(SjParser.IdentifierContext ctx) {
        return String.valueOf(ctx.ID());
    }

    @Override
    public String visitValAffect(SjParser.ValAffectContext ctx) {
        String id = String.valueOf( visit(ctx.identifier()) );
        String[] tmp = treatVal(String.valueOf( visit(ctx.val()) ) );

        String type = tmp[0];
        String val  = tmp[1];

        int idEl = elemExist( id );
        if ( idEl == -1  )
        {
            errors.add("variable with the name '" + id + "' was not declared.");
            return "";
        }
        else {
            Element el = ts.get(idEl);
            if ( ! el.type.equals(type))
            {
                errors.add("variable with the name '" + id + "' was not declared.");
                return "";
            }
            else
                el.val = val;
        }
        return "";
    }

    @Override
    public String visitVal(SjParser.ValContext ctx) {
        String rs;
        if (ctx.INTEGER_VAL() != null)
            return "0" + String.valueOf(ctx.INTEGER_VAL());
        else if (ctx.FLOAT_VAL() != null)
            return "1" + String.valueOf(ctx.FLOAT_VAL());
        else
            return "2" + String.valueOf(ctx.STRING_VAL());
    }

    public String[] treatVal(String s) {
      char type = s.charAt(0);
      String val = s.substring(1);
      String[] rst = new String[2];
      switch (type) {
          case 0:
              rst[0] = "int";
              break;
          case 1:
              rst[0] = "float";
              break;
          case 2:
              rst[0] = "string";
      }
      rst[1] = val;
      return rst;
    };
}
