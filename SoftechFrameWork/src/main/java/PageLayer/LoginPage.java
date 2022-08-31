package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class LoginPage extends Baseclass {
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void loginfunctionality(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
		
	}
	
	
	
	
}
