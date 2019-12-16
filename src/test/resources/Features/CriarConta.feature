#language: pt

Funcionalidade: Criar Conta

@Teste1
Cenário: Criar Conta
 	Dado que usuário acessa o site da 4devs
 	E clica no botão gerar pessoas
 	E visualiza e captura o nome, e-mail e senha 
 	E o usuário acessa o site da angular realworld para efetuar o cadastro
 	E clica no botão criar conta Sign-Up
 	E o usuario preenche nome, e-mail e senha para cadastro
 	E clica no botão SignUp
	Então visualiza o Login do ator efetuado com sucesso	