package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DashboardPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//input[@id=\"search_query_top\"]")
	WebElement searchtextBox;
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public boolean validateCRMImage(){
		
		return crmLogo.isDisplayed();
	}
	
	public boolean validatepresencesearchbox(){
		return searchtextBox.isDisplayed();
	}
	
}
