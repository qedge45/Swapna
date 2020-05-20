package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyTest {

	public static void main(String[] args) {
		  FirefoxDriver driver=new FirefoxDriver();
	      driver.get("https://www.google.com/advanced_search");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("xX4UFf")).sendKeys("Swapna");
	      //select text
	      driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
	      //copy text
	      driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
          //paste text
	      driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
	}

}
