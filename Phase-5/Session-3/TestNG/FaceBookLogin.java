package com.simplileaern.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookLogin {
	WebDriver driver;
	 
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("nikunj@123");
	  driver.findElement(By.name("login")).submit();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
	  driver= new ChromeDriver();
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver=null;
  }
}
