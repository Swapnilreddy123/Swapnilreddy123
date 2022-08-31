package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	
	public static void setup(String browsername)
	{ 
	  
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	     
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		
		else 
		{
			System.out.println("enter valid browswrname");
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 
//	 driver.get("https://opensource-demo.orangehrmlive.com/");
//		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}
	
}
