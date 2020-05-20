import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusJavaScriptAlertAssingment {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
	       driver.get("http://primusbank.qedgetech.com/");
	       driver.manage().window().maximize();
	       
	     driver.findElement(By.id("txtuId")).sendKeys("Admin");
	     driver.findElement(By.id("txtPword")).sendKeys("Admin");
	     driver.findElement(By.id("login")).click();
	     
	     driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	     driver.findElement(By.id("BtnNewBR")).click();
	     driver.findElement(By.id("txtbName")).sendKeys("PrimasBank2");
	     driver.findElement(By.id("txtAdd1")).sendKeys("Hyderabad1");
	     driver.findElement(By.id("Txtadd2")).sendKeys("Hyderabad2");     
	     driver.findElement(By.id("txtadd3")).sendKeys("Hyderabad3");
	     driver.findElement(By.id("txtArea")).sendKeys("Miyapur");
	     driver.findElement(By.id("txtZip")).sendKeys("99999");
	     //Country Dropdown
	     Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	     country.selectByVisibleText("INDIA");
	     //State Dropdown
	     Select state=new Select(driver.findElement(By.id("lst_stateI")));
	     state.selectByVisibleText("Andhra Pradesh"); 
	     //city Dropdown
	     Select city=new Select(driver.findElement(By.id("lst_cityI")));
	     city.selectByVisibleText("Hyderabad"); 
	     
	     driver.findElement(By.id("btn_insert")).click();
	     
	     Thread.sleep(2000);//To give time to see the operation
	     
	     Alert al=driver.switchTo().alert();
	     //To capture the alert on the console
	       System.out.println(al.getText());
	       
	     // for click on ok button
	       al.accept();


	}

}
