package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class PimPage extends Baseclass {

	@FindBy(id="firstName")
	WebElement fname;
	
	@FindBy(id="middleName")
	WebElement mname;
	
	@FindBy(id="lastName")
	WebElement lasname;
	
	@FindBy(id="employeeId")
	WebElement empid;
	
	@FindBy(id="btnSave")
	WebElement clickonsave;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement clickonaddemp;
	
	public PimPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getUrlPimPage()
	{
		return driver.getCurrentUrl();
	}
	
	public  void addEmployee(String firname,String middlename,String lastname)
	{
		fname.sendKeys(firname);
		mname.sendKeys(middlename);
		lasname.sendKeys(lastname);
		empid.getAttribute("value");
		clickonsave.click();
		clickonaddemp.click();
		
		
	}
	
	
}
