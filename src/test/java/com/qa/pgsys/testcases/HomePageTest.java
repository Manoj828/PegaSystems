package com.qa.pgsys.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pgsys.base.TestBase;
import com.qa.pgsys.pages.HomePage;
import com.qa.pgsys.pages.MoblTestPage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	MoblTestPage moblpage;
	
	public HomePageTest()
	{
		super();
	}
	
	
   @BeforeMethod()
   public void setup()
  {
	Initialisation();
	homepage = new HomePage();
	
  }
	

  @Test(priority=1)
  public void LogoTest()
  {
	 Assert.assertTrue(homepage.VerifyLogo());
  } 

  @Test(priority=2)
  public void TitleTest()
  {
	 String Title= homepage.VerifyTitle();
	 Assert.assertEquals(Title,"Customer Engagement and Digital Process Automation Software | Pega", "Title is not matching");
  } 
  
  @Test(priority=3) 
  public void HeaderLinkTest()
  {
	Assert.assertTrue(homepage.VerifyProductLink());
	Assert.assertTrue(homepage.VerifySolutionLink());
	Assert.assertTrue(homepage.VerifyCustomersLink());
	Assert.assertTrue(homepage.VerifyWhyPegaLink());
	Assert.assertTrue(homepage.VerifySPLink());
	Assert.assertTrue(homepage.VerifyEventsLink());
	Assert.assertTrue(homepage.VerifyAboutLink());
  } 
 
  @Test(priority=3) 
  public void Product_SubLinkTest() 
  {
	Assert.assertTrue(homepage.VerifyProdSubLink1());
	Assert.assertTrue(homepage.VerifyProdSubLink2());
	Assert.assertTrue(homepage.VerifyProdSubLink3());
  }  

  @Test(priority=4) 
  public void Solution_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifySolSubLink1());
	Assert.assertTrue(homepage.VerifySolSubLink2());
  }  
   
  @Test(priority=5) 
  public void Customer_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyCustomerSubLink1());
	Assert.assertTrue(homepage.VerifyCustomerSubLink2());
  }  

  @Test(priority=6) 
  public void WhyPega_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyWhyPegaSubLink1());
	Assert.assertTrue(homepage.VerifyWhyPegaSubLink2());
	Assert.assertTrue(homepage.VerifyWhyPegaSubLink3());
  }  
  
  @Test(priority=7) 
  public void SP_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifySPSubLink1());
	Assert.assertTrue(homepage.VerifySPSubLink2());
	Assert.assertTrue(homepage.VerifySPSubLink3());
	Assert.assertTrue(homepage.VerifySPSubLink4());
  }  
  
  @Test(priority=8) 
  public void Events_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyEventSubLink1());
	Assert.assertTrue(homepage.VerifyEventSubLink2());
  }  
  
  @Test(priority=9) 
  public void About_SubLinkTest()
  {
	Assert.assertFalse(homepage.VerifyAboutSubLink1());// failing this step in order to take screenshot on failure
	Assert.assertTrue(homepage.VerifyAboutSubLink2());
	Assert.assertTrue(homepage.VerifyAboutSubLink3());
  }  
 
   @AfterMethod()
   public void tearup()
   {
	 driver.quit();
   }

	
	
	
}
