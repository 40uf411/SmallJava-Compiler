grammar Sj;
// main shape of SmallJava code.
start: imports modificator 'class_SJ' identifier '{' declarations  'main_SJ' '{' instructions  '}' ;

// importing libreries syntax (ex: import foo; import bar;...)
imports : import_* ;
import_ : ('import' identifier ';');

// modificators syntax
modificator :  MODIFICATOR ;

identifier : ID;

// declaration syntax
declarations : ( declaration ';' )*;
declaration  : type vars ';' ;

type         : INT | FLOAT | STRING | BOOL;
vars         : identifier ( ',' vars )* ;

// instuctions syntax
instructions    : ( instruction ';')*;
instruction     : affectation | ifStatement | functionCall;

affectation     : identifier '=' (expression | val);

ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : IF '(' expression ')' '{' instructions '}';
elseIfStat      : ELSE_IF '(' expression ')' '{' instructions '}';
elseStat        : ELSE '{' instructions '}';


functionCall    : function=identifier '(' exprList? ')'                     #identifierFunctionCall
                | function=('print'|'scan') '(' STRING_VAL ',' exprList ')' #ioFunctionCall
                ;

exprList        : expression ( ',' expression )* ;

expression      : intExpr | floatExpr
                | '(' expression ')'
                ;

intExpr         : INTEGER_VAL
                | intArthExpr | intCompExpr | intArthExpr
                ;
intArthExpr     : ( intArthExpr | INTEGER_VAL )   op=( '*' | '/' )    ( intArthExpr | INTEGER_VAL )     #multIntArthExpr
                | ( intArthExpr | INTEGER_VAL )   op=( '+' | '-' )    ( intArthExpr | INTEGER_VAL )     #addIntArthExpr
                ;
intCompExpr     : ( intArthExpr | intCompExpr | INTEGER_VAL )   op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intArthExpr | intCompExpr | INTEGER_VAL );
intLogicExpr    : ('!')?  intLogicExpr  | ( '(' intLogicExpr ')')
                | ( intLogicExpr | intArthExpr | intCompExpr | INTEGER_VAL )   op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intLogicExpr | intArthExpr | intCompExpr | INTEGER_VAL );

floatExpr       : INTEGER_VAL
                | floatArthExpr | floatCompExpr | floatLogicExpr
                ;
floatArthExpr   : ( floatArthExpr | FLOAT_VAL )   op=( '*' | '/' )    ( floatArthExpr | FLOAT_VAL )
                | ( floatArthExpr | FLOAT_VAL )   op=( '+' | '-' )    ( floatArthExpr | FLOAT_VAL )
                ;
floatCompExpr   : ( intArthExpr | intCompExpr | FLOAT_VAL )     op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intArthExpr | intCompExpr | INTEGER_VAL );

floatLogicExpr  : ('!')? ( (intLogicExpr | floatLogicExpr) | ( '(' intLogicExpr | floatLogicExpr ')'))
                | ( floatLogicExpr | intArthExpr | intCompExpr | FLOAT_VAL )     op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatLogicExpr | intArthExpr | intCompExpr | FLOAT_VAL );


val             : INTEGER_VAL | FLOAT_VAL | STRING_VAL | BOOL_VAL;

// data types
INT     : 'int';
FLOAT   : 'float';
STRING  : 'String';
BOOL    : 'bool';

// identifier syntaxs
ID : [a-zA-Z][a-zA-Z0-9]*;

// data types syntax
INTEGER_VAL : [+-]?[1-9][0-9]* ;
FLOAT_VAL   : INTEGER_VAL ('.'[0-9]*) ;
STRING_VAL  : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
            | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* ['] ;
BOOL_VAL    : 'true' | 'false';

//keywords
MODIFICATOR : 'public' | 'protected';

IF      : 'if';
ELSE_IF : 'elif';
ELSE    : 'else';

PRINT   : 'print';
SCAN    : 'scan';


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;