grammar vedit;

// Reconhecimento de lexemas

NUMBER: '0'..'9';

TEXT: '"' (~[\r\n"] | '""')* '"';

// Como só unix paths serão tratados, o separador é a barra normal
SEPARATOR: '/';
// Caracteres permitidos para identificação de diretórios/arquivos
DF_STRING: ('a'..'z'|'A'..'Z'|NUMBER|'_');
// Caracteres permitidos para extensão de arquivo
F_EXT_STRING: ('a'..'z'|'A'..'Z'|NUMBER);
DIRECTORY: DF_STRING+;
VIDEOFILE: DF_STRING+ '.' F_EXT_STRING+; 

// ex: /home/raul/file.mp4
FILEPATH: '"' (SEPARATOR DIRECTORY)* VIDEOFILE '"';

// ex: 00:03:01
TIME: NUMBER NUMBER ':' NUMBER NUMBER ':' NUMBER NUMBER;

DIRECTION: 'left'|'right';

FORMAT: '"' FORMAT_TYPE '"';

FORMAT_TYPE: 'mp4'|'avi'|'mpg';

COMMENT: '#' ~[\r\n'}']* -> skip;
           
WHITESPACE : [\t\r\n\f]+ -> skip;

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

// Regras sintáticas

script: commands;

commands: command+;

command: editing | cutting;

cutting: CUT FILEPATH 'to' FILEPATH 'from' TIME 'to' TIME;

editing: EDIT FILEPATH '{' clauses '}';

clauses: clause* | ('from' TIME 'to' TIME '{' clause* '}')*;

clause: 
    CONVERT 'to' FORMAT |
    SCALE NUMBER ':' NUMBER |
    SPEEDUP NUMBER |
    SLOWDOWN NUMBER |
    WRITE TEXT |
    WATERMARK FILEPATH |
    PADDING NUMBER |
    VOLUME_BOOST NUMBER |
    HFLIP |
    VFLIP |
    ROTATE DIRECTION
;