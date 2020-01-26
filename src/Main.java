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
    public static Iterator<Element> itrt = ts.iterator();
    public static List<String> imports = new ArrayList<>(   );
    public static List<String> errors = new ArrayList<>();

    public static Quads quads = new Quads();

    //public static List<MyVisitor.Element> ids = new ArrayList<MyVisitor.Element>();

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./input.sj");
        SjLexer lexer = new SjLexer(charStream);
        SjParser parser = new SjParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        String answer = new semAnalyzer().visit(tree);
        //ids = MyVisitor.ts;
            lexer = null;
    }
}
