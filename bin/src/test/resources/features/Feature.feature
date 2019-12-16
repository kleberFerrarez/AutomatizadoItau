#language: pt
Funcionalidade: Testes da Sprint 17/18/19/20

@Checklist
Cenário: Validar o checklist para todas as telas e campos para cada portal
	Dado CL - acessar o portal do backoffice
	Então CL - fazer o checklist para os campos da página home do backoffice
	Quando CL - acessar a opção de Serviços
	Então CL - abrir a opção de Apontamento
	E CL - abrir a opção de Consultar Apontamento
	Então CL - fazer o checklist para os elementos da página de Consulta de Apontamento
	Quando CL - acessar a opção de Incluir Apontamento
	Então CL - fazer o checklist para os elementos da página de Incluir de Apontamento
	
		
@PrepararTelaAnaliseContestacaoAprovarContestacaoSprint18
Cenário: Configurar e apresentar tela de análise de contestação de dívida e aprovar contestação  (4.1.6.4/4.1.6.5/4.1.6.6/4.1.6.6.a)
	Dado CT01 - que eu acessei o portal de backoffice
	Então CT01 -  deverei inserir um CPF válido
	E CT01 - inserir a senha
	Então CT01 - validar que o login foi feito corretamente
	Quando CT01 - abrir o menu de opções do Portal Backoffice
	E CT01 - acessar a opção de Consultar Contestação
	Então CT01 - validar que estou na tela de Análise de Contestação
	Quando CT01 - abrir o detalhe da contestação
	Então CT01 - validar que estou na tela de Detalhe de Contestação
	E CT01 - aprovar a contestação da dívida
	
	
@PrepararTelaAnaliseContestacaoReprovarContestacaoSprint18
Cenário: Configurar e apresentar tela de análise de contestação de dívida e reprovar contestação  (4.1.6.4/4.1.6.5/4.1.6.6/4.1.6.6.a)
	Dado CT02 - que eu acessei o portal de backoffice
	Então CT02 -  deverei inserir um CPF válido
	E CT02 - inserir a senha
	Então CT02 - validar que o login foi feito corretamente
	Quando CT02 - abrir o menu de opções do Portal Backoffice
	E CT02 - acessar a opção de Consultar Contestação
	Então CT02 - validar que estou na tela de Análise de Contestação
	Quando CT02 - abrir o detalhe da contestação
	Então CT02 - validar que estou na tela de Detalhe de Contestação
	E CT02 - reprovar a contestação da dívida
	
	
@ConsultaContestacaoSprint19
Cenário: Consulta de contestação (4.1.6.2)
	Dado CT03 - que eu acessei o portal de backoffice
	Então CT03 -  deverei inserir um CPF válido
	E CT03 - inserir a senha
	Então CT03 - validar que o login foi feito corretamente
	Quando CT03 - abrir o menu de opções do Portal Backoffice
	E CT03 - acessar a opção de Consultar Contestação
	Então CT03 - validar que estou na tela de Análise de Contestação
		
		
@IncluirConglomeradoSprint19
Cenário: Inclusão de Conglomerado (7.2.1.1.a)
Dado CT04 - que eu acessei o portal de backoffice
Então CT04 - deverei inserir um CPF válido
E CT04 - inserir a senha
Então CT04 - validar que o login foi feito corretamente
Quando CT04 - abrir o menu de opções do Portal Backoffice
E CT04 - acessar a opção de Conglomerado
Então CT04 - validar que estou na tela de Cadastro de Conglomerado
Então CT04 - deverei inserir um CNPJ válido
E CT04 - consultar conglomerado
Então CT04 - deverei selecionar a opção de incluir fonte
Então CT04 - Inserir um CNPJ válido
E CT04 - Selecionar a opção de Incluir Fonte
E CT04 - deverei selecionar a opção de salvar conglomerado
Então CT04 - Validar mensagem de sucesso
E CT04 - Clicar no botao Ok


@AgendamentoBaseClienteSprint20
Cenário: Agendamento de Base do Tipo Cliente (3.2.1/ 3.2.1.a)
Dado CT05 - que eu acessei o Portal do Backoffice
Então CT05 - deverei inserir um CPF válido
E CT05 - inserir a senha
Então CT05 - validar que o login foi feito corretamente
Quando CT05 - abrir o menu de opções do Portal Backoffice
Então CT05 - acessar a opção de Agendamento de Bases
E CT05 - acessar a opção Agendamento
Então CT05 - validar que estou na tela de Agendamento
E CT05 - deverei inserir um CNPJ válido
E CT05 - selecionar o Tipo de Base Cliente para o cadastro
Então CT05 - marcar a opção Data Programada
E CT05 - inserir a data de vigência
Então CT05 - salvar o agendamento
E CT05 - validar que o agendamento foi inserido com sucesso


