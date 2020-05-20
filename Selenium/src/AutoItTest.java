

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItTest {

	public static void main(String[] args) throws Exception  
		
	{
		FirefoxDriver driver=new FirefoxDriver();
     driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
     driver.manage().window().maximize();
     
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
     driver.findElement(By.id("btnLogin")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("PIM")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("Add Employee")).click();
     Thread.sleep(3000);
     
     driver.findElement(By.id("firstName")).sendKeys("Practice");
     Thread.sleep(3000);
     driver.findElement(By.id("lastName")).sendKeys("Fileup");
     Thread.sleep(3000);
     driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
     Thread.sleep(3000);
     
     // to run AutoIT Program
     //Runtime.getRuntime().exec("C:\\Users\\Sahasra\\Desktop\\FileUp.exe");
      driver.findElement(By.id("btnSave")).click();
     
      //Validation
      if(driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).isDisplayed())
    {
    	 System.out.println("Employee created");
      }else
      {
    	  System.out.println("Employee notcreated");
      }
    	  
      
     
	}

}
