grammar quest;

PALAVRA_CHAVE : 'inicio_form' | 'fim_form' | 'inicio_pergunta' | 'fim_pergunta' | 'titulo' | 'descricao'
;
IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* | ('a'..'z')
;
DELIM: ':'
;
VIRGULA: ','
;
CADEIA: '"' ~('"'|'\n')* '"'
;
NUM_INT: ('0'..'9')+
;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?
;

fragment
COMENTARIO: '/' .? '*/' -> skip
;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
;
CADEIA_ERR: '"' ~('"'|'\n')* '\n'
;
COMENTARIO_ERR:   '/' ~('\n'|'}'|'\r')* '\n'
;
ERRO: .
;

programa: declaracoes 'inicio_form' perguntas 'fim_form' EOF
;

declaracoes: decl*
;

decl: tipo ': ' CADEIA
;

tipo: 'titulo' | 'descricao' | 'autor'
;

perguntas: 'inicio_pergunta' declaracoes_perguntas 'fim_pergunta'
;

declaracoes_perguntas: decl_perguntas*
;

decl_perguntas: tipo_perguntas ':' CADEIA
;

tipo_perguntas: 'pergunta' | declaracoes_alternativas | 'resposta'
;

alternativa: CADEIA
;

alternativas: alternativa (',' alternativa)* '\n'
;

declaracoes_alternativas: 'alternativas' ':' alternativas
;