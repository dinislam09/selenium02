package com.fb.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook_Test {
	public static ChromeDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
		 dr = new ChromeDriver();
		 dr.manage().window().maximize();
		
	}
	
	@Test
	public void sendFBURL() {
		dr.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void sendGoogleURL() {
		dr.get("https://www.google.com/");
	}

	@After
	public void closeBrowser() {
		dr.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
