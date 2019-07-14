package com.qa.pgsys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pgsys.base.TestBase;
import com.qa.pgsys.util.TestUtil;

public class HomePage extends TestBase{

	//Page Factory - Object repo
	@FindBy(xpath="//a[@class=\"c-site-logo qa-site-logo\"]/img") 
	WebElement logo; 
	 
	@FindBy(xpath="//span[contains(text(),'Products')]") // List of Elements available in Home Page
	WebElement ProdLink;
	
	@FindBy(xpath="//a[@title=\"Explore Products\"]") 
	WebElement ProdSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Capabilities')]") 
	WebElement ProdSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'Demos & Trials')]") 
	WebElement ProdSubLink3;
	
	@FindBy(xpath="//span[contains(text(),'Solutions')]") 
	WebElement SolutionLink;
	
	@FindBy(xpath="//span[contains(text(),'Industry Solutions')]") 
	WebElement SolSubLink1;
	
	@FindBy(xpath="//span[contains(text(),'What do you want to solve?')]") 
	WebElement SolSubLink2;
	
	@FindBy(xpath="//span[contains(text(),'Customers')]") 
	WebElement CustomersLink;
	
	@FindBy(xpath="//span[contains(text(),'Customers By Industry')]") 
	WebElement CustomerSubLink1;
	
	@FindBy(xpath="//span[contains(text(),'Customers by Solution')]") 
	WebElement CustomerSubLink2;
	
	@FindBy(xpath="//span[contains(text(),'Why Pega?')]") 
	WebElement WhyPegaLink;
	
	@FindBy(xpath="//span[contains(text(),'Pega DX Architecture™')]") 
	WebElement WhyPegaSubLink1;
	
	@FindBy(xpath="//span[contains(text(),'Market Leadership')]") 
	WebElement WhyPegaSubLink2;
	
	@FindBy(xpath="//span[contains(text(),'Vision & Insights')]") 
	WebElement WhyPegaSubLink3;
	
	@FindBy(xpath="//span[contains(text(),'Services & Partners')]") 
	WebElement SPLink;
	
	@FindBy(xpath="//a[contains(text(),'Partners')]") 
	WebElement SPSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Consulting')]") 
	WebElement SPSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'Training & Certifications')]") 
	WebElement SPSubLink3;
	
	@FindBy(xpath="//a[contains(text(),'Support & Community')]") 
	WebElement SPSubLink4;
	
	@FindBy(xpath="//span[contains(text(),'Events')]") 
	WebElement EventsLink;
	
	@FindBy(xpath="//a[contains(text(),'PegaWorld')]") 
	WebElement EventSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Upcoming Events')]") 
	WebElement EventSubLink2;
	
	@FindBy(xpath="//span[contains(text(),'About')]") 
	WebElement AboutLink;
	
	@FindBy(xpath="//a[contains(text(),'About Us')]") 
	WebElement AboutSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'News')]") 
	WebElement AboutSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'Careers')]") 
	WebElement AboutSubLink3;
	
	
	//Initializing the Page Objects:
	public HomePage(){ 
	PageFactory.initElements(driver, this);
	}
	
		
	//Actions:
	public boolean VerifyLogo()
	{
		return logo.isDisplayed();
	}
	
	public String VerifyTitle()
	{
		return driver.getTitle();
	}
	

	public boolean  VerifyProductLink() 	// methods for header links	of homepage
	{
		return ProdLink.isDisplayed();
		
	}
	
	public boolean VerifySolutionLink()
	{
		return SolutionLink.isDisplayed();
	}
	
	public boolean VerifyCustomersLink()
	{
		return CustomersLink.isDisplayed();
	}
	
	public boolean VerifyWhyPegaLink()
	{
		return WhyPegaLink.isDisplayed();
	}
	
	public boolean VerifySPLink()
	{
		return SPLink.isDisplayed();
	}
	
	public boolean VerifyEventsLink()
	{
		return EventsLink.isDisplayed();
	}
	
	public boolean VerifyAboutLink()
	{
		return AboutLink.isDisplayed();
	}
	
	public boolean VerifyProdSubLink1()   // methods for sub links of "Product"
	{
	   TestUtil.Action(ProdLink);
	   TestUtil.Wait(ProdSubLink1);	
	   return ProdSubLink1.isDisplayed();	
	}
	
	public boolean VerifyProdSubLink2()
	{
	    return ProdSubLink2.isDisplayed();	   
	}
	

	public boolean VerifyProdSubLink3()
	{
	  	 return ProdSubLink3.isDisplayed();	   
	}
	
	
	public boolean VerifySolSubLink1()  // methods for sub links of "Solution"
	{
	   TestUtil.Action(SolutionLink);
	   TestUtil.Wait(SolSubLink1);	
	   return SolSubLink1.isDisplayed();	   
	}
	
	public boolean VerifySolSubLink2()
	{
	   return SolSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyCustomerSubLink1()  // methods for Header sub links of "Customers"
	{
	   TestUtil.Action(CustomersLink);
	   TestUtil.Wait(CustomerSubLink1);	
	   return CustomerSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyCustomerSubLink2()
	{
	   return CustomerSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyWhyPegaSubLink1()  // methods for sub links of "WhyPega" 
	{
	   TestUtil.Action(WhyPegaLink);
	   TestUtil.Wait(WhyPegaSubLink1);
	   return WhyPegaSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyWhyPegaSubLink2()
	{
	   return WhyPegaSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyWhyPegaSubLink3()
	{
	   return WhyPegaSubLink3.isDisplayed();	   
	}
	
	public boolean VerifySPSubLink1() // methods for sub links of "Services & Partners"
	{
	   TestUtil.Action(SPLink);
	   TestUtil.Wait(SPSubLink1);
	   return SPSubLink1.isDisplayed();	   
	}
	
	public boolean VerifySPSubLink2()
	{
	   return SPSubLink2.isDisplayed();	   
	}
	
	public boolean VerifySPSubLink3()
	{
	   return SPSubLink3.isDisplayed();	   
	}
	
	public boolean VerifySPSubLink4()
	{
	   return SPSubLink4.isDisplayed();	   
	}
	
	
	public boolean VerifyEventSubLink1()   // methods for sub links of "Events"
	{
	   TestUtil.Action(EventsLink);
	   TestUtil.Wait(EventSubLink1);
	   return EventSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyEventSubLink2()
	{
	   return EventSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyAboutSubLink1()    // methods for sub links of "About" 
	{
	   TestUtil.Action(AboutLink);
	   TestUtil.Wait(AboutSubLink1);
	   return AboutSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyAboutSubLink2()
	{
	   return AboutSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyAboutSubLink3()
	{
	   return AboutSubLink3.isDisplayed();	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
