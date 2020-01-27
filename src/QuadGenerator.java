import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuadGenerator extends SjBaseVisitor<Integer> {

    public static List<Element> ts = Main.ts;
    public static List<Element> tsSystem = Main.tsSystem;
    public static List<String> imports = Main.imports;
    public static List<String> errors = Main.errors;

    public Quads quads = Main.quads;

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

    // look if an element already exist in symbols table
    public static int elemExist(String v){
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).ident.equals(v))
                return i;
        }
        return -1;
    }
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
}
