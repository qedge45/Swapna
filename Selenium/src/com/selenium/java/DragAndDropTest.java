package com.selenium.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://jqueryui.com/droppable/");
       driver.manage().window().maximize();
       //finding the frame count by using Tagname
       java.util.List<WebElement> frames=driver.findElements(By.tagName("iframe"));
       System.out.println(frames.size());
       
       //give the control to the specific frame
       //1.givind control based on the index
       
       //driver.switchTo().frame(0);
       //2.givind control based on string(Xpath)
       
       //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
       //3.givind control based on webelement
       WebElement fram1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
       driver.switchTo().frame(fram1);
       
       WebElement drag=driver.findElement(By.id("draggable"));
       WebElement drop=driver.findElement(By.id("droppable"));
       
       Actions draganddrop=new Actions(driver);
       draganddrop.dragAndDrop(drag, drop).build().perform();
       
       //giving the control to privious html document
       driver.switchTo().defaultContent();
       System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
       

       
       
	}

}
