package com.selenium.java;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuikrTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://www.quikr.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//a[@id='searchedCat']")).click();
	     
	     Thread.sleep(3000);
	     java.util.List<WebElement> list=driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/a"));
	     System.out.println(list.size());
	     for (int i=0; i < list.size(); i++)
	     {
	    	 System.out.println(list.get(i).getText());   	 
	     }
	}

}
