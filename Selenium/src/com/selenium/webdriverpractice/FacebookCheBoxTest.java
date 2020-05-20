package com.selenium.webdriverpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCheBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("http://facebook.com");
       driver.manage().window().maximize();
        
       //for Female check box 
      driver.findElement(By.id("u_0_6")).click();
       System.out.println(driver.findElement(By.id("u_0_6")).getAttribute("value"));
       
       // For Male check box
      /* driver.findElement(By.id("u_0_7")).click();
       System.out.println(driver.findElement(By.id("u_0_7")).getAttribute("value")); */       
       
       //for Custom check box
      /* driver.findElement(By.id("u_0_8")).click();
       System.out.println(driver.findElement(By.id("u_0_8")).getAttribute("value"));*/
     
     //Validation
       if(driver.findElement(By.id("u_0_6")).isSelected()) 
       {
    	   driver.findElement(By.id("u_0_6")).click(); 
    	   System.out.println(driver.findElement(By.id("u_0_6")).getAttribute("value"));
       }
       
       
       
       
	}

}
