package TestLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageLayer.HomePage;


@Test(dependsOnGroups= {"loginpage"},groups= {"homepage"})
public class HomePageTest {
	 HomePage homepage;
	 

	 
	@Test(priority=1)
	public void validateHomePageLogo()
	{
		 homepage=new HomePage();
//		Assert.assertTrue(homepage.homePageLogo());
		Assert.assertEquals(homepage.homePageLogo(),true);
	}
	
	@Test(priority=2)
	public void validateHomePageUrl()
	{
		Assert.assertEquals(homepage.getHomePageUrl().contains("orangehrmlive"),true);
	}
	
	@Test(priority=3)
	public void validategetHomePageTitle()
	{
		Assert.assertEquals(homepage.getHomePageTitle(),"OrangeHRM");
	}
	@Test(priority=4)
	public void validateclickonPImLink()
	{
		
          homepage.clickOnPIM();
	}
	

	
}
