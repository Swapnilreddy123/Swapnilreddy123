package BaseLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuter {
	public static WebDriver driver;
	public static void facebook()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('paymentPlanId').click();");
	}
	
}
