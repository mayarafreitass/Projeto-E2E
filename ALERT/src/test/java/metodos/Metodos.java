package metodos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import alert.drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}
	
	public void escrever() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("User");
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	public void validarAlert(String textoEsperado) {
		try {
			String msgAlert = driver.switchTo().alert().getText();
			System.out.println(msgAlert);
			assertTrue(msgAlert.contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	public void aceitarAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			 alert.accept();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}
		
	}

	public void cancelarAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	public void pausa() {
		try {

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}
	}

	

}
