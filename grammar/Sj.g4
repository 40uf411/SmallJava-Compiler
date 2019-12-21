grammar Sj;
// main shape of SmallJava code.
start: imports modificator 'class' identifier '{' declarations  'main' '{' instructions  '}' ;

// importing libreries syntax (ex: import foo; import bar;...)
imports : import_* ;
import_ : ('import' identifier '.' identifier ';');

// modificators syntax
modificator : 'public'
            | 'protected'
            ;

identifier : ID;

// declaration syntax
declarations : ( declaration ';' )*;
declaration  : type vars ;

type         : INT | FLOAT | STRING;
vars         : identifier ( ',' identifier )* ;

// instuctions syntax
instructions    : instruction *;
instruction     : ifStatement | ( affectation ';' ) | ( functionCall ';' );

// if statment syntax
ifStatement     : ifStat elseIfStat* elseStat?  ;
ifStat          : 'Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseIfStat      : 'Sinon Si' '(' ifCondition ')' 'Alors' '{' instructions '}';
elseStat        : 'Sinon' '{' instructions '}';
ifCondition     : idLogicExpr | idCompExpr | intLogicExpr | intCompExpr | floatLogicExpr | floatCompExpr ;

bool            :  BOOL_T | BOOL_F ;
val             : INTEGER_VAL | FLOAT_VAL | STRING_VAL ;
// affectation syntax
affectation     : identifier '=' expression #exprAffect
                | identifier '=' val        #valAffect
                ;

// function call syntax
functionCall    : function=identifier '(' exprList? ')' #identifierFunctionCall ;

// list of expressions syntax
exprList        : expression ( ',' expression )* ;

// expression syntax
expression      : functionCall | idExpr | intExpr | floatExpr | val | identifier;

idExpr          : idArthExpr | idCompExpr | idLogicExpr
                ;
// id arithmetic expressions syntax
idArthExpr      : '(' idArthExpr ')'                                                    #parenIdArthExpr
                | left=identifier           op=( '*' | '/' )    right=identifier        #multIdArthExpr
                | left=identifier           op=( '+' | '-' )    right=identifier        #addIdArthExpr
                ;
// id comparision expressions syntax
idCompExpr      : '(' idCompExpr ')'
                | left=identifier           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    right=identifier
                ;
// id logical expressions syntax
idLogicExpr     : '!' idLogicExpr                                                       #nIdLogicExpr
                | '(' idLogicExpr ')'                                                   #parenIdLogicExpr
                | left=identifier           op=( '&&' | '||' )    right=identifier      #opIdLogicExpr
                ;
// int expression syntax
intExpr         : intArthExpr | intCompExpr | intLogicExpr
                ;
// int arithmetic expressions syntax
intAtom         : '(' intAtom ')'
                | INTEGER_VAL
                ;
floatAtom       : '(' floatAtom ')'
                | FLOAT_VAL
                ;
idAtom          : '(' idAtom ')'
                | identifier
                ;
intArthExpr     : '(' intArthExpr ')'                                                                           #parenIntArthExpr
                | intAtom               op=( '*' | '/' )    (  intArthExpr  | idAtom | intAtom )                #multIntArthExpr
                | idAtom                op=( '*' | '/' )    (  intArthExpr  | intAtom )                         #multIntArthExpr
                | intArthExpr           op=( '*' | '/' )    (  intArthExpr  | idAtom | intAtom )                #multIntArthExpr

                | intAtom               op=( '+' | '-' )    ( intArthExpr  | idAtom | intAtom )                 #addIntArthExpr
                | idAtom                op=( '+' | '-' )    ( intArthExpr  | intAtom )                          #addIntArthExpr
                | intArthExpr           op=( '+' | '-' )    ( intArthExpr  | idAtom | intAtom )                 #addIntArthExpr
                ;
