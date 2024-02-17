package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	public void validarTexto(By elemento, String textoEsperado) {

		try {

			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
		}

	}

	
}
