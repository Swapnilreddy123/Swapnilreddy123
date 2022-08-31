package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.LoginPage;

@Test(groups= {"loginpage"})
public class LoginPageTest extends Baseclass{

	@BeforeTest
	public void initiation()
	{
		Baseclass.setup("chrome"); 
	}
	

	@Test(priority=1)
	public void validateLoginPage()
	{
		LoginPage login=new LoginPage();
		login.loginfunctionality("Admin","admin123");
	}
	
	

}
