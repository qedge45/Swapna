package com.selenium.webdriverpractice;
import org.openqa.selenium.chrome.*;
public class CromeBrowserTest {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://facebook.com");		

	}

}
