package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnersClass extends ExtenedReports implements ITestListener  {

	public static ExtentTest extenttest;
	
	public void onStart(ITestContext context) 
	{
		extent = ExtenedReports.extentreportsetup();
	}
	
	
	public void onTestStart(ITestResult result)
	{
		extenttest=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		extenttest.log(Status.PASS, result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) 
	{
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result)
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	

	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}

}
