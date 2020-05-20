package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinkTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	     
	     //Identify the header section and stored into webElement
      // WebElement header=driver.findElement(By.id("nav-xshop"));
       
    //identify the all links present under header section and stored into webElement
       java.util.List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
 	System.out.println(headerLinks.size());
 	for (int i=0; i<headerLinks.size(); i++){
 		System.out.println(headerLinks.get(i).getText());
 	}
 	
	}
 		
 	}


