import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class MyVisitor extends SjBaseVisitor<String> {

    // One Element of symbols table CLASS ##############################################################################
    public class Element {
        public String ident;
        public String type;
        public Object val;

        //public Integer intVal;
        //public Double doubleVal;
        //public String stringVal;
        public Element(String id, String tp){
            ident = id; type =tp;
        }

        @Override
        public String toString() {
            return String.valueOf(this.val);
        }
    }

// needed variables ####################################################################################################

    public static List<Element> ts = new ArrayList<>();
    public static Iterator<Element> itrt = ts.iterator();
    public static List<String> imports = new ArrayList<>();
    public static List<String> errors = new ArrayList<>();


// helper functions ####################################################################################################

    // look if an element already exist in symbols table
    public static int elemExist(String v){
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).ident.equals(v))
                return i;
        }
        return -1;
    }

    // look if an element already been imported
    public static boolean imported(String v){
        for (int i = 0; i < imports.size(); i++) {
            if (imports.get(i).equals(v))
                return true;
        }
        return false;
    }

    //public static boolean toBool(int v) {   return v > 0; }


    // returns an array contains type and value
    public String[] treatVal(String s) {

        char type = s.charAt(0);
        String val = s.substring(1);
        String[] rst = new String[2];
        switch (type) {
            case '0':
                rst[0] = "int";
                break;
            case '1':
                rst[0] = "float";
                break;
            case '2':
                rst[0] = "string";
        }
        rst[1] = val;
        return rst;
    }

    // New Line
    private static void nl(){
        System.out.println();
    }
    // Simplify printing text
    private static void showText(String text, int typeOfText) {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.SEMANTICERR);
    }
