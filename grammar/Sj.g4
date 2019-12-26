grammar Sj;
// main shape of SmallJava code.
start: imports modificator 'class_SJ' ID '{' declarations  'main_SJ' '{' instructions  '}' ;

// importing libreries syntax (ex: import foo; import bar;...)##########################################################
imports : import_* ;
import_ : 'import' ID '.' ID ';';


// modificators syntax #################################################################################################
modificator : 'public'
            | 'protected'
            ;



// declaration syntax ##################################################################################################
declarations : ( declaration ';' )*;
declaration  : type vars ;

type         : INT | FLOAT | STRING;
vars         : identifierdec ( ',' identifierdec )* ;




// instuctions syntax ##################################################################################################
instructions    : instruction *;
instruction     : ifStatement
                | affectation ';'
                | functionCall ';'
                ;


// if statment syntax ##################################################################################################
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : 'Si' '(' expr ')' 'Alors' '{' instructions '}';
elseIfStat      : 'Sinon Si' '(' expr ')' 'Alors' '{' instructions '}';
elseStat        : 'Sinon' '{' instructions '}';

//bool            :  BOOL_T | BOOL_F ;

// affectation syntax ##################################################################################################
affectation     : identifier '=' expr
                ;


// function call syntax ################################################################################################
functionCall    : ('Out_SJ' | 'In_SJ') '('  STRING_VAL  ',' exprList? ')' #idFunctionCall ;

// list of expressions syntax (function call)
exprList        : expr ( ',' expr )* ;


// expression syntax (affectation, exprList) ###########################################################################

expr            :'(' expr ')'                                           #parentExpr
                | left=expr op=('*'|'/') right=expr                     #multExpr
                | left=expr op=('+'|'-') right=expr                     #plusExpr
                | left=expr op=('>'|'<'|'='|'<='|'>='|'!=') right=expr  #opExprLogic
                | op='!' right=expr                                     #opNotlogic
                | left=expr op=('&' | '||') right=expr                  #opAndOrlogic
                | identifier                                            #idExpr
                | val                                                   #valExpr

                ;

val             : INTEGER_VAL | FLOAT_VAL | STRING_VAL ;

identifier: ID;

identifierdec: ID;


// data types
INT     : 'int_SJ';
FLOAT   : 'float_SJ';
STRING  : 'String_SJ';

// ID syntaxs
ID : [a-zA-Z][a-zA-Z0-9]*;

// data types syntax
INTEGER_VAL : [+-]?[1-9][0-9]* ;
FLOAT_VAL   : INTEGER_VAL ('.'[0-9]*) ;
STRING_VAL  : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
            | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* ['] ;
BOOL_T    : 'true' ;
BOOL_F      : 'false';

//keywords


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;