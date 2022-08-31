package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.DropDrown;
import UtilsLayer.Utils;

public class Guru99 extends Baseclass {

	
	@FindBy(name="firstName")
	static WebElement firstname;
	
	@FindBy(name="lastName")
	static WebElement lastname;
	
	@FindBy(name="phone")
	static WebElement mobno;
	
	@FindBy(id="userName")
	static WebElement emailid;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement enterstate;
	
	@FindBy(name="postalCode")
	WebElement pincode;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="country")
	WebElement countryname;
	
	@FindBy(name="submit")
	WebElement clickOnsubmit;
	
	
	public Guru99()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  contactInformation(String fname,String lasname,String mobile,String email)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lasname);
		mobno.sendKeys(mobile);
		emailid.sendKeys(email);
		
	}
	
	public void  mailingInformation(String add,String entercity,String state,String pin)
	{
		address.sendKeys(add);
		city.sendKeys(entercity);
		enterstate.sendKeys(state);
		pincode.sendKeys(pin);
	}
	
	public void selectCountry(String value)
	{
		DropDrown.handleDPByVisibleText(countryname,value);
	}
	
	public String capturevalue()
	{
		return DropDrown.getselectevalue(countryname);
		
	}
	
	public void userInformation(String userName,String passWord,String confirmPass)
	{
		username.sendKeys(userName);
		password.sendKeys(passWord);
		confirmpassword.sendKeys(confirmPass);
		clickOnsubmit.click();
	}
	
	public void countDropDownValue()
	{
		DropDrown.countAlldpValue(countryname);
	}
	
	public void getAllDropvalue()
	{
		DropDrown.getAlldpvalue(countryname);
		
	}
	

	public void getScreenShot(String value) throws IOException
	{
		new Utils().captureScreenshot(value);
	}
	

}
