package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class DeletarArtigo {
		
	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();
		
	// CHAMA O CENARIO DE "CRIAR CONTA"
	@Dado ("Deve criar conta")
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
	@E ("Deve criar artigo")
	public void CriarArtigo() throws IOException {
		CriarArtigo CriarArtigo = new CriarArtigo();
		CriarArtigo.botaoNewArticle();
		CriarArtigo.prencherArtigo();
		CriarArtigo.botaoPublishArticle();
		CriarArtigo.artigoCriadoSucesso();
	}
		
	// CENARIO DELETAR ARTIGO
	@E ("que o usuario clica no botão Delete Article")
	public void BotaoDeletarArtigo() throws IOException {
		bpj.clicar(web.getbtnDeletarArticle());
		bpj.Print("Cadastrar_Evidência 10"); //print 10
		bpj.esperar(1000);
	}
				
	@Então("visualiza o Artigo deletado com sucesso")
	public void artigoDeletadoSucesso() {
		assertEquals("No articles are here... yet.", bpj.obterTextoDaTela(web.getlogoArtigoDeletadoSucesso()));
	}
		
}


	
	
	
