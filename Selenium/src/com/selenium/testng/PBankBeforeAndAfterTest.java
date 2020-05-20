package com.selenium.testng;
import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class PBankBeforeAndAfterTest 
	{
		FirefoxDriver driver;
		@BeforeTest
		public void applaunch()
		{
			//for application launch
			driver=new FirefoxDriver();
			driver.get("Http://primusbank.qedgetech.com/");
			driver.manage().window().maximize();
			
			//Validation
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());				
		}
		@Test
		public void appLogin()
		{
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
		    driver.findElement(By.id("txtPword")).sendKeys("Admin");
		    driver.findElement(By.id("login")).click();
           // Validation
     Assert.assertTrue(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed());        
		}
		/*@Test
		// new branch creation
		public void Newbranchcreation(String branchname, String add1)
		{
			
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			
	        driver.findElement(By.id("BtnNewBR")).click();
	       
	        driver.findElement(By.id("txtbName")).sendKeys(branchname);
	        driver.findElement(By.id("txtAdd1")).sendKeys(add1);
	        driver.findElement(By.id("txtZip")).sendKeys("99999");
	        
	        //Country Dropdown
	        
		     Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		     country.selectByIndex(1);
		    
		     //State Dropdown
		     Select state=new Select(driver.findElement(By.id("lst_stateI")));
		     state.selectByIndex(1); 
		    
		     //city Dropdown
		     Select city=new Select(driver.findElement(By.id("lst_cityI")));
		     city.selectByIndex(1);
		     
		    
		     driver.findElement(By.id("btn_insert")).click();
		     
		     Alert al=driver.switchTo().alert();
		     String msg=al.getText();
		     al.accept();
		
		//Validation
		     Assert.assertTrue(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).isDisplayed()); 
		}
		*/
				@AfterTest
		public void appclose()
		{
			driver.close();
		}
    
	}



