grammar GraphvizExpr;

DQUOTE:    '"';
DIREDGE:   '->' ;
UDIREDGE:  '--' ;
STRICT:    'strict' ;
GRAPH:     'graph' ;
DIGRAPH:   'digraph' ;
SUBGRAPH:  'subgraph' ;
LBRACE:    '{' ;
RBRACE:    '}' ;
LBRACKET:  '[' ;
RBRACKET:  ']' ;
SEMICOLON: ';' ;
DOUBCOLON: ':' ;
COMMA:     ',' ;
ASSIGN:    '=' ;
NODE:      'node';
EDGE:      'edge' ;
COMPASS
    : 'n'
    | 'ne'
    | 'e'
    | 'se'
    | 's'
    | 'sw'
    | 'w'
    | 'nw'
    | 'c'
    | '_'
    ;
ID
    : STR
    | NUM
    | VAR
    | XML
    ;
VAR: [a-zA-Z_\u0080-\u00FF][a-zA-Z0-9_\u0080-\u00FF]* ;
NUM: [-]?(.[0-9]+|[0-9]+(.[0-9]*)?) ;
STR: '"'.+?'"' ;
XML: '<'.+?'>' ;

WS: [ \t\n\r\f]+->skip;

program
    : graph EOF     # GraphObj
    | EOF           # EndFile
    ;

graph
    : STRICT? (GRAPH|DIGRAPH) ID? LBRACE stmt_list RBRACE # GraphDef
    ;

stmt_list
    : stmt ';'? stmt_list       # Stmnt
    |                           # Empty
    ;
stmt
    : node_stmt     # NodeObj
    | edge_stmt     # EdgeObj
    | attr_stmt     # Attr
    | ID '=' ID     # StmtAssign
    | subgraph      # SubGraphObj
    ;

attr_stmt
    : (GRAPH|NODE|EDGE) attr_list           # AttrDef
    ;

attr_list
    : '[' a_list? ']' attr_list?            # AttrList
    ;

a_list
    : ID '=' ID (';'|',')? a_list?          # AttrListAssign
    ;

edge_stmt
    : (node_id|subgraph) edgeRHS attr_list? # EdgeDef
    ;

edgeRHS
    : dgeop (node_id|subgraph) edgeRHS?     # EdgeOp
    ;
    
dgeop
    : DIREDGE                               # EdgeDirOp
    | UDIREDGE                              # EdgeUDirOp
    ;

node_stmt
    : node_id attr_list?                    # NodeAUNNOSE
    ;
    
node_id
    : ID port?                              # NodePort
    ;

port
    : ':' ID (':' compass_pt)?              # PortId
    | ':' compass_pt                        # PortCompass
    ;

subgraph
    : (SUBGRAPH ID?)? '{' stmt_list '}'     # SubgraphDef
    ;

compass_pt
    : (COMPASS)     # CompassPoint
    ;