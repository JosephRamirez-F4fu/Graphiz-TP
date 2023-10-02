lexer grammar GraphvizExprLexer;

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