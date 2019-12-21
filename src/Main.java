import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<MyVisitor.Element> ids = new ArrayList<MyVisitor.Element>();

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./input.sj");
        SjLexer lexer = new SjLexer(charStream);
        SjParser parser = new SjParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        String answer = new MyVisitor().visit(tree);
        ids = MyVisitor.ts;

//        for(int i = 0; i < ids.size(); i++) {
//            System.out.println("#" + i +" id: " + ids.get(i).ident + " type: " + ids.get(i).type + " val: " + ids.get(i).val);
//        }
    }
}