// int comparision expressions syntax
intCompExpr     : '(' intCompExpr ')'                                                                                                       #parenIntCompExpr
                | intAtom               op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | intAtom | intCompExpr | intArthExpr )    #intIntCompExpr
                | idAtom                op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( intAtom | intCompExpr | intArthExpr )             #idIntCompExpr
                | intCompExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | intAtom | intCompExpr | intArthExpr )    #intCompExpr2
                | intArthExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( idAtom | intAtom | intCompExpr | intArthExpr )    #intArthExpr2
                ;
// int logical expressions syntax
intLogicExpr    : '!' intLogicExpr                                                                                                          #nIntLogicExpr
                | '(' intLogicExpr ')'                                                                                                      #parenIntLogicExpr
                | intAtom               op=( '&&' | '||' )    ( intLogicExpr | idAtom | intAtom | intCompExpr | intArthExpr )               #intAtomIntLogicExpr
                | idAtom                op=( '&&' | '||' )    ( intLogicExpr | intAtom | intCompExpr | intArthExpr )                        #idAtomintLogicExpr
                | intLogicExpr          op=( '&&' | '||' )    ( intLogicExpr | idAtom | intAtom | intCompExpr | intArthExpr )               #intLogicExpr2
                | intCompExpr           op=( '&&' | '||' )    ( intLogicExpr | idAtom | intAtom | intCompExpr | intArthExpr )               #intCompExprIntLogicExpr
                | intArthExpr           op=( '&&' | '||' )    ( intLogicExpr | idAtom | intAtom | intCompExpr | intArthExpr )               #intArthExprIntLogicExpr
                ;

// float expression syntax

floatExpr       : floatArthExpr | floatCompExpr | floatLogicExpr
                ;
// float arithmetic expressions syntax
floatArthExpr   : '(' floatArthExpr ')' #parenFloatArthExpr
                | floatAtom               op=( '*' | '/' )    (  floatArthExpr  | floatAtom | idAtom )                  #multFloatArthExpr
                | idAtom                  op=( '*' | '/' )    (  floatArthExpr  | floatAtom )               #multFloatArthExpr
                | floatArthExpr           op=( '*' | '/' )    (  floatArthExpr  | floatAtom | idAtom )      #multFloatArthExpr

                | floatAtom               op=( '+' | '-' )    (  floatArthExpr  | floatAtom | idAtom )                  #addFloatArthExpr
                | idAtom                  op=( '+' | '-' )    (  floatArthExpr  | floatAtom )               #addFloatArthExpr
                | floatArthExpr           op=( '+' | '-' )    (  floatArthExpr  | floatAtom | idAtom )      #addFloatArthExpr
                ;
// float comparision expressions syntax
floatCompExpr   : '(' floatCompExpr ')'
                | floatAtom               op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatAtom | idAtom | floatCompExpr | floatArthExpr )
                | idAtom                  op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatAtom | floatCompExpr | floatArthExpr )
                | floatCompExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatAtom | idAtom | floatCompExpr | floatArthExpr )
                | floatArthExpr           op=( '>' | '>=' | '==' | '!=' | '<=' | '<' )    ( floatAtom | idAtom | floatCompExpr | floatArthExpr )
                ;
// int logical expressions syntax
floatLogicExpr  : '!' floatLogicExpr
                | '(' floatLogicExpr ')'
                | floatAtom               op=( '&&' | '||' )    ( floatLogicExpr | floatAtom | idAtom | floatCompExpr | floatArthExpr )
                | idAtom                  op=( '&&' | '||' )    ( floatLogicExpr | floatAtom | floatCompExpr | floatArthExpr )
                | floatLogicExpr          op=( '&&' | '||' )    ( floatLogicExpr | floatAtom | idAtom | floatCompExpr | floatArthExpr )
                | floatCompExpr           op=( '&&' | '||' )    ( floatLogicExpr | floatAtom | idAtom | floatCompExpr | floatArthExpr )
                | floatArthExpr           op=( '&&' | '||' )    ( floatLogicExpr | floatAtom | idAtom | floatCompExpr | floatArthExpr )
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


// ignoring the comments and the whitespaces
COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;