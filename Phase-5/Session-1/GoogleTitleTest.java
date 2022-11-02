package com.simplilearn.demo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleTest {
	
	public static void main(String[] args) {
				//STEP:1 DECLARE A PATH
				String path="D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
			
				//STEP:2 INITIALIZE THE DRIVER
				WebDriver  driver= new ChromeDriver();
				
				//STEP:3 GIVE THE BASE URL
				String url="http://www.google.com/";
				driver.get(url);
				
				System.out.println("Title: "+driver.getTitle());
				
				assertEquals("Google", driver.getTitle());
				
				driver.close();
				
	}

}
