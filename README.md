# Compilador para gerar um formulário

## Autores
  Gabriel Fernandes Roza - 760688
  Gabriel Raffa Itokazu - 761832
  Luiz Fernando de Oliveira - 759482
  
## Sobre
  O projeto foi desenvolvido na disciplina de Construção de Compiladores ofertada na Universidade Federal de São Carlos. O projeto consiste em implementar um compilador completo para uma linguagem que foi criada pelos integrantes do grupo. O compilador implementado utiliza Análise léxica e sintática (gramática) e Análise semântica para gerar um formulário a partir de um código HTML.
  O formulário deve conter um título, uma descrição e o nome do autor. Além disso, pode conter três tipos de pergunta, sendo elas: multiplaescolha, dissertativa e verdadeiro/falso. As questões de multiplaescolha podem ter até 5 alternativas, sendo apenas uma delas a resposta correta. Nas questões dissertativas, a resposta deverá ser verificada pelo próprio autor do formulário, não havendo assim, uma correção automática. As questões de verdadeiro/falso possuem exatamente duas alternativas preestabelecidas: verdadeiro ou falso. Todas as perguntas devem ser formuladas com no máximo 300 caracteres.
  
## Exemplo de como declarar perguntas e respostas
```
inicio_declaracoes
	titulo: "Meu título"
	descricao: "Minha descrição"
	autor: "Fulano de tal"
fim_declaracoes

inicio_form
	inicio_pergunta
		tipo: multiplaescolha		
		pergunta: "Minha pergunta"
		alternativas: "alternativa a", "alternativa b", "alternativa c"
		resposta: "alternativa c"
	fim_pergunta

	inicio_pergunta
		tipo: verdadeirofalso
		pergunta: "Minha pergunta"
		resposta: falso
	fim_pergunta

	inicio_pergunta
		tipo: verdadeirofalso
		pergunta: "Minha pergunta"
		resposta: verdadeiro
	fim_pergunta
	
	inicio_pergunta
		tipo: dissertativa
		pergunta: "Minha pergunta com menos de 300 caracteres"
	fim_pergunta
fim_form
```

## Vídeo descritivo

## Como compilar
