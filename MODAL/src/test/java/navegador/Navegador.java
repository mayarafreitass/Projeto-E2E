package navegador;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegador extends DriversFactory {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/modal-dialogs");
	
}


	public static void fecharNavegador() {
		driver.quit();
		
	}
	
}
