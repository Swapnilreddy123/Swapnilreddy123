package ConfigLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessScript {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Path of chrome driver"); 
		ChromeOptions obj =new ChromeOptions(); 
		 
		obj.addArguments("--headless"); 
		 
		WebDriver driverName = new ChromeDriver(obj); 

	}

}
