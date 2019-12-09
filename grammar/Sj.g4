grammar Sj;
// main shape of SmallJava code.
start: imports modificator 'class' identifier '{' declarations  'main' '{' instructions  '}' ;

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

// if statment syntax
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : 'Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseIfStat      : 'Sinon Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseStat        : 'Sinon' '{' instructions '}';
ifCondition     : intExpr | floatExpr ;

bool            :  BOOL_T | BOOL_F ;
val             : INTEGER_VAL | FLOAT_VAL | STRING_VAL ;
// affectation syntax
affectation     : identifier '=' ( expression |  val );

// function call syntax
functionCall    : function=identifier '(' exprList? ')' #identifierFunctionCall ;

// list of expressions syntax
exprList        : expression ( ',' expression )* ;

// expression syntax
expression      : functionCall | intExpr | floatExpr | val | identifier;

// int expression syntax
intExpr         : intArthExpr | intCompExpr | intLogicExpr
                ;
// int arithmetic expressions syntax
intCondAtom     : '(' intCondAtom ')'
                | INTEGER_VAL | identifier
                ;
intArthExpr     : '(' intArthExpr ')' #parenIntArthExpr
                | intCondAtom           op=( '*' | '/' )    (  intArthExpr  | intCondAtom )     #multIntArthExpr
                | intArthExpr           op=( '*' | '/' )    (  intArthExpr  | intCondAtom )     #multIntArthExpr
                | intCondAtom           op=( '+' | '-' )    ( intArthExpr  | intCondAtom )     #addIntArthExpr
                | intArthExpr           op=( '+' | '-' )    ( intArthExpr  | intCondAtom )     #addIntArthExpr
                ;
// int comparision expressions syntax
intCompExpr     : '(' intCompExpr ')'
                | intCondAtom           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intCondAtom | intCompExpr | intArthExpr )
                | intCompExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intCondAtom | intCompExpr | intArthExpr )
                | intArthExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intCondAtom | intCompExpr | intArthExpr )
                ;
// int logical expressions syntax
intLogicExpr    : '!' intLogicExpr
                | '(' intLogicExpr ')'
                | intCondAtom           op=( '&&' | '||' )    ( intLogicExpr | intCondAtom | intCompExpr | intArthExpr )
                | intLogicExpr          op=( '&&' | '||' )    ( intLogicExpr | intCondAtom | intCompExpr | intArthExpr )
                | intCompExpr           op=( '&&' | '||' )    ( intLogicExpr | intCondAtom | intCompExpr | intArthExpr )
                | intArthExpr           op=( '&&' | '||' )    ( intLogicExpr | intCondAtom | intCompExpr | intArthExpr )
                ;

// float expression syntax

floatExpr       : floatArthExpr | floatCompExpr | floatLogicExpr
                ;
floatCondAtom   : '(' floatCondAtom ')'
                | FLOAT_VAL | identifier
                ;
// float arithmetic expressions syntax
floatArthExpr   : '(' floatArthExpr ')' #parenFloatArthExpr
                | floatCondAtom           op=( '*' | '/' )    (  floatArthExpr  | floatCondAtom )     #multFloatArthExpr
                | floatArthExpr           op=( '*' | '/' )    (  floatArthExpr  | floatCondAtom )     #multFloatArthExpr
                | floatCondAtom           op=( '+' | '-' )    (  floatArthExpr  | floatCondAtom )     #addFloatArthExpr
                | floatArthExpr           op=( '+' | '-' )    (  floatArthExpr  | floatCondAtom )     #addFloatArthExpr
                ;
// float comparision expressions syntax
floatCompExpr   : '(' floatCompExpr ')'
                | floatCondAtom           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatCondAtom | floatCompExpr | floatArthExpr )
                | floatCompExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatCondAtom | floatCompExpr | floatArthExpr )
                | floatArthExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatCondAtom | floatCompExpr | floatArthExpr )
                ;
// int logical expressions syntax
floatLogicExpr  : '!' floatLogicExpr
                | '(' floatLogicExpr ')'
                | floatCondAtom           op=( '&&' | '||' )    ( floatLogicExpr | floatCondAtom | floatCompExpr | floatArthExpr )
                | floatLogicExpr          op=( '&&' | '||' )    ( floatLogicExpr | floatCondAtom | floatCompExpr | floatArthExpr )
                | floatCompExpr           op=( '&&' | '||' )    ( floatLogicExpr | floatCondAtom | floatCompExpr | floatArthExpr )
                | floatArthExpr           op=( '&&' | '||' )    ( floatLogicExpr | floatCondAtom | floatCompExpr | floatArthExpr )
                ;

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
BOOL_T    : 'true' ;
BOOL_F      : 'false';

//keywords

IF      : 'if';
ELSE_IF : 'elif';
ELSE    : 'else';

PRINT   : 'print';
SCAN    : 'scan';


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;