grammar quest;

PALAVRA_CHAVE : 'inicio_form' | 'fim_form' | 'inicio_pergunta' | 'fim_pergunta' | 'titulo' | 'descricao' | 'autor' | 'inicio_declaracoes' | 'fim_declaracoes' | 'pergunta' | 'alternativas' | 'resposta' | 'tipo'
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

programa: declaracoes 'inicio_form' (perguntas)* 'fim_form' EOF
;

declaracoes: 
        'inicio_declaracoes'
                'titulo' ':' titulo
                'descricao' ':' descricao
                'autor' ':' autor
        'fim_declaracoes'
;

perguntas: 
        'inicio_pergunta'
                declaracoes_perguntas 
        'fim_pergunta'
;

declaracoes_perguntas:
        'tipo' ':' tipo 
        multiplaescolha 
        |
        'tipo' ':' tipo
        dissertativa
;

tipo:
        'dissertativa' | 'multiplaescolha'
;

multiplaescolha: 		
        'pergunta'':' pergunta
        'alternativas'':' alternativa (',' alternativa)*
        'resposta'':' alternativa
;

dissertativa: 		
        'pergunta'':' pergunta
;

titulo:
        CADEIA
;

descricao:
        CADEIA
;

autor:
        CADEIA
;

alternativa:
        CADEIA | NUM_INT | NUM_REAL
;

pergunta:
        CADEIA
;

resposta:
        CADEIA | NUM_INT | NUM_REAL
;

