package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class HandleFrames extends Baseclass {

	
	public static void frameByIdOrname(String value)
	{
		driver.switchTo().frame(value);
	}
	
	public static void frameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void frameByWebElement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}
	
	public static void switchToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void switchToTopframe()
	{
		driver.switchTo().defaultContent();
	}
}
