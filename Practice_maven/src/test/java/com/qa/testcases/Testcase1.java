package com.qa.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 
{
	
	WebDriver driver;
	
  @BeforeMethod
  public void setup() 
  {
	  System.setProperty("webdriver.chrome.driver","C:/Users/sandeep_sharma1/browsers/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.google.com/");
	  
  }
  
  
  @Test
  public void test1()
  {
	  String title = driver.getTitle();
	  
	  Assert.assertEquals("Google", title);
  
  }
  
  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
	  
  }
  
  
}
