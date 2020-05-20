package com.selenium.webdriverpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       driver.manage().window().maximize();
       
       //driver.findElement(By.id("remember")).click();
       System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
       //Validation
       if(driver.findElement(By.id("remember")).isSelected())    
       {
    	   driver.findElement(By.id("remember")).click(); 
    	   System.out.println(driver.findElement(By.id("remember")).getAttribute("checked")); 
       }
         
       }
	}





