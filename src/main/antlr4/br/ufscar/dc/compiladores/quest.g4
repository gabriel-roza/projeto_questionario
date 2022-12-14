grammar quest;

PALAVRA_CHAVE : 'inicio_form' | 'fim_form' | 'inicio_pergunta' | 'fim_pergunta' | 'titulo' | 'descricao' | 'autor' | 'inicio_declaracoes' | 'fim_declaracoes' | 'pergunta' | 'alternativas' | 'resposta' | 'tipo' | 'dissertativa' | 'multiplaescolha' | 'verdadeirofalso'
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
ESC_SEQ	: '\\\''
;
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();}
;
WS : ( ' ' | '\t' | '\r' | '\n') {skip();}
;
CADEIA_ERR: '"' ~('"'|'\n')* '\n'
;
COMENTARIO_ERR:   '{' ~('\n'|'}'|'\r')* '\n'
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
                (declaracoes_perguntas)* 
        'fim_pergunta'
;

declaracoes_perguntas:
        'tipo' ':' tipo 
        ( multiplaescolha | dissertativa | verdadeirofalso )
;

tipo:
        'dissertativa' | 'multiplaescolha' | 'verdadeirofalso'
;

multiplaescolha: 		
        'pergunta'':' pergunta
        'alternativas'':' alternativa (',' alternativa)*
        'resposta'':' alternativacorreta
;

dissertativa: 		
        'pergunta'':' pergunta
;

verdadeirofalso:
        'pergunta'':' pergunta
        'resposta'':' ('verdadeiro' | 'falso')
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

alternativacorreta:
        CADEIA | NUM_INT | NUM_REAL
;


pergunta:
        CADEIA
;

resposta:
        CADEIA | NUM_INT | NUM_REAL
;

