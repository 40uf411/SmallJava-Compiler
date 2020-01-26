import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quadGen extends SjBaseVisitor<String> {

    public static List<Element> tsSystem = new ArrayList<>();

    public static int elemExistSystem(String v){
        for (int i = 0; i < tsSystem.size(); i++) {
            if (tsSystem.get(i).ident.equals(v))
                return i;
        }
        return -1;
    }

    public String[] treatVal(String s) {
        if (s.charAt(s.length()-1) == 'T' && s.charAt(0) <= '9' && s.charAt(0) >= '0') {
            int id = elemExistSystem(s);
            Element e = tsSystem.get(id);
            String[] rst = new String[2];
            rst[0] = e.type;
            rst[1] = e.ident;
            return rst;
        }
    }

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