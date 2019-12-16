package br.com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Kleber Ferrarez
 * @Descricao Classe responsável pela manipulação do driver.
 */
public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriverChrome() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver getDriverFirefox() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver getDriverInternetExplorer() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/explorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	/**
	 * Mata o processo do driver instanciado.
	 */
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
