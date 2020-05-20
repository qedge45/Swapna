package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();
       
       WebElement Gmail=driver.findElement(By.linkText("Gmail"));
       Actions right=new Actions(driver);
       //right.contextClick(Gmail).sendKeys("T").build().perform();
       //keyboard
       right.contextClick(Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       

       
       
       
       
	}

}
