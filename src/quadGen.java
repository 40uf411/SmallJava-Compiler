import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quadGen extends SjBaseVisitor<String> {

    public static List<Element> tsSystem = new ArrayList<>();





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
                tsSystem.add(new semAnalyzer().Element(quad.res, left[0]));

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
                tsSystem.add(new MyVisitor.Element(quad.res, left[0]));

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
        else
        {
            if( ! left[0].equals(right[0]))
                errors.add("can't execute operation '" + op + "' on mismatched types");
            else
                errors.add("can't execute operation '" + op + "' on Strings.");
            return "";
        }

    }
}
