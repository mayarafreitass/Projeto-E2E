package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public static By nome = By.xpath("//input[@id='firstName']");
	public static By sobrenome = By.xpath("//input[@id='lastName']");
	public static By email = By.xpath("//input[@id='userEmail']");
	public static By generoOpcao = By.xpath("//label[normalize-space()=\"Female\"]");
	public static By numero = By.xpath("//input[@id='userNumber']");
	public static By data = By.xpath("//*[@id=\"dateOfBirthInput\"]");
	public static By mes = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[7]");
	public static By dia = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[7]");
	public static By ano = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[105]");
	public static By hobbiesUm = By.xpath("//label[@for='hobbies-checkbox-1' and text()='Sports']");
	public static By hobbiesDois = By.xpath("//label[@for='hobbies-checkbox-2' and text()='Reading']");
	public static By hobbiesTres = By.xpath("//label[@for='hobbies-checkbox-3' and text()='Music']");
	public static By subjects = By.id("subjectsInput");
	public static By Current = By.xpath("//textarea[@id='currentAddress']");
	public static By states = By.id("state");
	public static By cities = By.id("city");
	public static By button = By.id("submit");

}
