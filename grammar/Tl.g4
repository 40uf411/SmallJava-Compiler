grammar Tl;
start : expr | stmt ;

stmt  : left=expr op=COMP_OPS right=expr     #opStmt
      | left=unit op=LOGI_OPS right=unit    #opStmt
      | '(' stmt ')'                        #parenStmt
      | atom=unit                           #intCondExpr
      ;

unit  : expr | BOOL;

expr  : '(' expr ')'                      #parenExpr
      | left=expr op=('*'|'/') right=expr #opExpr
      | left=expr op=('+'|'-') right=expr #opExpr
      | atom=INT                          #atomExpr
      ;

COMP_OPS: '=='|'!='|'<='|'>=';
LOGI_OPS: '&&'|'||';
INT   : [0-9]+ ;
BOOL  : 'true' | 'false';
WS    : [ \t\r\n]+ -> skip ;
