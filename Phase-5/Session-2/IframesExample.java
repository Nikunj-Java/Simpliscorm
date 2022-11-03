package com.simplilearn.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("D:\\Phase-5\\iframe.html");
		driver.manage().window().maximize();
		
		//find the iframe from the website
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		List<WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println("total Numbers of Iframe Found: "+frame.size());
	}

}
