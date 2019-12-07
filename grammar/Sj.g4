grammar Sj;
// main shape of SmallJava code.
start: imports modificator 'class_SJ' identifier '{' declarations  'main_SJ' '{' instructions  '}' ;

// importing libreries syntax (ex: import foo; import bar;...)
imports : import_* ;
import_ : ('import' identifier ';');

// modificators syntax
modificator : 'public'
            | 'protected'
            ;

identifier : ID;

// declaration syntax
declarations : ( declaration ';' )*;
declaration  : type vars ;

type         : INT | FLOAT | STRING;
vars         : identifier ( ',' vars )* ;

// instuctions syntax
instructions    : instruction *;
instruction     : ifStatement | ( affectation ';' ) | ( functionCall ';' );

// affectation syntax
affectation     : identifier '=' (expression |  (INTEGER_VAL | FLOAT_VAL | STRING_VAL) );

// if statment syntax
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : IF '(' ( intLogicExpr | floatLogicExpr ) ')' '{' instructions '}';
elseIfStat      : ELSE_IF '(' ( intLogicExpr | floatLogicExpr ) ')' '{' instructions '}';
elseStat        : ELSE '{' instructions '}';

// function call syntax
functionCall    : function=identifier '(' exprList? ')'                     #identifierFunctionCall
                | function=('print'|'scan') '(' STRING_VAL ',' exprList ')' #ioFunctionCall
                ;

// list of expressions syntax
exprList        : expression ( ',' expression )* ;

// expression syntax
expression      : intExpr | floatExpr
                | '(' expression ')'
                | intExpr
                | floatExpr
                | STRING_VAL
                ;

// int expression syntax
intExpr         : INTEGER_VAL | identifier
                | intArthExpr | intCompExpr | intArthExpr
                ;
// int arithmetic expressions syntax
intArthExpr     : ( '(' intArthExpr ')' | INTEGER_VAL | identifier )   op=( '*' | '/' )    ( '(' intArthExpr ')' | INTEGER_VAL | identifier )     #multIntArthExpr
                | ( '(' intArthExpr ')' | INTEGER_VAL | identifier )   op=( '+' | '-' )    ( '(' intArthExpr ')' | INTEGER_VAL | identifier )     #addIntArthExpr
                ;
// int comparision expressions syntax
intCompExpr     : ( '(' intArthExpr ')' | '(' intCompExpr ')' | INTEGER_VAL | identifier )   op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( '(' intArthExpr ')' | '(' intCompExpr ')' | INTEGER_VAL | identifier );
// int logical expressions syntax
intLogicExpr    : ('!')? ( ( '(' intLogicExpr ')')
                           | ( '(' intLogicExpr | '(' intArthExpr ')' | '(' intCompExpr ')' | INTEGER_VAL | identifier )   op=( '&&' | '||' )    ( intLogicExpr | '(' intArthExpr ')' | '(' intCompExpr ')' | INTEGER_VAL | identifier )
                         );

// float expression syntax
floatExpr       : FLOAT_VAL | identifier
                | floatArthExpr | floatCompExpr | floatLogicExpr
                ;
// float arithmetic expressions syntax
floatArthExpr   : ( '(' floatArthExpr ')' | FLOAT_VAL | identifier )   op=( '*' | '/' )    ( '(' floatArthExpr ')' | FLOAT_VAL | identifier )
                | ( '(' floatArthExpr ')' | FLOAT_VAL | identifier )   op=( '+' | '-' )    ( '(' floatArthExpr ')' | FLOAT_VAL | identifier )
                ;
// float comparision expressions syntax
floatCompExpr   : ( '(' floatCompExpr ')' | '(' floatArthExpr ')' | FLOAT_VAL | identifier )     op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( '(' floatCompExpr ')' | '(' floatArthExpr ')' | FLOAT_VAL | identifier );
// int logical expressions syntax
floatLogicExpr  :  ('!')? ( ( '(' floatLogicExpr ')')
                            | ( '(' floatLogicExpr | '(' floatArthExpr ')' | '(' floatCompExpr ')' | INTEGER_VAL | identifier )   op=( '&&' | '||' )    ( floatLogicExpr | '(' floatArthExpr ')' | '(' floatCompExpr ')' | FLOAT_VAL | identifier )
                          );

// data types
INT     : 'int';
FLOAT   : 'float';
STRING  : 'String';

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