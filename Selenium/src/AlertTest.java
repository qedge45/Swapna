import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		/*FirefoxDriver driver=new FirefoxDriver();
	       driver.get("https://www.hdfcbank.com/");
	       driver.manage().window().maximize();*/
	       
	       //handling HTML alerts/popups
	      // driver.findElement(By.xpath("//*[@id='parentdiv']/img")).click();
		
		
	       //handling Java script alerts   
	       FirefoxDriver driver=new FirefoxDriver();
	       driver.get("http://primusbank.qedgetech.com/");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("login")).click();
	       
	       
	       Thread.sleep(2000);//To give time to see the operation
	       Alert al=driver.switchTo().alert();
	       
	       //To capture the alert on the console
	       System.out.println(al.getText());
	       
	       al.accept();// for click on ok button
	       
	       
	       
	       

	}

}
