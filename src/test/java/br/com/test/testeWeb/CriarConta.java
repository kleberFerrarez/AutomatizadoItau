package br.com.test.testeWeb;

import static br.com.driver.Driver.getDriverChrome;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.basepages.BasePageJava;
import br.com.modelPage.ModelWeb;
import br.com.utils.GeradorDadosCadastraisUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class CriarConta {
	String nome4DevsCapturado;
	String email4DevsCapturado;
	String senha4DevsCapturado;
		
	BasePageJava bpj = new BasePageJava(getDriverChrome());
	ModelWeb web = new ModelWeb();
		
	// CENARIO CRIAR CONTA - (SIGN-UP)
	
	@Dado("que usuário acessa o site da 4devs")
	public void urlnavega4devs() throws IOException {
		bpj.navegar(web.geturl4devs());	
		bpj.Print("Cadastrar_Evidência 1"); //print 1
		bpj.esperar(1000);
	}
	
	@E("clica no botão gerar pessoas")
	public void pesquisarPessoas() throws IOException {
		bpj.clicar(web.getbotaoGerarPessoas());
		bpj.Print("Cadastrar_Evidência 2"); //print 2
		bpj.esperar(1000);
	}
	
	@E("visualiza e captura o nome, e-mail e senha")
	public void captura4Devs(){
		bpj.clicar(web.getnome4Devs());
		nome4DevsCapturado = bpj.obterTextoDaTela(web.getnome4Devs());
		System.out.println(nome4DevsCapturado);
		
		bpj.clicar(web.getemail4Devs());
		email4DevsCapturado = bpj.obterTextoDaTela(web.getemail4Devs());
		System.out.println(email4DevsCapturado);
						
		bpj.clicar(web.getsenha4Devs());
		senha4DevsCapturado = bpj.obterTextoDaTela(web.getsenha4Devs());
		System.out.println(senha4DevsCapturado);
	}	
			
	@E("o usuário acessa o site da angular realworld para efetuar o cadastro")
	public void abrirSiteangularrealworld() throws IOException {
		bpj.navegar(web.geturlangularrealworld());
		bpj.Print("Cadastrar_Evidência 3"); //print 3
		bpj.esperar(4000);
	}
		
	@E("clica no botão criar conta Sign-Up")
	public void criarConta() throws IOException {
		bpj.clicar(web.getbtnCriarConta());
		bpj.esperar(3000);
		bpj.Print("Cadastrar_Evidência 4"); //print 4
	}
	
	@E ("o usuario preenche nome, e-mail e senha para cadastro")
	public void prencherCadastro() throws IOException {
		//bpj.escrever(web.getpreencheNomeCompleto(), nome4DevsCapturado);
		String nomeUsuario = GeradorDadosCadastraisUtils.gerarNomeUsuarioComHoraMinutoSegundo("Usuario");
		bpj.escrever(web.getpreencheNomeCompleto(), nomeUsuario);
		bpj.esperar(1000);
		//bpj.escrever(web.getcontaEmail(), email4DevsCapturado);
		bpj.escrever(web.getcontaEmail(), GeradorDadosCadastraisUtils.gerarEmailUsuario(nomeUsuario));
		bpj.esperar(1000);
		bpj.escrever(web.getpreencheSenha(), senha4DevsCapturado);
		bpj.esperar(1000);
		bpj.Print("Cadastrar_Evidência 5"); //print 5
	}
		
	@E ("clica no botão SignUp")
	public void botaoSignUp() throws IOException {
		bpj.clicar(web.getbtnSignUp());
		bpj.Print("Cadastrar_Evidência 6"); //print 6
		bpj.esperar(4000);
	}
	
	@Então("visualiza o Login do ator efetuado com sucesso")
	public void cadastroSucesso() {
		assertEquals("No articles are here... yet.", bpj.obterTextoDaTela(web.getlogoSucesso()));
	}
	
}


	
	
	
