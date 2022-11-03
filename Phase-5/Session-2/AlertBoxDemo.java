package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		//simple alertbox
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		
		//confirm alertbox
		
		driver.findElement(By.name("confirmalertbox")).click();
		driver.switchTo().alert().accept();
		System.out.println("Text: "+driver.findElement(By.id("demo")).getText());
		
		//prompt alertbox
		driver.findElement(By.name("promptalertbox1234")).click();
		driver.switchTo().alert().sendKeys("No");  ///yes /no
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		System.out.println("Text: "+driver.findElement(By.id("demoone")).getText());
		
		//driver.close();
		
	}

}
