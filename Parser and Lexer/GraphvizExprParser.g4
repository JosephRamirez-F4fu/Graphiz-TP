parser grammar GraphvizExprParser;
options { tokenVocab=GraphvizExprLexer; }

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