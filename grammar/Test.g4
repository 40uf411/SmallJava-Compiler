grammar Test;

// L'analyse léxical#################################################
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;
ID : [a-zA-Z][a-zA-Z0-9]*;


// data types syntax
INTEGER_VAL : [+-]?[1-9][0-9]* ;
FLOAT_VAL   : INTEGER_VAL ('.'[0-9]*) ;
STRING_VAL  : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
            | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* ['] ;
BOOL_VAL    : 'true' | 'false';

PRINT   : 'print';
SCAN    : 'scan';



// L'analyse Syntaxique##############################################
// main shape of SmallJava code.
start: imports modificateur 'class_SJ' ID '{' declarations 'main_SJ' '{' instructions '}' '}';


// importing libreries syntax (ex: import foo; import bar;...)
imports : import_* ;
import_ : 'import' ID ';';

// Modificators
modificateur:
        'public'
        |'protected'
        ;

// declaration syntax
declarations:
        type vars ';' declarations
        |
        ;


// instuctions syntax
instructions    :instruction*;
instruction:
        affectation ';'
        |ifStatement
        ;

affectation     : ID '=' (val | ID | expr);
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : 'Si' '(' logical_expr ')' 'Alors' '{' instructions '}';
elseIfStat      : 'Sinon Si' '(' logical_expr ')' 'Alors' '{' instructions '}';
elseStat        : 'Sinon' '{' instructions '}';
/*


functionCall    : ID '(' exprList? ')'  #identifierFunctionCall
                | PRINT '(' expr ')'      #printFunctionCall
                | SCAN '(' exper ')'       #scanFunctionCall;

exprList        : exper ( ',' exper )* ;
*/
expr :
        '(' expr ')'                      #parenExpr
        | left=expr op=('*'|'/') right=expr #opExpr
        | left=expr op=('+'|'-') right=expr #opExpr
        | val                               #atomExpr
        | ID                                #atomExpr
        ;

logical_expr:
        '(' logical_expr ')'                      #parenExprlogic
        | left=logical_expr op=('>'|'<'|'='|'<='|'>='|'!=') right=logical_expr #opExprlogic
        | op='!' right=logical_expr               #opExprlogic
        | left=logical_expr op='&' right=logical_expr #opExprlogic
        | left=logical_expr op='|' right=logical_expr #opExprlogic
        | val                               #atomExprlogic
        | ID                                #atomExprlogic
        ;

vars:
        ID ',' vars
        | ID
        ;

val: INTEGER_VAL | FLOAT_VAL | STRING_VAL | BOOL_VAL;

type:
        'string_SJ'
        |'float_SJ'
        |'int_SJ'
        ;