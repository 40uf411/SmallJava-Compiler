import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static List<Element> ts = new ArrayList<>();
    public static List<Element> tsSystem = new ArrayList<>();
    public static List<String> imports = new ArrayList<>(   );
    public static List<String> errors = new ArrayList<>();

    public static Quads quads = new Quads();

    //public static List<MyVisitor.Element> ids = new ArrayList<MyVisitor.Element>();
    private static void showText(String text, int typeOfText) {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.SEMANTICERR);
    }
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./input.sj");
        SjLexer lexer = new SjLexer(charStream);
        SjParser parser = new SjParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        //String answer0 = new semAnalyzer().visit(tree);
        String answer1 = new QuadGenerator().visit(tree);
        quads.addQuad("END","","","");

        showText("generated quads: ",TextDisplayer.COMPILERTEXTS);
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        for (int i = 0; i < quads.size(); i++) {
            showText(i + ": " + '(' + quads.getQuad(i).op + ',' + quads.getQuad(i).op1 + ',' + quads.getQuad(i).op2 + ',' + quads.getQuad(i).res + ')',TextDisplayer.COMPILERTEXTS);
        }
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);

    }
}
