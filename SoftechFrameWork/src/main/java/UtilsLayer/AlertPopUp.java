package UtilsLayer;

import org.openqa.selenium.Alert;

import BaseLayer.Baseclass;

public class AlertPopUp extends Baseclass {

	public static void clickOkOnAlertPopUp()
	{
		Alert popup=driver.switchTo().alert();
		popup.accept();
		
	}
	
	public static void clickOnDismissAlertPopUp()
	{
		Alert popup=driver.switchTo().alert();
		popup.dismiss();
		
	}
	
	public static void sendKeysinAlertPopUp(String value)
	{
		Alert popup=driver.switchTo().alert();
		popup.sendKeys(value);
		
	}
	
	public static String captureTextonAlert()
	{
		Alert popup=driver.switchTo().alert();
		return popup.getText();
	}
	
	
}
