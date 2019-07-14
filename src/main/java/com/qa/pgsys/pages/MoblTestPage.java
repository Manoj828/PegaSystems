package com.qa.pgsys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pgsys.base.TestBase;

public class MoblTestPage extends TestBase {
	
	
	@FindBy(xpath="//h3[contains(text(),'Mobile Testing')]") 
	WebElement Title; 
	
	
	public MoblTestPage(){ 
	PageFactory.initElements(driver, this);
    }

}
