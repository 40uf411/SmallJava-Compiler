import java.util.ArrayList;
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
}
