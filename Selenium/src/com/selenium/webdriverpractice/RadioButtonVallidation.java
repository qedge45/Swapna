package com.selenium.webdriverpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonVallidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.echoecho.com/htmlforms10.htm");
       driver.manage().window().maximize();
       
       for(int k=1; k<=2; k++){
       WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
       java.util.List<WebElement> radioList=table.findElements(By.name("group" +k)); 
       System.out.println("Group : "+k);
       //System.out.println(radioList.size());
       for(int i=0; i<radioList.size(); i++)
       {
    	 radioList.get(i).click();
    	 for(int j=0; j<radioList.size(); j++){
    	   System.out.println(radioList.get(j).getAttribute("value")+ "-------"+radioList.get(j).getAttribute("checked"));
    	   }
    	 System.out.println("_____________");   	 
    	 
    	 
       }
       
       
           
       }
       
       
       
       
	}
       
       
       
       
       
	}


