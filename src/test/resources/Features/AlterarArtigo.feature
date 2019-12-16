#language: pt

Funcionalidade: AlterarArtigo

@Teste3
Cenário: Alterar Artigo
 	Dado O usuário Criar conta
 	E O usuário Criar artigo
 	E que o usuario clica no botão Edit Article e alterar campo Tags
	Então visualiza alteração do Artigo com sucesso