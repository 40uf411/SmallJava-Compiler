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
vars         : ((identifier ',' vars) | identifier) ;

// instuctions syntax
instructions    : ( instruction ';')*;
instruction     : affectation | ifStatement;

affectation     : identifier '=' (expr | val);

ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : If '(' expression ')' '{' instructions '}';
elseIfStat      : ElIf '(' expression ')' '{' instructions '}';
elseStat        : Else '{' block '}';


functionCall    : identifier '(' exprList? ')'  #identifierFunctionCall
                | PRINT '(' expression ')'      #printFunctionCall
                | SCAN '(' expression ')'       #scanFunctionCall;

exprList        : expression ( ',' expression )* ;

expr            : '(' expr ')'                      #parenExpr
                | left=expr op=('*'|'/') right=expr #opExpr
                | left=expr op=('+'|'-') right=expr #opExpr
                | atom=INT                          #atomExpr
                ;

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

PRINT   : 'print';
SCAN    : 'scan';


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;