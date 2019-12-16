package br.com.modelPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

/**
 * @author Kleber Ferrarez
 * @Descricao Classe responsável por guardar os elementos das páginas.
 */

public class ModelWeb {

	String urlangularRealworld = "https://angular.realworld.io/"; 
	String url4devs = "https://www.4devs.com.br/gerador_de_pessoas/"; 
	
	By botaoGerarPessoas = By.xpath("//*[@id=\"bt_gerar_pessoa\"]");
	By nome4Devs = By.xpath("//*[@id=\"signo\"]"); 
	By email4Devs = By.xpath("//*[@id=\"email\"]");
	By senha4Devs = By.xpath("//*[@id=\"senha\"]"); 
		
	By btnCriarConta = By.xpath("//a[contains(text(),'Sign up')]");
    By preencheNomeCompleto = By.xpath("//input[@type='text']");
    By contaEmail = By.xpath("(//input[@type='text'])[2]");
    By preencheSenha = By.xpath("//input[@type='password']");
    By btnSignUp = By.xpath("//button[contains(.,'Sign up')]");
	By logoSucesso = By.xpath("//div[2]");
	
	By btnNovoArticle = By.xpath("//a[contains(text(),'New Article')]");
	By TituloArticle = By.xpath("//input[@type='text']");
	By EscreverArticle = By.xpath("(//input[@type='text'])[2]");
	By TipoArticle = By.xpath("//textarea");
	By EscreverTags = By.xpath("(//input[@type='text'])[3]");
	By btnPublicarArticle = By.xpath("//button");
	By EscreverComment = By.xpath("//textarea");
	By btnPostComment = By.xpath("//div[2]/button");
	By logoArtigoCriadoSucesso = By.xpath("//p[contains(.,'Teste Itau')]");
	
	By btnAlterarArticle = By.xpath("//a[contains(text(),'Edit Article')]");
	
	By btnDeletarArticle = By.xpath("//div[2]/app-article-meta/div/span/button");
	By logoArtigoDeletadoSucesso = By.xpath("//div[2]");
		
	public String geturlangularrealworld() {
		return urlangularRealworld;
	}
	
	public String geturl4devs() {
		return url4devs;
	}

	public By getnome4Devs() {
		return nome4Devs;
	}
	
	public By getemail4Devs() {
		return email4Devs;
	}
	
	public By getsenha4Devs() {
		return senha4Devs;
	}
		
	public By getbtnCriarConta() {
		return btnCriarConta;
	}
	
	public By getpreencheNomeCompleto() {
		return preencheNomeCompleto;
	}
	
	public By getcontaEmail() {
		return contaEmail;
	}
			
	public By getpreencheSenha() {
		return preencheSenha;
	}
	
	public By getbtnSignUp() {
		return btnSignUp;
	}
	
	public By getlogoSucesso() {
		return logoSucesso;
	}
	
	public By getbotaoGerarPessoas() {
		return botaoGerarPessoas;
	}
	
	public By getbtnNovoArticle() {
		return btnNovoArticle;
	}
	
	public By getTituloArticle() {
		return TituloArticle;
	}
	
	public By getTipoArticle() {
		return TipoArticle;
	}
	
	public By getEscreverArticle() {
		return EscreverArticle;
	}
	
	public By getEscreverTags() {
		return EscreverTags;
	}
	
	public By getbtnPublicarArticle() {
		return btnPublicarArticle;
	}
	
	public By getEscreverComment() {
		return EscreverComment;
	}
	
	public By getbtnPostComment() {
		return btnPostComment;
	}
	
	public By getlogoArtigoCriadoSucesso() {
		return logoArtigoCriadoSucesso;
	}
	
	public By getbtnAlterarArticle() {
		return btnAlterarArticle;
	}
	
	public By getbtnDeletarArticle() {
		return btnDeletarArticle;
	}
	
	public By getlogoArtigoDeletadoSucesso() {
		return logoArtigoDeletadoSucesso;
	}
}
