package metodos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public static void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("Erro ao clicar no elemento ");
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
		}
	}

	public static void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
		}
	}

	public static void zoomIn(int porcentagem) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.body.style.zoom='" + porcentagem + "%'");
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
		}

	}

	public static void validarAlert(String textoEsperado) {
		try {
			String msgAlert = driver.switchTo().alert().getText();
			System.out.println(msgAlert);
			assertTrue(msgAlert.contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	public static void pausa() {
		try {

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}
	}

	public static void enter() {
		try {
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ENTER).perform();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}
		
	}

	public static void baixo(By elemento) {
		try {
			driver.findElement(elemento).sendKeys(Keys.ARROW_DOWN);
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}
	}

	public static void scrollAteOFinal() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
	
}
