
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingXpath {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
		
		/*//writing X-path by based on Id property
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books");

	     //writing X-path based on Name
	     driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("books");
	     
	     //writing X-path based on class property.if it has multiple class names
	     // 1. based on index
	     driver.findElement(By.xpath("(//input[@class='nav-input'])[2]")).sendKeys("books");
	     // 2.based on multiple properties
	     driver.findElement(By.xpath("//input[@class='nav-input'][@tabindex='19']")).sendKeys("books");
*/	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
