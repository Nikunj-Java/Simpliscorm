package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteractionExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//email
		WebElement email= driver.findElement(By.id("email"));
		
		Actions builder= new Actions(driver);
		Action seriesOfAction= builder
				.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys(email,"Nikunj Soni")
				.doubleClick(email)
				.contextClick()
				.build();
		
		
		seriesOfAction.perform();
	}

}
