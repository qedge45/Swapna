package com.selenium.webdriverpractice;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sahasra\\Downloads\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");	
	  InternetExplorerDriver driver=new InternetExplorerDriver();
	  driver.get("http://www.google.com/");
	  
	}
}
	
