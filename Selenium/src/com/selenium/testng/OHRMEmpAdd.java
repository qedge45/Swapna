package com.selenium.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OHRMEmpAdd extends OHRMTestNg
{
	@Test(dataProvider="getData")
		public void empAdd(String FirstName, String LastName) throws Exception
		{
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("PIM")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Add Employee")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("firstName")).sendKeys(FirstName);
		 Thread.sleep(2000);
		 driver.findElement(By.id("lastName")).sendKeys(LastName);
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnSave")).click();
		
		}
	 @DataProvider
     public Object[][]getData()
    {
    	Object[][] data=new Object[2][2];
    	data[0][0]="ExtendsA";
    	data[0][1]="ExtendsB";
    	
    	data[1][0]="ExtendsA1";
    	data[1][1]="ExtendsB1";
    	
    	return data;
    	
    }
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

