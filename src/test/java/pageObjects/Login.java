package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	 public WebDriver driver;
	
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
     public WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@id='password']")
    public WebElement  passwordTextbox;
	
	@FindBy(xpath="//input[@id='login-button']")
    public WebElement  loginbtn;
	
	public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void enterUsername(String username)
	{
		usernameTextbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTextbox.sendKeys(password);
	}
	
	
	public void clickLogin()
	{
		loginbtn.click();
	}
}
