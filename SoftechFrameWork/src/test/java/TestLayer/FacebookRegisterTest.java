package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.FacebookNewAC;

public class FacebookRegisterTest extends Baseclass{

	
	@BeforeTest
	public void initiation()
	{
		Baseclass.setup("chrome"); 
	}
	
	@Test(priority=1)
	public void validatefacebookcreataccount()
	{
		
		FacebookNewAC facebook=new FacebookNewAC();
		facebook.enterDataInRegisterPage("shital","peddawad","8600982027","shital@123","22","Nov","1998");
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	
}
