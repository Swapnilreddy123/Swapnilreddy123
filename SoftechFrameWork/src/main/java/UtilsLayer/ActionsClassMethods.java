package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.Baseclass;

public class ActionsClassMethods extends Baseclass {

	
public  Actions act;
	
	public  void clickoperation(WebElement wb)
	{
		act=new Actions(driver);
		act.click(wb).build().perform();
	}
	
     public  void contextClick(WebElement wb)
   {
    	act= new Actions(driver);
 		act.contextClick(wb).build().perform();
   }
     public  void mouseOverAndClick (WebElement wb,WebElement clickon)
    {
    	act=new Actions(driver);
    	act.moveToElement(wb).click(clickon).build().perform();
     }
    
     public  void mouseOver(WebElement wb)
     {
    	 act=new Actions(driver);
  		act.moveToElement(wb).build().perform();
    	 
     }
      public  void sendKeysinTextBox(WebElement wb,String value)
      {
    	 act= new Actions(driver);
    	  act.sendKeys(wb,value).build().perform();
      }
      
      public  void doubleclick(WebElement wb)
      {
    	 act= new Actions(driver);
    	  act.doubleClick(wb).build().perform();
      }
      
      public  void clickAndHold(WebElement wb)
      {
    	act=  new Actions(driver);
    	  act.clickAndHold(wb).build().perform();
      }
      
      public  void releaseHoldElement(WebElement wb)
      {
    	act= new Actions(driver);
    	 act.release(wb).build().perform();  
      }
      
      public  void dragAndDrop(WebElement src,WebElement targ)
      {
    	  act=new Actions(driver);
    	  act.dragAndDrop(src,targ).build().perform();
      }
      
      public  void enterDataInCaps(WebElement wb,String value)
      {
    	 act= new Actions(driver);
    	  act.keyDown(Keys.SHIFT).sendKeys(wb,value).build().perform();
      }
     
}
