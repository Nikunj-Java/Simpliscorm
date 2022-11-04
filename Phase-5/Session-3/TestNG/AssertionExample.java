package com.simplileaern.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	WebDriver driver=null;
	SoftAssert soft=null;
	
	@Test
	public void TitleTest() {
		//testcase
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//assertion
		soft.assertEquals(driver.getTitle(), "Google");
		soft.assertAll();
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		  driver= new ChromeDriver();
		  soft= new SoftAssert();
	}
	@AfterMethod
	public void afterMethod() {
		driver=null;
	}

}
