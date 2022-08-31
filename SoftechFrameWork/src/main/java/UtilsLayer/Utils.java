package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.Baseclass;

public class Utils extends Baseclass {

	public void captureScreenshot(String path) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs= ts.getScreenshotAs(OutputType.FILE);
		File dist=new File(path);
		FileUtils.copyFile(fs,dist);
	
	}
	
	
}
