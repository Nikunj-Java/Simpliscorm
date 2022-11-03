package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		driver.manage().window().maximize();
		
		
		WebElement checkBox= driver.findElement(By.id("id_privacy"));
		if(checkBox.isSelected()) {
			System.out.println("Checkbox is selected by default");
			System.out.println("Status: "+checkBox.isSelected());
		}
		else {
			System.out.println("Checkbox is Not Selected");
		}
		checkBox.click();
		System.out.println("Status: "+checkBox.isSelected());
		
		//driver.close();
	}
}
