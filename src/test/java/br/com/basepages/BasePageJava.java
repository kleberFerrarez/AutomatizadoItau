package br.com.basepages;

import static br.com.driver.Driver.getDriverChrome;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Kleber Ferrarez
 * @Descricao Classe responsável por conter comandos que executam interações com
 *            a página da web. Os métodos contidos na classe são todos públicos
 *            e para utilizá-la, é necessário passar o WebDriver como parâmetro
 */
public class BasePageJava {

	WebDriver driver;
	
	
	 //Método para capturar screenshot
    public void Print(String nomePrint) throws IOException {
        File foto = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(foto, new File("C:\\Users\\Alline\\Desktop\\AULA\\Prints Selenium\\"+nomePrint+".png"));
    }
    
	//Captura dados de um campo da tela
	public String obterTextoDaTela(By elemento){
		try {
			return driver.findElement(elemento).getText();
		} catch (NoSuchElementException e) {
			return null;
		} catch (ElementNotVisibleException e) {	
			return null;	
		}
	}
	//Função Sleep
	public void esperar(int i){
		try {
			Thread.sleep(i);
		}catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	/**
	 * @Descricao Método construtor, define que sempre que a classe for
	 *            instanciada, é necessário passar o driver como parâmetro
	 * @param WebDriver
	 */
	public BasePageJava(WebDriver driver) {
		this.driver = driver;
	}

	public void navegar(String url) {
		getDriverChrome().navigate().to(url);
	}

	public void escrever(By elemento, String texto) {
		getDriverChrome().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		getDriverChrome().findElement(elemento).click();
	}
		
}
