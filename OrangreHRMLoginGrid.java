package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OrangreHRMLoginGrid 
 {
	@Test
	public void loginTest() throws MalformedURLException
	{
		//running grid with node in firefox
		
		/*DesiredCapabilities cap=null;
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("Http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
*/	
		//running grid with node2 in chrome
		
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("Http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();

		
		

	}
}
