package com.selenium.java;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
       
       //WebElement drop=driver.findElement(By.id("searchDropdownBox"));
       java.util.List<WebElement> dropList=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
        System.out.println(dropList.size());
        for (int i=0; i<dropList.size(); i++)
        {
         
        //System.out.println(dropList.get(i).getText());
        // Select one by one otem from the dropdown
        	//dropList.get(i).click();
        	//select specific item from dropdown
        	//if(dropList.get(i).getText().equals("Baby"))
        	//{dropList.get(i).click();}
        }
        	
        	
        }
	
	
	}


