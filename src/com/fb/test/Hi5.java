package com.fb.test;



import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hi5 {
	static ChromeDriver d;
	
	@Test
	public void add() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
			d = new ChromeDriver();
			d.get("https://hi5.com/");
			d.manage().window().maximize();
			d.findElement(By.id("display_name")).sendKeys("ashgdsja");
			d.findElement(By.id("email")).sendKeys("sghdhs.com");
			d.findElement(By.id("zipCode")).sendKeys("25268");
			
			Select t = new Select(d.findElement(By.id("birth_month")));
				t.selectByIndex(10);
				
			Select p = new Select(d.findElement(By.id("birth_day")));
				p.selectByIndex(22);
				
			Select q = new Select(d.findElement(By.id("birth_year")));
				q.selectByVisibleText("1999");	
				
			Select r = new Select(d.findElement(By.id("ethnicity_selector")));
				r.selectByValue("east_indian");	
				
				d.findElement(By.id("male")).click();
				
				JavascriptExecutor js = (JavascriptExecutor)d;
					js.executeAsyncScript("window.scrollBy(0,300)");
				
				//d.findElement(By.id("signup_button")).click();
					
					Thread.sleep(3000);
					
					
					
					
				
				List<WebElement>links=d.findElements(By.tagName("a")); // don't work
				System.out.println(links.size());
				
				
				
		
		
	}

}
