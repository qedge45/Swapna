package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametreizationtest 
{
	@Test(dataProvider="getData")
	public void adminLogin(String username, String Password)
	{
		   FirefoxDriver driver=new FirefoxDriver();
	       driver.get("http://primusbank.qedgetech.com/");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("txtuId")).sendKeys(username);
		    driver.findElement(By.id("txtPword")).sendKeys(Password);
		    driver.findElement(By.id("login")).click();

	  }
	
	    @DataProvider
	    public Object[][]getData()
	    {
	    	Object[][] data=new Object[1][2];
	    	data[0][0]="Admin";
	    	data[0][1]="Admin";
	    	
	    	return data;
	    	
	    }
	    
	    
	    

	    
	    
	    
}
