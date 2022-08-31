package TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.PimPage;
import UtilsLayer.ExcleReader;


@Test(dependsOnGroups= {"homepage"},groups= {"PIMpage"})
public class PimPageTest extends Baseclass {

	public ExcleReader excle;
	PimPage pimpage;
	@Test(priority=1)
	public void validatePIMPageUrl()
	{
		 pimpage=new PimPage();
		Assert.assertEquals(pimpage.getUrlPimPage().contains("pim"),true);
	}
	

	
	 @Test(priority=2,dataProvider="addemploye")
	public void validateaddemployee(String uname,String mname,String lastname)
	{
		 pimpage.addEmployee(uname,mname,lastname);
		 
	}
	
	 @DataProvider(name="addemploye")
	public Object[][] getData() throws IOException
	{
		excle=new ExcleReader("C:\\Users\\hp\\Desktop\\detadriven1.xlsx");
		
	    int row=excle.countrows(0);
	    int cell=excle.countcells(0);
	    
	    Object[][] data= new Object[row][cell];
	     for (int i=0;i<row;i++)
	     {
	    	 data[i][0] =excle.getDataFromExcel(0,i,0);
	    	 data[i][1]= excle.getDataFromExcel(0,i,1);
	    	 data[i][2]=excle.getDataFromExcel(0,i,2);
	     }
	    return data;		
	}
	
	
}
