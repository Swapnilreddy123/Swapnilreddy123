package UtilsLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class DropDrown extends Baseclass
 {  
 
	public static void handleDPByVisibleText(WebElement wb, String value) 
	{
	  new Select(wb).selectByVisibleText(value);
	  
	}
	
	public static void handleDPByvalue(WebElement wb, String value)
	{
		new Select(wb).selectByValue(value);
	}
	
	public static void handleDPByIndex(WebElement wb, int value)
	{
		new Select(wb).selectByIndex(value);
	}
	
	public static String getselectevalue(WebElement wb)
	{
		return new Select(wb).getFirstSelectedOption().getText();
		
	}
	
	public static void countAlldpValue(WebElement wb)
	{
		new Select(wb).getOptions().size();
	}
	
	public static void  getAlldpvalue(WebElement wb) {
	
		 
		
		for(WebElement dpAllValue:new Select(wb).getOptions())
		{
			System.out.println(dpAllValue.getText());
		}
		
		
	}
	
	
 }
