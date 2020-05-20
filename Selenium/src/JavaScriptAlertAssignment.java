
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptAlertAssignment {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();	
	     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	     driver.manage().window().maximize();
	       
	     //handling HTML alert
	     driver.findElement(By.xpath("//*[@id='iframeResult']/button/body/html/iframe")).click(); 
	       

	}

}
