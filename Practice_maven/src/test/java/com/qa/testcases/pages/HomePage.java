package com.qa.testcases.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testcases.TestBase;

import io.qameta.allure.Step;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womentab;
	

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dresstab;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement tshirttab;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@Step("Getting Dress result")
	public boolean verifydresstab(){
		return dresstab.isDisplayed();
	}
	
	@Step("Getting women result")
	public boolean verifyWomentab(){
		return womentab.isDisplayed();
	}
	
	@Step("Getting tshirt result")
	public boolean verifyTshirttab(){
		return tshirttab.isDisplayed();
	}

}
