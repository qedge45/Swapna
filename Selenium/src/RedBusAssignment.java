import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusAssignment {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://www.redbus.in/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//*[@id='src']")).sendKeys("H");
	     
	     Thread.sleep(3000);
	     java.util.List<WebElement> list=driver.findElements(By.xpath("//*[@id='search']/div/div/div/ul/li"));   
	     System.out.println(list.size());
	     for (int i=0; i < list.size(); i++)
	     {
	    	 System.out.println(list.get(i).getText());   	 
	     }
	     
	     
	}

}
