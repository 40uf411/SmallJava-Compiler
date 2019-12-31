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

vars         : identifier ( ',' identifier )* ;


// instuctions syntax ##################################################################################################
instructions    : instruction *;
instruction     : ifStatement           #ifInstruction
                | affectation ';'       #afctInstruction
                | functionCall ';'      #funcCallInstruction
                ;


// if statment syntax ##################################################################################################
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : 'Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseIfStat      : 'Sinon Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseStat        : 'Sinon' '{' instructions '}';

ifCondition     : logicExpr | compExpr;
//bool            :  BOOL_T | BOOL_F ;


// affectation syntax ##################################################################################################
affectation     : identifier '=' expr
                ;


// function call syntax ################################################################################################
functionCall    : ('Out_SJ' | 'In_SJ') '('  STRING_VAL  ',' exprList? ')' #idFunctionCall ;


// list of expressions syntax (function call)
exprList        : expr ( ',' expr )* ;
// expression syntax (affectation, exprList) ###########################################################################
//expr1            :'(' expr ')'                                           #parentExpr
//                | left=expr op=('*'|'/') right=expr                     #multExpr
//                | left=expr op=('+'|'-') right=expr                     #plusExpr
//                | left=expr op=('>'|'<'|'='|'<='|'>='|'!=') right=expr  #opExprLogic
//                | op='!' right=expr                                     #opNotlogic
//                | left=expr op=('&' | '||') right=expr                  #opAndOrlogic
//                | identifier                                            #idExpr
//                | val                                                   #valExpr
//                ;

expr            : arthExpr | compExpr | logicExpr | val | identifier;

// id arithmetic expressions syntax
arthExpr        : '(' arthExpr ')'                                                                          #parenArthExpr
                | numval                op=( '*' | '/' )    (  arthExpr  | idAtom | numval )                #multArthExpr
                | idAtom                op=( '*' | '/' )    (  arthExpr  | idAtom | numval )                #multArthExpr
                | arthExpr              op=( '*' | '/' )    (  arthExpr  | idAtom | numval )                #multArthExpr

                | numval                op=( '+' | '-' )    ( arthExpr  | idAtom | numval )                 #addArthExpr
                | idAtom                op=( '+' | '-' )    (  arthExpr  | idAtom | numval )                #addArthExpr
                | arthExpr              op=( '+' | '-' )    ( arthExpr  | idAtom | numval )                 #addArthExpr
                ;
// int comparision expressions syntax
compExpr        : '(' compExpr ')'                                                                                                   #parenCompExpr
                | numval                op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | numval | compExpr | arthExpr )    #opCompExpr
                | idAtom                op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | numval | compExpr | arthExpr )    #opCompExpr
                | compExpr              op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | numval | compExpr | arthExpr )    #opCompExpr
                | arthExpr              op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | numval | compExpr | arthExpr )    #opCompExpr
                ;

// int logical expressions syntax
logicExpr       : '!' logicExpr                                                                                                 #notLogicExpr
                | '(' logicExpr ')'                                                                                             #parenLogicExpr
                | numval                op=( '&' | '|' )    ( logicExpr | idAtom | numval | compExpr | arthExpr )               #opLogicExpr
                | idAtom                op=( '&' | '|' )    ( logicExpr | idAtom | numval | compExpr | arthExpr )               #opLogicExpr
                | logicExpr             op=( '&' | '|' )    ( logicExpr | idAtom | numval | compExpr | arthExpr )               #opLogicExpr
                | compExpr              op=( '&' | '|' )    ( logicExpr | idAtom | numval | compExpr | arthExpr )               #opLogicExpr
                | arthExpr              op=( '&' | '|' )    ( logicExpr | idAtom | numval | compExpr | arthExpr )               #opLogicExpr
                ;



val             : numval | stringAtom ;
numval          : intAtom | floatAtom;

intAtom         : '(' intAtom ')'
                | INTEGER_VAL
                ;
floatAtom       : '(' floatAtom ')'
                | FLOAT_VAL
                ;
stringAtom      : '(' stringAtom ')'
                | STRING_val
                ;
idAtom          : '(' idAtom ')'
                | identifier
                ;
identifier: ID;

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