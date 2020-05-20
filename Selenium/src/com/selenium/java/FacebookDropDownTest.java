package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://facebook.com");
       driver.manage().window().maximize();
          
       //Month dropdown
       Select month=new Select(driver.findElement(By.id("month")));
       month.selectByIndex(4); 
       
       //Day dropdown
       Select day=new Select(driver.findElement(By.id("day")));
       day.selectByIndex(4);
       
       //year dropdown
       Select year=new Select(driver.findElement(By.id("year")));
       year.selectByIndex(4);
       
       
            
 
  
	}
 }

