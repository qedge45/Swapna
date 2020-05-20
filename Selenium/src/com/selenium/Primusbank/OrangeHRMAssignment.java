package com.selenium.Primusbank;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMAssignment {
	// Global variable
	FirefoxDriver driver;
	String result;

	// application launch
	public String applaunch(String url) {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// Validation
		if (driver.findElement(By.id("txtUsername")).isDisplayed()) {
			// Variable is result
			// System.out.println("Application launch successfully");
			result = "pass";
		} else {
			// System.out.println("Application launch failed");
			result = "fail";
		}
		return result;
	}

	// for application Login
	public String applogin(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// validation
		if (driver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[5]/div"))
				.isDisplayed()) {
			// System.out.println("Application login successfully");
			result = "pass";
		} else {
			// System.out.println("Application login failed");
			result = "fail";
		}
		return result;
	}

	// employee creation
	public String Employeecreation(String FirstName, String LastName)
		{
		 
		 driver.findElement(By.linkText("PIM")).click();
		 driver.findElement(By.linkText("Add Employee")).click();
		 driver.findElement(By.id("firstName")).sendKeys(FirstName);
		 driver.findElement(By.id("lastName")).sendKeys(LastName);
		 driver.findElement(By.id("btnSave")).click();
		 
		 //validation
		 if (driver.findElement(By.id("empPic")).isDisplayed()) 
		    {
			result = "pass";
			} else 
		   			{
				result = "fail";
			}
			return result;
		}
	public String applogout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();

		// Validation
		if (driver.findElement(By.id("txtUsername")).isDisplayed()) {
			// System.out.println("Application launch successfully");
			result = "pass";
		} else {
			// System.out.println("Application launch failed");
			result = "fail";
		}
		return result;
	}

	public void appclose() {
		driver.close();
	}

	public static void main(String[] args) throws Exception {

		OrangeHRMAssignment app = new OrangeHRMAssignment();

		/*String result1 = app.applaunch("http://orangehrm.qedgetech.com");
		System.out.println(result1);

		Thread.sleep(3000);
		String result2 = app.applogin("Admin", "Qedge123!@#");
		System.out.println(result2);
		
		String result3 = app.Employeecreation("Selenium", "one");
		System.out.println(result3);

		Thread.sleep(3000);
		String result4 = app.applogout();
		System.out.println(result4);

		Thread.sleep(3000);
		app.appclose();
*/
		app.applaunch("http://orangehrm.qedgetech.com");
		app.applogin("Admin", "Qedge123!@#");
		app.Employeecreation("Selenium", "one");
		app.applogout();
		app.appclose();
		
		
		
	}

}
