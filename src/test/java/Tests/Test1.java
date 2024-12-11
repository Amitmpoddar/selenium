package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageObjects.Login;

public class Test1 {

	
	
	
    public static WebDriver driver;
	//public static Login login;
	
	@Test
	public void a() throws InterruptedException
	{
		 
		//Login login = new Login(driver);
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Login login = new Login(driver);
	
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
		driver.quit();
	}
}