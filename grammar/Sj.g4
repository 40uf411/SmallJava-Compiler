grammar Sj;
start: imports modificateur 'class_SJ' identifier '{' declarations  'main_SJ' '{' instructions  '}' ;

imports : import_* ;
import_ : ('import' identifier ';');

modificateur :  'public' | 'protected' ;

identifier : ID;

declarations : ( declaration ';' )*;
declaration  : type vars ';' ;
type         : INT | FLOAT | STRING | BOOL;
vars         : ((identifier ',' vars) | identifier) ;

instructions    : ( instruction ';')*;
instruction     : identifier '=' (expr | val);
expr            : '(' expr ')'                      #parenExpr
                | left=expr op=('*'|'/') right=expr #opExpr
                | left=expr op=('+'|'-') right=expr #opExpr
                | atom=INT                          #atomExpr
                ;
val             : INTEGER_VAL | FLOAT_VAL | STRING_VAL | BOOL_VAL;

INT     : 'int';
FLOAT   : 'float';
STRING  : 'String';
BOOL    : 'bool';


ID : [a-zA-Z][a-zA-Z0-9]*;

INTEGER_VAL : [+-]?[1-9][0-9]* ;
FLOAT_VAL   : INTEGER_VAL ('.'[0-9]*) ;
STRING_VAL  : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
            | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* ['] ;
BOOL_VAL    : 'true' | 'false';

COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;