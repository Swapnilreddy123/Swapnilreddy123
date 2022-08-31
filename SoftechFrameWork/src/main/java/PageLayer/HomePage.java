package PageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.ActionsClassMethods;


public class HomePage extends Baseclass {

	
	 @FindBy(xpath="//b[text()='PIM']")
	 WebElement movetiPIm;
	
	@FindBy(xpath="//a[text()='Add Employee']")             
	 WebElement click;
	
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement logo ;
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean homePageLogo()
	{
		return logo.isDisplayed();
	}
	
	public String getHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnPIM()
	{
	 
	  new ActionsClassMethods().mouseOverAndClick(movetiPIm,click);

	}
	
	
	
	

}
