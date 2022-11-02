package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) {
		//downlaod selenium google chrome extension from
		//link:https://chromedriver.chromium.org/downloads
		
		//downlaod selenium library files from
		//link: https://www.selenium.dev/downloads/
		
		//check your google chrome verion sfrom chrome>help>aboutgoogle chrome
		//check your driver  and downloadthe same from above link
		
		//also download selenium-java 3.5.0
		
		//prepare java project> goto project>rightclick>build path>configure build path>libraries>classpath
		//>add external jar files> select all the jar files from  selenium -java-3.5.0
		//click on Apply and Apply and close
		
		
		
		//STEP:1 DECLARE A PATH
		String path="D:\\Phase-5\\chromedriver_win32_Nov_new\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//STEP:2 INITIALIZE THE DRIVER
		WebDriver  driver= new ChromeDriver();
		
		//STEP:3 GIVE THE BASE URL
		String url="http://www.google.com/";
		driver.get(url);
		
		driver.close();
		System.out.println("Driver is Working Perfectly");
		
		
	}

}
