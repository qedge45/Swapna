import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

    //To place the mouse on perticular Element 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();
       
       WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
       Actions mouse=new Actions(driver);
       mouse.moveToElement(signIn).build().perform();
      
       
       
       
       
       

	}

}
