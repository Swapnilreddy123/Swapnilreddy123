package UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.Baseclass;

public class ExtenedReports extends Baseclass {
	public  static ExtentReports extent;
	
	public static ExtentReports extentreportsetup()
	{
		String date =new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("C:\\Users\\hp\\eclipse-workspace\\SoftechFrameWork\\Reports\\"+date+"extentreport.html");
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		sparkreporter.config().setDocumentTitle("PIM Page Test Cases");
		return extent;
		
	}
	
	
	
   	
	
}
