package com.selenium.webdriverpractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.echoecho.com/htmlforms09.htm");
       driver.manage().window().maximize();
       
       WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
       java.util.List<WebElement> checkList=table.findElements(By.tagName("input")); 
       //System.out.println(checkList.size());
       
         //for check the all table items
          /*for (int i = 0; i < checkList.size(); i++)
          {
     	   checkList.get(i).click();
          }*/
       
        //For check a specific item 
       /* for (int i = 0; i < checkList.size(); i++)
       {
    	 if (checkList.get(i).getAttribute("value").equals("Milk"))
    	 {
    		 checkList.get(i).click();
    	 }
       }*/
       
     // for check the item which are selected or which are not selected  
      /* for (int i = 0; i < checkList.size(); i++)
       {
    	   System.out.println(checkList.get(i).getAttribute("value")+ "  "+checkList.get(i).getAttribute("checked"));
       }*/
       for(int i=0; i<checkList.size(); i++)
       {
    	   System.out.println(i+" click on : " +checkList.get(i).getAttribute("value"));
    	   checkList.get(i).click();
    	   //status of three check boxes
    	   for(int j=0; j<checkList.size(); j++)
    	 {
    		   System.out.println(checkList.get(j).getAttribute("value")+ "-------"+checkList.get(j).getAttribute("checked")); 

       
    		   
    		   
    		   
    	 }
       
	}

}
}