@AgendamentoBaseClienteIncrementalSprint20
Cenário: Agendamento de Base do Tipo Cliente Incremental (3.2.1/ 3.2.1.a)
Dado CT06 - que eu acessei o Portal do Backoffice
Então CT06 - deverei inserir um CPF válido
E CT06 - inserir a senha
Então CT06 - validar que o login foi feito corretamente
Quando CT06 - abrir o menu de opções do Portal Backoffice
Então CT06 - acessar a opção de Agendamento de Bases
E CT06 - acessar a opção Agendamento
Então CT06 - validar que estou na tela de Agendamento
E CT06 - deverei inserir um CNPJ válido
E CT06 - selecionar o Tipo de Base Cliente Incremental para o cadastro
Então CT06 - marcar a opção Data Programada
E CT06 - marcar a opção Incremental
E CT06 - inserir a data de vigência
E CT06 - inserir a periodicidade Semanal
E CT06 - escolher a Sexta
Então CT06 - salvar o agendamento
E CT06 - validar que o agendamento foi inserido com sucesso


@AgendamentoBaseMercadoFullSprint20
Cenário: Agendamento de Base do Tipo Mercado Full (3.2.1/ 3.2.1.a)
Dado CT07 - que eu acessei o Portal do Backoffice
Então CT07 - deverei inserir um CPF válido
E CT07 - inserir a senha
Então CT07 - validar que o login foi feito corretamente
Quando CT07 - abrir o menu de opções do Portal Backoffice
Então CT07 - acessar a opção de Agendamento de Bases
E CT07 - acessar a opção Agendamento
Então CT07 - validar que estou na tela de Agendamento
E CT07 - deverei inserir um CNPJ válido
E CT07 - selecionar o Tipo de Base Mercado Full para o cadastro
Então CT07 - marcar a opção Data Programada
E CT07 - inserir a data de vigência
Então CT07 - salvar o agendamento
E CT07 - validar que o agendamento foi inserido com sucesso


@AgendamentoBaseMercadoIncrementalSprint20
Cenário: Agendamento de Base do Tipo Mercado Incremental (3.2.1/ 3.2.1.a)
Dado CT08 - que eu acessei o Portal do Backoffice
Então CT08 - deverei inserir um CPF válido
E CT08 - inserir a senha
Então CT08 - validar que o login foi feito corretamente
Quando CT08 - abrir o menu de opções do Portal Backoffice
Então CT08 - acessar a opção de Agendamento de Bases
E CT08 - acessar a opção Agendamento
Então CT08 - validar que estou na tela de Agendamento
E CT08 - deverei inserir um CNPJ válido
E CT08 - selecionar o Tipo de Base Mercado Incremental para o cadastro
Então CT08 - marcar a opção Data Programada
E CT08 - marcar a opção Incremental
E CT08 - inserir a data de vigência
E CT08 - inserir a periodicidade Mensal
E CT08 - inserir o dia do mês
Então CT08 - salvar o agendamento
E CT08 - validar que o agendamento foi inserido com sucesso

@ParametrosEnvioDeComunicadoSprint22
Cenário: Parâmetros de Envio de Comunicado (7.2.1.28)
Dado CT09 - que eu estou no Portal do Backoffice
Então CT09 - deverei inserir um CPF válido
E CT09 - inserir a senha
Então CT09 - validar que o login foi feito corretamente
Quando CT09 - abrir o menu de opções do Portal Backoffice
Então CT09 - acessar a opção de Parâmetros de Envio de Comunicado
E CT09 - validar que estou na tela de Parâmetros de Envio de Comunicado
Então CT09 - inserir um CNPJ válido
Quando CT09 - selecionar a primeira opção nos Tipos de Agrupamento Envio de Comunicado
E CT09 - selecionar a opção SIM na Sequência Obrigatória de envio de comunicado
Então CT09 - selecionar Email, SMS e Enriquecer Email nas Opções de Envio de Comunicado
E CT09 - salvar o cadastro no Parâmetro de Envio de Comunicado
Então CT09 - validar o cadastro no Parâmetro de Envio de Comunicado e confirmar