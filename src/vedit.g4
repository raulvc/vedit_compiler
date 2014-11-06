grammar vedit;

// Reconhecimento de lexemas

// Palavras reservadas
EDIT: 'edit';
CONVERT: 'convert';
SCALE: 'scale';
SPEEDUP: 'speedup';
SLOWDOWN: 'slowdown';
WRITE: 'write';
WATERMARK: 'watermark';
PADDING: 'padding';
VOLUME_BOOST: 'volume_boost';
VFLIP: 'vflip';
HFLIP: 'hflip';
ROTATE: 'rotate';
CUT: 'cut';
TO: 'to';
FROM: 'from';
LEFTBRACKET: '{';
RIGHTBRACKET: '}';
COLLON: ':';

// ex: 00:03:01
TIME: NUMBER NUMBER ':' NUMBER NUMBER ':' NUMBER NUMBER;

DIRECTION: 'left'|'right';

FORMAT: '"' FORMAT_TYPE '"';

FORMAT_TYPE: 'mp4'|'avi'|'mpg'|'mkv'|'jpg'|'png';

// Como só unix paths serão tratados, o separador é a barra normal
SEPARATOR: '/';
FILENAME: CHARACTER (CHARACTER | NUMBER | '_')* '.' FORMAT_TYPE;
FILEORFOLDER: '.' | '..' | FILENAME;
HOMEFOLDER: '~';
// ex: /home/raul/file.mp4 ou ./file.mp4
FILEPATH: '"'(HOMEFOLDER SEPARATOR)? (FILEORFOLDER SEPARATOR)* FILENAME'"';

NUMBER: '0'..'9';
CHARACTER: 'a'..'z'|'A'..'Z';
TEXT: '"' (~[\r\n"] | '""')* '"';

COMMENT: '#' ~[\r\n'}']* -> skip;          
WHITESPACE: [ \t\r\n\f]+ -> skip;

// Regras sintáticas

script: commands;

commands: command+;

command: editing | cutting;

cutting: CUT FILEPATH TO FILEPATH FROM TIME TO TIME;

editing: EDIT FILEPATH LEFTBRACKET clauses+ RIGHTBRACKET;

clauses: (clause | convert_clause) | FROM TIME TO TIME LEFTBRACKET clause* RIGHTBRACKET;

clause: 
    SCALE (NUMBER)+ COLLON (NUMBER)+ |
    SPEEDUP (NUMBER)+ |
    SLOWDOWN (NUMBER)+ |
    WRITE TEXT |
    WATERMARK FILEPATH |
    PADDING (NUMBER)+ |
    VOLUME_BOOST (NUMBER)+ |
    HFLIP |
    VFLIP |
    ROTATE DIRECTION
;

convert_clause: CONVERT TO FORMAT;