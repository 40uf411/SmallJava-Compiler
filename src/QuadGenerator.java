import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadGenerator extends SjBaseVisitor<Integer> {

    public static List<Element> tsSystem = Main.tsSystem;
    private Quads quads = Main.quads;

    public static int elemExistSystem(String v){
        for (int i = 0; i < tsSystem.size(); i++) {
            if (tsSystem.get(i).ident.equals(v))
                return i;
        }
        return -1;
    }
    private void showText(String text, int typeOfText)
    {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.QUADGEN);
    }

    @Override
    public Integer visitStart(SjParser.StartContext ctx) {

        quads.addQuad("END","","","");
        showText("generated quads: ",TextDisplayer.COMPILERTEXTS);
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        for (int i = 0; i < quads.size(); i++) {
            showText(i + ": " + quads.getQuad(i).toString(),TextDisplayer.COMPILERTEXTS);
        }
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);

        return visitChildren(ctx);
    }

    @Override
    public String visitArthExpr(SjParser.ArthExprContext ctx) {
        String l = visit(ctx.left);
        String r = visit(ctx.right);
        String[] left  = treatVal(l);
        String[] right = treatVal(r);
        String op = String.valueOf(ctx.getChild(1).getText());
        Quad quad = new Quad(op, l, r, null);
        Quad.listQuad.add(quad);

        String[] allowed_types = {"int", "float"};
        if ( Arrays.asList(allowed_types).contains(left[0]) && left[0].equals(right[0]) ) { // '&& left[0].equals(right[0])' add this if u want to stop mixing types in operations

            if (left[0].equals("int"))
            {
                tsSystem.add(new  Element(quad.res, left[0]));

                int rslt = 0;
                switch (op){
                    case "+":
                        rslt = (Integer.valueOf(left[1]) +  Integer.valueOf(right[1]));
                        break;
                    case "-":
                        rslt = (Integer.valueOf(left[1]) -  Integer.valueOf(right[1]));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                return quad.res;
            }
            else
            {
                tsSystem.add(new Element(quad.res, left[0]));

                float rslt = 0;
                switch (op){
                    case "+":
                        rslt = (Float.valueOf(left[1]) +  Float.valueOf(right[1]));
                        break;
                    case "-":
                        rslt = (Float.valueOf(left[1]) -  Float.valueOf(right[1]));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                return quad.res;
            }
        }

        return quad.res;
    }
}
