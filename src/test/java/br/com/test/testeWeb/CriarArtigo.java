package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class CriarArtigo {
			
	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();
		
	
	// CHAMA O CENARIO DE "CRIAR CONTA"
	@Dado ("Criar conta")
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
	
	// CENARIO CRIAR ARTIGO
	@E ("o usuario clica no botão New Article")
	public void botaoNewArticle () throws IOException {
		bpj.clicar(web.getbtnNovoArticle());
		bpj.Print("Cadastrar_Evidência 7"); //print 7
		bpj.esperar(1000);
	}
	
	@E ("o usuario preenche os dados do artigo")
	public void prencherArtigo() throws IOException {
		bpj.escrever(web.getTituloArticle(), "Teste Itau");
		bpj.esperar(2000);
		bpj.escrever(web.getEscreverArticle(), "Itau");
		bpj.esperar(2000);
		bpj.escrever(web.getTipoArticle(), "Teste Itau");
		bpj.esperar(2000);
		bpj.escrever(web.getEscreverTags(), "Etiqueta Itau");
		bpj.Print("Cadastrar_Evidência 8"); //print 8
	}	
		
	@E ("clica no botão Publish Article e escrever um comentario e avançar")
	public void botaoPublishArticle () throws IOException {
		bpj.clicar(web.getbtnPublicarArticle());
		bpj.esperar(4000);
		bpj.escrever(web.getEscreverComment(), "Teste Itau");
		bpj.Print("Cadastrar_Evidência 9"); //print 9
		bpj.esperar(2000);
		bpj.clicar(web.getbtnPostComment());
	}
		
	@Então("visualiza a criação do Artigo com sucesso")
	public void artigoCriadoSucesso() {
		assertEquals("Teste Itau", bpj.obterTextoDaTela(web.getlogoArtigoCriadoSucesso()));
	}
	
}


	
	
	
