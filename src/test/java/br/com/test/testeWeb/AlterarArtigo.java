package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class AlterarArtigo {
		
	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();

// CHAMA O CENARIO DE "CRIAR CONTA"
	@Dado ("O usuário Criar conta")
	public void criarConta() throws IOException {
		CriarConta criarConta = new CriarConta();
		criarConta.urlnavega4devs();
		criarConta.pesquisarPessoas();
		criarConta.captura4Devs();
		criarConta.abrirSiteangularrealworld();
		criarConta.criarConta();
		criarConta.prencherCadastro();
		criarConta.botaoSignUp();
		criarConta.cadastroSucesso();
	}

	// CHAMA O CENARIO DE "CRIAR ARTIGO"
	@E ("O usuário Criar artigo")
	public void CriarArtigo() throws IOException {
		CriarArtigo CriarArtigo = new CriarArtigo();
		CriarArtigo.botaoNewArticle();
		CriarArtigo.prencherArtigo();
		CriarArtigo.botaoPublishArticle();
		CriarArtigo.artigoCriadoSucesso();
	}
	
	// CENARIO ALTERAR ARTIGO
	@E ("que o usuario clica no botão Edit Article e alterar campo Tags")
	public void BotaoAlterarArtigo() throws IOException {
		bpj.clicar(web.getbtnAlterarArticle());
		bpj.esperar(2000);
		bpj.escrever(web.getTipoArticle(), "Edição teste Itau");
		bpj.Print("Cadastrar_Evidência 10"); //print 10
		bpj.clicar(web.getbtnPublicarArticle());
		bpj.esperar(3000);
	}
				
	@Então("visualiza alteração do Artigo com sucesso")
	public void artigoAlteradoSucesso() {
		assertEquals("Teste ItauEdição teste Itau", bpj.obterTextoDaTela(web.getlogoArtigoCriadoSucesso()));
	}	
		
}


	
	
	
