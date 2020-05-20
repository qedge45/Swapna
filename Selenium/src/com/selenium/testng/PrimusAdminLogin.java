package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PrimusAdminLogin 
{
	
	FirefoxDriver driver;
	@Test
	public void applaunchandadminlogin()
	{
		//for application launch
		driver=new FirefoxDriver();
		driver.get("Http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//Adminlogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
	    driver.findElement(By.id("txtPword")).sendKeys("Admin");
	    driver.findElement(By.id("login")).click();
		

	}
}