// #####################################################################################################################



    // STARTING POINT ##################################################################################################

    @Override
    public String visitStart(SjParser.StartContext ctx) {
        visitChildren(ctx);
        if(errors.size() == 0) { // no errors
            showText("program compiled without errors!",TextDisplayer.COMPILERTEXTS);
            //
            nl();
            showText("------------------------------------------------------",TextDisplayer.COMPILERTEXTS);
            showText("imports table: ",TextDisplayer.COMPILERTEXTS);
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);

            for (int i = 0; i < imports.size(); i++) {
                showText(  "#" + i +": " + imports.get(i) ,TextDisplayer.COMPILERTEXTS);
            }

            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
            //
            nl();
            showText("------------------------------------------------------",TextDisplayer.COMPILERTEXTS);
            showText("symbols table: ",TextDisplayer.COMPILERTEXTS);
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
            for (int i = 0; i < ts.size(); i++) {
                showText(  "#" + i +" id: " + ts.get(i).ident + " type: " + ts.get(i).type + " val: " + ts.get(i).val ,TextDisplayer.COMPILERTEXTS);
            }
            showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        }
        else
        {
            showText("program compiled with the following errors",TextDisplayer.COMPILERTEXTS);
            for (int i = 0; i < errors.size(); i++) {
                showText(errors.get(i),TextDisplayer.ERROR);
            }
        }
        return "";
    }



    // IMPORT STATEMENTS ###############################################################################################

    @Override
    public String visitImport_(SjParser.Import_Context ctx) {

        String left = String.valueOf( visit(ctx.identifier(0)) );
        String right = String.valueOf( visit(ctx.identifier(1)));
        String fname = left + "." + right;
        if ( imported(fname) )
        {
            errors.add("Package with the name '" + fname + "' already imported.");
            return "";
        }
        else
            imports.add( fname );
        return "";
    }

    // DECLARATION STATEMENTS ##########################################################################################

    @Override
    public String visitDeclaration(SjParser.DeclarationContext ctx) {
        String type = String.valueOf( visit(ctx.type()) );

        for (SjParser.IdentifierContext tokenNode : ctx.vars().identifier()) {
            if ( elemExist( tokenNode.getText() ) != -1 )
            {
                errors.add("variable with the name '" + tokenNode.getText() + "' already declared.");
                return "";
            }
            else
                ts.add( new Element( tokenNode.getText(), type ) );
        }
        return "ok";
    }

    // AFFECTATION STATEMENTS ##########################################################################################

    @Override
    public String visitAffectation(SjParser.AffectationContext ctx) {

        String id = String.valueOf( visit(ctx.identifier()) );
        String[] tmp = treatVal(visit(ctx.expr()));

        String type = tmp[0];
        String val  = tmp[1];

        int idEl = elemExist( id );
        if ( idEl == -1  )
        {
            errors.add("variable with the name '" + id + "' was not declared.");
            return "";
        }
        else {
            Element el = ts.get(idEl);
            if ( ! el.type.equals(type))
            {
                errors.add("Affecting a value of type '" + type + "' on the variable '" + el.ident + "' of type (" + el.type+").");
                return "";
            }
            else
                el.val = val;
        }
        return "";
    }

    // IF STATEMENTS ###################################################################################################
    @Override public String visitIfStatement(SjParser.IfStatementContext ctx) { return visitChildren(ctx); }


    // EXPRESSIONS STATEMANTS ##########################################################################################

    @Override public String visitParentExpr(SjParser.ParentExprContext ctx) { return visitChildren(ctx); }


    @Override public String visitMultExpr(SjParser.MultExprContext ctx) {
        String left = this.visit(ctx.expr(0));
        String right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case '*':
                return "";
            case '/':

            default:
                throw new RuntimeException("unknown operator: " + MuParser.tokenNames[ctx.op.getType()]);


                int idElLeft = elemExist(left);
                int idElRight = elemExist(right);

                if (idElLeft == -1) {
                    errors.add("variable with the name '" + left + "' was not declared.");
                    return "";
                } else {
                    Element ElLeft = ts.get(idElLeft);
                    if (idElRight == -1) {
                        errors.add("variable with the name '" + right + "' was not declared.");
                        return "";
                    } else {
                        Element ElRight = ts.get(idElRight);
                        switch (ctx.op.getText()) {
                            case "*":
                                if (ElLeft.type == "int") {

                                }
                                return "";

                        }
                    }
                }
                return visitChildren(ctx);
        }
    }
    /*

    @Override
    public String visitExpr(SjParser.ExprContext ctx) {
        if (ctx.val() != null) {
            return visit(ctx.val());
        }
        else if (ctx.identifier() != null) {
            return visit(ctx.identifier());
        }
        else if (ctx.idExpr() != null) { //TODO
            return visit(ctx.idExpr());
        }
        else if (ctx.intExpr() != null) { //TODO
            return visit(ctx.intExpr());
        }
        else if (ctx.floatExpr() != null) {//TODO
            return  visit(ctx.floatExpr());
        }
        else if (ctx.functionCall() != null) { //TODO
            return visit(ctx.functionCall());
        }
        else { //ctx.idExpr() //TODO
            return visit(ctx.idExpr());
        }
    }

    // ID EXPRESSIONS ##################################################################################################

    @Override public String visitParenIdArthExpr(SjParser.ParenIdArthExprContext ctx) { return visit(ctx.idArthExpr()); }

    @Override public String visitMultIdArthExpr(SjParser.MultIdArthExprContext ctx) {
        String left = this.visit(ctx.identifier(0));
        String right = this.visit(ctx.identifier(1));

        int idElLeft = elemExist( left );
        int idElRight = elemExist( right );

        if (idElLeft == -1) {
            errors.add("variable with the name '" + left + "' was not declared.");
            return "";
        } else {
            Element ElLeft = ts.get(idElLeft);
            if (idElRight == -1) {
                errors.add("variable with the name '" + right + "' was not declared.");
                return "";
            } else {
                Element ElRight = ts.get(idElRight);
                switch (ctx.op.getText()) {
                    case "*":
                        if (ElLeft.type == "int") {

                        }
                        return "";

                }
            }
        }
        return "";

    }
    */


    // IDENTIFIERS, VALUES, TYPES ######################################################################################

    @Override
    public String visitVal(SjParser.ValContext ctx) {
        //String rs;
        if (ctx.INTEGER_VAL() != null)
            return "0" + ctx.INTEGER_VAL();
        else if (ctx.FLOAT_VAL() != null)
            return "1" + ctx.FLOAT_VAL();
        else
            return "2" + ctx.STRING_VAL();
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

