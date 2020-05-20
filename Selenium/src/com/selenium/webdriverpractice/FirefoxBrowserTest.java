package com.selenium.webdriverpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest 
{

	public static void main(String[] args) 
	{	
      FirefoxDriver driver=new FirefoxDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      
    }

}
