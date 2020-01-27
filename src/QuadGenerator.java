import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadGenerator extends SjBaseVisitor<String> {

    public static List<Element> ts = Main.ts;
    public static List<Element> tsSystem = Main.tsSystem;
    public Quads quads = Main.quads;
    private static int brIf = 0;
    private static int brLe = 0;

    private void showText(String text, int typeOfText) {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.QUADGEN);
    }

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
            System.out.println("this is s " + s);
            int id = elemExistSystem(s);
            System.out.println("this is Id " + id);
            Element e = tsSystem.get(id);
            String[] rst = new String[2];
            rst[0] = e.type;
            rst[1] = e.ident;
            return rst;
        }
        char type = s.charAt(0);
        String val = s.substring(1);

        String[] rst = new String[2];
        rst[0] = "";
        rst[1] = val;
        switch (type) {
            case '0':
                rst[0] = "int";
                break;
            case '1':
                rst[0] = "float";
                break;
            case '2':
                rst[0] = "string";
            default: // in cas of an identifier
                int id = elemExist(s);
                if ( id != -1){
                    Element e = ts.get(id);
                    rst[0] = e.type;
                    rst[1] = String.valueOf(e.val);
                }

                break;
        }
        return rst;
    }

    @Override
    public String visitStart(SjParser.StartContext ctx) {

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
        quads.addQuad(quad);
        tsSystem.add(new  Element(quad.res, left[0]));

        return quad.res;
    }



    @Override
    public String visitAffectation(SjParser.AffectationContext ctx) {
        String l = visit(ctx.identifier());
        String r = visit(ctx.expr());
        Quad quad = new Quad("=", r, "" , l);
        quads.addQuad(quad);
        return quad.res;
    }

    @Override
    public String visitIfStatement(SjParser.IfStatementContext ctx) {
        visit(ctx.ifStat());
        if (ctx.elseStat() != null){
            quads.addQuad("@", "breakIf" + brIf++, "","");
            visit( ctx.elseStat() );
        }
        else {
            quads.addQuad("@", "breakIf" + brIf++, "","");
        }
        return "";
    }
    @Override
    public String visitIfStat(SjParser.IfStatContext ctx) {
        visit(ctx.ifCondition());
        quads.addQuad("bz", "breakIf" + (int)(brIf+1), "", "");
        visit(ctx.instructions());
        return "";
    }

    @Override
    public String visitElseStat(SjParser.ElseStatContext ctx) {
        visit(ctx.instructions());
        return "";
    }




    @Override public String visitIn_sj(SjParser.In_sjContext ctx) {
        String message = visit(ctx.stringAtom());
        String exprList = visit(ctx.exprList());

        quads.addQuad("In_sj", message, exprList, "");
        return "";
    }

    @Override public String visitOut_sj(SjParser.Out_sjContext ctx) {

        String message = visit(ctx.stringAtom());
        String exprList = visit(ctx.exprList());
        quads.addQuad("Out_sj", message, exprList, "");
        return "";
    }


    @Override
    public String visitOpCompExpr(SjParser.OpCompExprContext ctx) {
        String l = visit(ctx.left);
        String r = visit(ctx.right);
        String[] left  = treatVal(l);
        String[] right = treatVal(r);
        String op = String.valueOf(ctx.getChild(1).getText());

        switch (op) {
            case ">":
                op = "bg";
                break;
            case ">=":
                op = "bge";
                break;
            case "==":
                op = "be";
                break;
            case "!=":
                op = "bne";
                break;
            case "<=":
                op = "ble";
                break;
            case "<":
                op = "bl";
                break;
        }

            Quad quad = new Quad(op, l, r, null);
            quads.addQuad(quad);
            tsSystem.add(new  Element(quad.res, left[0]));

            return quad.res;
    }

    @Override
    public String visitAtomLogic(SjParser.AtomLogicContext ctx) {
        return ctx.identifier().ID().getText();
    }

    @Override
    public String visitOpLogicExpr(SjParser.OpLogicExprContext ctx) {
        String a1 =  visit(ctx.getChild(0));
        a1 = a1.equals("")? Quad.counter + "T" : a1;
        String r1 = Quad.counter + "T";
        if (ctx.op.getText().equals("&")){
            quads.addQuad("bz", a1, "", "br0" + brLe);
            String a2 = visit(ctx.getChild(2));
            a2 = a2.equals("")? Quad.counter + "T" : a2;
            quads.addQuad("bnz", a2, "", "br1" + brLe);
        } else {
            quads.addQuad("bnz", a1, "", "br1" + brLe);
            String a2 = visit(ctx.getChild(2));
            a2 = a2.equals("")? Quad.counter + "T" : a2;
            quads.addQuad("bnz", a2, "", "br1" + brLe);

        }
        visit(ctx.getChild(0));
        quads.addQuad("@", "br0" + brLe, "", "");
        quads.addQuad("=", "0", "", null);
        quads.addQuad("br", "brend" + brLe, "", "");
        quads.addQuad("@", "br1" + brLe, "", "");
        quads.addQuad("=", "1", "", null);
        quads.addQuad("@", "brend" + brLe, "", "");
        brLe++;
        return "";
    }







    @Override
    public String visitAtomExpr(SjParser.AtomExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitIntAtom(SjParser.IntAtomContext ctx) {
        if (ctx.INTEGER_VAL() != null)
            return "0" + ctx.INTEGER_VAL();
        else
            return visit(ctx.intAtom());
    }

    @Override
    public String visitFloatAtom(SjParser.FloatAtomContext ctx) {
        if (ctx.FLOAT_VAL() != null)
            return "1" + ctx.FLOAT_VAL();
        else
            return visit(ctx.floatAtom());
    }

    @Override
    public String visitStringAtom(SjParser.StringAtomContext ctx) {
        if (ctx.STRING_VAL() != null)
            return "2" + ctx.STRING_VAL();
        else
            return visit(ctx.stringAtom());
    }

    @Override
    public String visitIdentifier(SjParser.IdentifierContext ctx) {
        return String.valueOf(ctx.ID());
    }

    @Override
    public String visitType(SjParser.TypeContext ctx) {
        return String.valueOf(ctx.getText());
    }
}
