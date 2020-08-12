package com.fb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelAgents {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();

	dr.get("https://www.emirates.com/us/english/");
	dr.manage().window().maximize();
	dr.findElement(By.xpath("//*[@id=\"login-nav-link\"]/span[1]")).click();
	Thread.sleep(3000);
	dr.findElement(By.id("sso-email_label")).sendKeys("jksfksjfj");
	dr.findElement(By.id("sso-password_label")).sendKeys("743690-31");
	dr.findElement(By.id("login-button")).click();
	
	
}

}
