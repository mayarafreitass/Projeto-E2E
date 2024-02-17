package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;

public class Navegadores extends DriversFactory {

	public static void iniciarTeste() {
		String ambiente = "https://demoqa.com/automation-practice-form";
		try {
			driver = new ChromeDriver();
			driver.get(ambiente);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());

		}

	}

	public static void fecharTeste() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
		}
	}
}
