package com.selenium.webdriverpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckListEchoAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.echoecho.com/htmlforms10.htm");
       driver.manage().window().maximize();
       
       WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
       java.util.List<WebElement> checkList=table.findElements(By.tagName("input")); 

       //System.out.println(checkList.size());
       
       //For check a specific item
       /*for (int i = 0; i < checkList.size(); i++)
       {
    	 if (checkList.get(i).getAttribute("value").equals("Milk"))
    	 {
    		 checkList.get(i).click();
    	 }
       }*/
       
       // for test the  items are selected
       /*for (int i = 0; i < checkList.size(); i++)
       {
    	   System.out.println(checkList.get(i).getAttribute("value")+ "  "+checkList.get(i).getAttribute("checked"));
       }*/     
   
       //for check the all table items
        for (int i = 0; i < checkList.size(); i++)
        {
   	   checkList.get(i).click();
       
       
          
    	   
    	   
       }
       
       
       
       }

	
	}


