package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
  
	      Actions pagedown=new Actions(driver);
	      pagedown.sendKeys(Keys.PAGE_DOWN);
	      driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();


	}

}
