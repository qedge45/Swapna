package com.selenium.Primusbank;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBankLibrary
{  
	//local variable or global variable
	FirefoxDriver driver; 
	String result;
	
    //It contains re usable methods (codes)
	//app launch
		public String applaunch(String url)
	{
		//for application launch
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();

		//Validation
				if(driver.findElement(By.id("txtuId")).isDisplayed())
				{
					//Variable is result
					//System.out.println("Application launch successfully");
					result="pass";					
				}else
				{
					//System.out.println("Application launch failed");
					result="fail";
				}
		return result;
	}
	
	 // for application Login
	public String applogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
	    driver.findElement(By.id("txtPword")).sendKeys(password);
	    driver.findElement(By.id("login")).click();
		
	    //validation
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			//System.out.println("Application login successfully");
			result="pass";					
		}else
		{
			//System.out.println("Application login failed");
			result="fail";
		}
          return result;
	}
	// new branch creation
	public String Newbranchcreation(String branchname, String add1) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("BtnNewBR")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txtbName")).sendKeys(branchname);
        driver.findElement(By.id("txtAdd1")).sendKeys(add1);
        driver.findElement(By.id("txtZip")).sendKeys("99999");
        Thread.sleep(2000);
        //Country Dropdown
        Thread.sleep(2000);
	     Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	     country.selectByIndex(1);
	     Thread.sleep(2000);
	     //State Dropdown
	     Select state=new Select(driver.findElement(By.id("lst_stateI")));
	     state.selectByIndex(1); 
	     Thread.sleep(2000);
	     //city Dropdown
	     Select city=new Select(driver.findElement(By.id("lst_cityI")));
	     city.selectByIndex(1);
	     
	     Thread.sleep(2000);
	     driver.findElement(By.id("btn_insert")).click();
	     Thread.sleep(2000);
	     Alert al=driver.switchTo().alert();
	     String msg=al.getText();
	     al.accept();
	     
	     //validation
	     if(msg.contains("created Sucessfully"))
	     {
	    	  result="pass";
	     }else if(msg.contains("already Exist"))
	     {
	    	 result="fail";
	     }else if(msg.contains("plese fill"))
	     {
	    	 result="warning";
	     }
	     Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	      Thread.sleep(2000);
         return result;
	}
	
	//new employee creation
	  public String NewEmployeecreation(String NewEmployee, String Password)
	  {
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();  
		driver.findElement(By.id("BtnNew")).click();  
		driver.findElement(By.id("txtUname")).sendKeys(NewEmployee); 
		driver.findElement(By.id("txtLpwd")).sendKeys(Password);
		
		Select role=new Select(driver.findElement(By.id("lst_Roles")));
		role.selectByIndex(1);
		
		Select branch=new Select(driver.findElement(By.id("lst_Branch")));
		branch.selectByIndex(1);
		
		driver.findElement(By.id("BtnSubmit")).click();
		
		Alert al=driver.switchTo().alert();
	     String msg=al.getText();
	     al.accept();
	   //validation
	     if(msg.contains("created Sucessfully"))
	     {
	    	  result="pass";
	     }else if(msg.contains("already Exist"))
	     {
	    	 result="fail";
	     }else if(msg.contains("plese fill"))
	     {
	    	 result="warning";
	     }
	     driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	     return result;
	  }
	 
	
	public String applogout() throws Exception 
	{
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	//Validation
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Application logout successfully");
			result="pass";					
		}else
		{
			//System.out.println("Application logout failed");
			result="fail";
		}
        return result;
	}
		
	   public void appclose()
	   {
		   driver.close();
	   }
			
	public static void main(String[] args) throws Exception 
	{
		//PrimusBankLibrary app=new PrimusBankLibrary();
		//calling a method with method name
		//app.appLaunch("http://primusbank.qedgetech.com/");
		//calling a method with variable
		/*String result1=app.applaunch("Http://primusbank.qedgetech.com");
		System.out.println(result1);
		
		String result2=app.applogin("Admin", "Admin");
		System.out.println(result2);
		
		String result3=app.Newbranchcreation("prbank1","Hyderabad1");
		System.out.println(result3);
		
		
		String result4=app.applogout();
		System.out.println(result4);
		
		app.appclose(); 
*/		
		
		//new branch creation
		
		/*app.applaunch("Http://primusbank.qedgetech.com");
		app.applogin("Admin", "Admin");
		app.Newbranchcreation("prbank1","Hyderabad1");
		app.applogout();
		app.appclose();
		*/
		
		//new employee creation
		/*app.applaunch("Http://primusbank.qedgetech.com");
		app.applogin("Admin", "Admin");
		app.NewEmployeecreation("Selenium1", "Password1");
		app.applogout();
		app.appclose();*/
		
		
	}
		
}
