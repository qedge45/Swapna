package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();
       
       driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
       driver.findElement(By.className("nav-input")).click();
       

	}

}
