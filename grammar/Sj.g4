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
functionCall    : functionType '('  stringAtom  (',' exprList)? ')' #idFunctionCall ;
functionType: 'Out_SJ' | 'In_SJ';

// list of expressions syntax (function call)
exprList        : expr ( ',' expr )* ;
// expression syntax (affectation, exprList) ###########################################################################
expr            :'(' expr ')'                                           #parentExpr
                | left=expr op=('*'|'/') right=expr                     #arthExpr
                | left=expr op=('+'|'-') right=expr                     #arthExpr
                | atom                                                  #arthExpr
                ;

//expr            : arthExpr | compExpr | logicExpr | val | identifier;

// int comparision expressions syntax
compExpr        : '(' compExpr ')'                                                                  #parenCompExpr
                | left=compExpr  op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    right=compExpr     #opCompExpr
                | expr                                                                              #atomCompExpr
                ;

// int logical expressions syntax
logicExpr       : '(' logicExpr ')'                                                   #parenLogicExpr
                |'!' logicExpr                                                        #notLogicExpr
                | left=logicExpr   op=( '&' | '|' )   left=logicExpr              #opLogicExpr
                | compExpr                                                            #atomLogic
                ;


atom:           idAtom
                |intAtom
                |floatAtom
                ;


intAtom         : '(' intAtom ')'
                | INTEGER_VAL
                ;
floatAtom       : '(' floatAtom ')'
                | FLOAT_VAL
                ;
stringAtom      : '(' stringAtom ')'
                | STRING_VAL
                ;
idAtom          : '(' idAtom ')'
                | identifier
                ;
identifier: ID;

// data types
INT     : 'int';
FLOAT   : 'float';
STRING  : 'string';

// ID syntaxs
ID : [a-zA-Z][a-zA-Z0-9]*;

// data types syntax
INTEGER_VAL : [+-]?[0-9][0-9]* ;
FLOAT_VAL   : INTEGER_VAL ('.'[0-9]*) ;
STRING_VAL  : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
            | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* ['] ;
BOOL_T    : 'true' ;
BOOL_F      : 'false';

//keywords


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;