#language: pt

Funcionalidade: Criar Artigo

@Teste2
Cenário: Criar Artigo
 	Dado Criar conta
 	E o usuario clica no botão New Article
	E o usuario preenche os dados do artigo
	E clica no botão Publish Article e escrever um comentario e avançar
	Então visualiza a criação do Artigo com sucesso