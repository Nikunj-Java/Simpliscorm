package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//maximise the window
		driver.manage().window().maximize();
		System.out.println("Title: "+driver.getTitle());
		
		
		//locating WebElements
		
		//By Id
		WebElement email_id=driver.findElement(By.id("email"));
		
		//By Name
		WebElement email_name=driver.findElement(By.name("email"));
		
		System.out.println("Email by id and name: "+email_id.equals(email_name));
		
		
		//find link text
		
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//by relative Path (Xpath)
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		System.out.println("Email by id and xpath: "+email_id.equals(email_xpath));
		
		
		//by full xPath 
		WebElement email_full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
				
		System.out.println("Email by xpath and full xpath: "+email_xpath.equals(email_full_xpath));
				

		//by using css selector
		WebElement email_cssSelector=driver.findElement(By.cssSelector("#email"));
		System.out.println("Email by cssSelector and full xpath: "+email_cssSelector.equals(email_full_xpath));
		
		
		//List of Web elements 
		List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of WebElements: "+e.getAttribute("placeholder"));
		}
		
		//by tag 
		WebElement password= driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));

		
		driver.close();
		
		
	}

}
