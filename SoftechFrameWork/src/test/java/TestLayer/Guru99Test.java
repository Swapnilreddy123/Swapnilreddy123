package TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.Guru99;

public class Guru99Test extends Baseclass{
	public Guru99 gr;
	@BeforeTest
	public void initiation()
	{
		Baseclass.setup("chrome"); 
	}
	
	
	@Test(priority=2)
	public void sendValueIncontactInformation()
	{
		new Guru99().contactInformation("swapnil","peddawad","8600982027","swapnil@123");
		
	}
	
	@Test(priority=3)
	public void sendValueInmailingInformation()
	{
		new Guru99().mailingInformation("udgir","latur","Maharashtra","413517");
	}
	
	@Test(priority=4)
	public void selectCountryfromDropDown()
	{
		new Guru99().selectCountry("INDIA");
	}
	
	@Test(priority=5)
	public void validatecapturevalue()
	{
	    
	    Assert.assertEquals(new Guru99().capturevalue(),"INDIA");
	}
	
	@Test(priority=6)
	public void countsize()
	{
		Guru99 guru=  new Guru99();
		guru.countDropDownValue();
	}
	
	@Test(priority=7)
	public void captureAllDropvalue()
	{
		Guru99 guru= new Guru99();
		guru.countDropDownValue();
	}
	
	@Test(priority=8)
	public void sendvalueuserInformation()
	{
		new Guru99().userInformation("Swapreddy","swap007","swap007");
	}
	
	
	
	@Test(priority=9)
	public void capturescreenshot() throws IOException
	{
		new Guru99().getScreenShot("C:\\Users\\hp\\eclipse-workspace\\SoftechFrameWork\\PassScreenShot/"+"Guru99"+".png");
	}
	

	
}
