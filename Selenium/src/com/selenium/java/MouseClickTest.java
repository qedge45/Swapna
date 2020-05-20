package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();

       WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
       /*WebElement yourList=driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
       Actions mouse=new Actions(driver);
       //mouse.moveToElement(signIn).build().perform();
       //mouse.moveToElement(yourList).click().build().perform();
       //another way to move the mouse on two Elements
       mouse.moveToElement(signIn).moveToElement(yourList).click().build().perform();
*/       
       WebElement pantryLists=driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[8]/span"));
       Actions mouse=new Actions(driver);
       mouse.moveToElement(signIn).moveToElement(pantryLists).click().build().perform();

	}

}
