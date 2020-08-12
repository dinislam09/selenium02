package com.fb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Amazone {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver(); 
		dr.get("https://www.amazon.com/");
		dr.manage().window().maximize();
		//dr.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		Thread.sleep(3000);
		//dr.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span")).click();
		
		JavascriptExecutor je =(JavascriptExecutor)dr;
		je.executeScript("window.scrollBy(0, 2000)");
		
	 
	 

}

}
