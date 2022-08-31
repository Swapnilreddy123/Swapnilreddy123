package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;
import UtilsLayer.DropDrown;

public class DropDownTest extends Baseclass{

	public static void main(String[] args)
	{
		
		Baseclass.setup("chrome");
	}
	
	
		public static void visibletext() 
		{
			WebElement wb=driver.findElement(By.id("month"));
		    DropDrown.handleDPByVisibleText(wb,"Sep");
		}
		public static void byvalue()
		{
		WebElement wb=driver.findElement(By.id("year"));
		DropDrown.handleDPByvalue(wb,"2000");
		}
		
		public static void index()
		{
		  WebElement wb=driver.findElement(By.id("day"));
		  DropDrown.handleDPByIndex(wb,28);
		  DropDrown.getselectevalue(wb);
		}
		
		
		
	

}
