import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://ksrtc.in/");
       driver.manage().window().maximize();
     java.util.List<WebElement> links = driver.findElements(By.tagName("p"));
     System.out.println(links.size());
     for (int i=0;i<links.size();i++)
     {
    	 //System.out.println(links.get(i).getText());
    	 //capture links which have text property/value
    	 if(!links.get(i).getText().isEmpty())
    	 {System.out.println(links.get(i).getText());}
    		 
     }

	}


}


