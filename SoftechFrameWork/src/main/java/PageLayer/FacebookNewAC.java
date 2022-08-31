package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.DropDrown;

public class FacebookNewAC extends Baseclass {

	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="reg_email__")  
	WebElement mobno;
	
	@FindBy(name="reg_passwd__") 
	WebElement pass;
	
	@FindBy(id="day")
	WebElement dateday;
	
	@FindBy(id="month")
	WebElement Month;
	
	@FindBy(id="year")
	WebElement Year;
	
	
	public FacebookNewAC()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterDataInRegisterPage(String fstname,String latname,String mobile,String password,String day,String month,String year)
	{
		fname.sendKeys(fstname);
		lastname.sendKeys(latname);
		mobno.sendKeys(mobile);
		pass.sendKeys(password);
	
		 DropDrown.handleDPByVisibleText(dateday,day);
		 DropDrown.handleDPByVisibleText(Month,month);
		 DropDrown.handleDPByVisibleText(Year,year);
	}
	
	
	
	
	
	
	
	
	
	
}
