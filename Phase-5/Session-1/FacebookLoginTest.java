package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	
	public static void main(String[] args) {
				//STEP:1 DECLARE A PATH
				String path="D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				
				//STEP:2 INITIALIZE THE DRIVER
				WebDriver  driver= new ChromeDriver();
				
				//STEP:3 GIVE THE BASE URL
				String url="https://www.facebook.com/";
				driver.get(url);
				
				
				
				//maximise the window
				driver.manage().window().maximize();
				
				System.out.println("Title: "+driver.getTitle());
				
				
				//email
				WebElement email=driver.findElement(By.id("email"));
				email.sendKeys("nikunj@gmail.com");
				
				//password
				WebElement pass= driver.findElement(By.id("pass"));
				pass.sendKeys("Nikunj@123");
				
				//login button
				WebElement login=driver.findElement(By.name("login"));
				login.click();
	}

}
