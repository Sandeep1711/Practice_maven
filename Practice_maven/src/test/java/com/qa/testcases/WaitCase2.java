package com.qa.testcases;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitCase2 
{
	WebDriver driver ;
	WebDriverWait ww2;
	
  @BeforeMethod
  public void setup()
  {
	
	ChromeOptions cc = new ChromeOptions();
	
	cc.addArguments("--headless");
	
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
	
	driver = new ChromeDriver(cc);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");
	
	ww2 = new WebDriverWait(driver, 30);
	
  }
  
  @Test
  public void tc_explicit_greater_Implicit()
  {
	  
	  System.out.println("start time : "+new Date());
	  
	  try
	  {
		  WebElement fromTextBox=ww2.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("q"))));
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  System.out.println("end time : "+new Date());
	  
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
