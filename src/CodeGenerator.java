import java.util.List;

public class CodeGenerator {

    public String code = "";
    private String acc;
    public static List<Element> ts = Main.ts;
    public static List<Element> tsSystem = Main.tsSystem;
    public static List<String> errors = Main.errors;


    public void run( Quads quads ) {
        for (int i = 0; i < quads.size(); i++) {
            Quad q = quads.getQuad(i);

            String op  = q.op;
            String op1 = q.op1;
            String op2 = q.op2;
            String res = q.res;

            getInAcc(op1, (op.equals("+") || op.equals("*"))? op2 : "", res);
            switch (op){
                case "+":
                    code = code + "ADD " + op2 + "\n";
                    break;
                case "-":
                    code = code + "SUB " + op2 + "\n";
                    break;
                case "*":
                    code = code + "MULT " + op2 + "\n";
                    break;
                case "/":
                    code = code + "DIV " + op2 + "\n";
                    break;
            }
        }
    }

    public String getInAcc(String a, String b, String s) {
        if (acc.equals(a)){
            return "";
        }
        else {
            if (acc.equals(b)) {
                String c = b;
                b = a;
                a = c;
                return "";
            }
            else {
                return "STORE " + s + "\n LOAD " + a;
            }
        }
    }
}
