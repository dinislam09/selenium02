package com.study;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupStudy {
	public static ChromeDriver dr;
	
	
	@Before
	public void sub() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
         dr = new ChromeDriver();
         dr.get("https://www.facebook.com/"); 
         dr.manage().window().maximize();
         dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    @Test
	public void add() throws InterruptedException {
		//dr.get("https://www.facebook.com/"); 
		
		String url=dr.getCurrentUrl();
		Assert.assertEquals(url, "https://www.facebook.com/");
		//Assert.assertEquals(url, "https://www.facebook.com/");
		dr.findElementByXPath("//*[@id=\"u_0_m\"]").sendKeys("sgdkjsadjg");
		dr.findElementByXPath("//*[@id=\"u_0_o\"]").sendKeys("kjfkja");
			
		
			Select dd = new Select(dr.findElement(By.xpath("//*[@id=\"month\"]")));

			dd.selectByIndex(9);
			Select d = new Select(dr.findElement(By.id("day")));
			d.selectByIndex(15);
			
			Select t = new Select(dr.findElement(By.id("year")));
			t.selectByVisibleText("1988");
			
			Thread.sleep(3000);
			
			//dr.findElementByXPath("//*[@id=\"u_0_8\"]").click();
			
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("window.scrollBy(0,500)");

			
			

    }
	//@Test
	//public void add1() {
	//	dr.get("https://www.google.com/");
		
	//}
	//@After
	//public void add2() {
		//dr.quit();
	//}
	
	
	
	
	
}
