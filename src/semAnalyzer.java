import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class semAnalyzer extends SjBaseVisitor<String> {

    // One Element of symbols table CLASS ##############################################################################


// needed variables ####################################################################################################

    public static List<Element> ts = Main.ts;
    public static List<String> imports = Main.imports;
    public static List<String> errors = Main.errors;


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
                else {
                    errors.add("using an undeclared variable '" + s + "'.");
                }
                break;
        }
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
            for (String e : errors) {
                showText(e,TextDisplayer.ERROR);
            }
        }
        return " ";
    }



    // IMPORT STATEMENTS ###############################################################################################
    @Override
    public String visitImport_(SjParser.Import_Context ctx) {

        String left = String.valueOf( ctx.ID(0) );
        String right = String.valueOf( ctx.ID(1) );
        String fname = left + "." + right;
        if ( imported(fname) )
        {
            errors.add("Package with the name '" + fname + "' already imported.");
            return " ";
        }
        else
            imports.add( fname );
        return " ";
    }


    // DECLARATION STATEMENTS ##########################################################################################
    @Override
    public String visitDeclaration(SjParser.DeclarationContext ctx) {
        String type = String.valueOf( visit(ctx.type()) );

        for (SjParser.IdentifierContext tokenNode : ctx.vars().identifier()) {
            if ( elemExist( tokenNode.getText() ) != -1 )
            {
                errors.add("variable with the name '" + tokenNode.getText() + "' already declared.");
                return " ";
            }
            else
                ts.add( new Element( tokenNode.getText(), type) );
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
            return " ";
        }
        else {
            Element el = ts.get(idEl);
            if ( ! el.type.equals(type))
            {
                errors.add("Affecting a value of type '" + type + "' on the variable '" + el.ident + "' of type (" + el.type+").");
                return " ";
            }
            else
                el.val = val;
        }
        return " ";
    }

    // IF STATEMENTS ###################################################################################################
    @Override public String visitIfStatement(SjParser.IfStatementContext ctx) { return visitChildren(ctx); }


     // EXPRESSIONS STATEMANTS ##########################################################################################

    @Override
    public String visitArthExpr(SjParser.ArthExprContext ctx) {
        String[] left  = treatVal( visit(ctx.left));
        String[] right = treatVal( visit(ctx.right));
        String op = String.valueOf(ctx.getChild(1).getText());

        String[] allowed_types = {"int", "float"};

        if ( Arrays.asList(allowed_types).contains(left[0]) && left[0].equals(right[0]) ) { // '&& left[0].equals(right[0])' add this if u want to stop mixing types in operations

            if (left[0].equals("int"))
            {

                int rslt = 0;
                switch (op){
                    case "+":
                        rslt = (Integer.valueOf(left[1]) +  Integer.valueOf(right[1]));
                        break;
                    case "-":
                        rslt = (Integer.valueOf(left[1]) -  Integer.valueOf(right[1]));
                        break;
                    case "*":
                        rslt = (Integer.valueOf(left[1]) *  Integer.valueOf(right[1]));
                        break;
                    case "/":
                        if( Integer.valueOf(right[1]) == 0){
                            errors.add("division by 0");
                            return "0";
                        }
                        rslt = (Integer.valueOf(left[1]) /  Integer.valueOf(right[1]));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                return "0" + rslt;
            }
            else
            {
                float rslt = 0;
                switch (op){
                    case "+":
                        rslt = (Float.valueOf(left[1]) +  Float.valueOf(right[1]));
                        break;
                    case "-":
                        rslt = (Float.valueOf(left[1]) -  Float.valueOf(right[1]));
                        break;
                    case "*":
                        rslt = (Float.valueOf(left[1]) *  Float.valueOf(right[1]));
                        break;
                    case "/":
                        if( Integer.valueOf(right[1]) == 0){
                            errors.add("division by 0");
                            return "0";
                        }
                        rslt = (Float.valueOf(left[1]) /  Float.valueOf(right[1]));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                return "1" + rslt;
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

    @Override public String visitOpCompExpr(SjParser.OpCompExprContext ctx) {
        String[] left  = treatVal(visit(ctx.getChild(0)));
        String[] right = treatVal(visit(ctx.getChild(2)));

        String op = String.valueOf(ctx.getChild(1).getText());
        if ( !left[0].equals("string") && !right[0].equals("string")) {
            String rslt = "";
            switch (op){
                case ">":
                    if ( Float.valueOf(left[1]) > Float.valueOf(right[1])) {rslt = "true";} else {rslt = "false";}
                    break;
                case ">=":
                    if ( Float.valueOf(left[1]) >= Float.valueOf(right[1])) {rslt = "true";} else {rslt = "false";}
                    break;
                case "==":
                    if ( Float.valueOf(left[1]).equals(Float.valueOf(right[1])) ) {rslt = "true";} else {rslt = "false";}
                    break;
                case "!=":
                    if ( !Float.valueOf(left[1]).equals(Float.valueOf(right[1])) ) {rslt = "true";} else {rslt = "false";}
                    break;
                case "<=":
                    if ( Float.valueOf(left[1]) <= Float.valueOf(right[1])) {rslt = "true";} else {rslt = "false";}
                    break;
                case "<":
                    if ( Float.valueOf(left[1]) < Float.valueOf(right[1])) {rslt = "true";} else {rslt = "false";}
                    break;
                default:
                    errors.add("Operator" + op + "can't be applied here");
                    break;
            }
            return "2" + rslt;
        } else if (left[0].equals("string") && right[0].equals("string")) {
            String rslt = "";
            switch (op){
                case "==":
                    if ( String.valueOf(left[1]).equals(String.valueOf(right[1])) ) {rslt = "true";} else {rslt = "false";}
                    break;
                case "!=":
                    if ( !String.valueOf(left[1]).equals(String.valueOf(right[1])) ) {rslt = "true";} else {rslt = "false";}
                    break;
                default:
                    errors.add("Operator" + op + "can't be applied for strings");
                    break;
            }
            return "2" + rslt;
        } else {
            errors.add("can't execute operation '" + op + "' on " + left[0] + "type and a" + right[0] + "type");
        }
        return "";
    }

    @Override public String visitNotLogicExpr(SjParser.NotLogicExprContext ctx) {
        String[] right  = treatVal(visit(ctx.getChild(1)));
        if (right[1].equals("true")) {return "2" + "false";} else {return "2" + "true";}
    }
    /*
    @Override public String visitNotId(SjParser.NotIdContext ctx) {
        String[] right  = treatVal(visit(ctx.getChild(1)));
        if (right[0].equals("int") || right[0].equals("float")) {
            // every value is equal to true except 0
            if ( !Float.valueOf(right[1]).equals(0.0) ) {return "2" + "true";} else {return "2" + "false";}
        } else {
            // if it's a string it's automatically true
            return "2" + "true";
        }
    }
    */
    @Override public String visitOpLogicExpr(SjParser.OpLogicExprContext ctx) {
        String[] left  = treatVal(visit(ctx.getChild(0)));
        String[] right = treatVal(visit(ctx.getChild(2)));

        String op = String.valueOf(ctx.getChild(1).getText());
        if (!left[0].equals("string")) {
            // every value is equal to true except 0
            if ( !Float.valueOf(left[1]).equals(0.0) ) {left[1] =  "true";} else {left[1] =  "false";}
        }
        if (!right[0].equals("string")) {
            // every value is equal to true except 0
            if ( !Float.valueOf(right[1]).equals(0.0) ) {right[1] =  "true";} else {right[1] =  "false";}
        }

        switch (op) {
            case "|":
                if (left[1].equals("true") || right[1].equals("true")) {return "2" + "true";} else {return "2" + "false";}
            case "&":
                if (left[1].equals("true") && right[1].equals("true")) {return "2" + "true";} else {return "2" + "false";}
            default:
                errors.add("Operator" + op + "can't be applied here");
                break;
        }
        return "";
    }


    // IDENTIFIERS, VALUES, TYPES ######################################################################################
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

    @Override public String visitIn_sj(SjParser.In_sjContext ctx) {
        if ( ! imported("Small_Java.io")) {
            errors.add("undefined function in_sj try to import Small_Java.io");
        }
        return "";
    }

    @Override public String visitOut_sj(SjParser.Out_sjContext ctx) {
        if ( ! imported("Small_Java.io")) {
            errors.add("undefined function out_sj try to import Small_Java.io");
        }
        return "";
    }

    @Override
    public String visitIfCondition(SjParser.IfConditionContext ctx) {
        if ( ! imported("Small_Java.lang")) {
            errors.add("unable to make conditional instructions, try to import Small_Java.lang");
        }
        return super.visitIfCondition(ctx);
    }
}

