import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahasra\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.naukri.com/");
       driver.manage().window().maximize();
       
       Set<String> window=driver.getWindowHandles();
      // Iterator<String> it=window.iterator();
       //while(it.hasNext())
    	   //Capturing all window id's
       {
    	   //System.out.println(it.next().toString());
    	   
    	   // For Capture window title and close it
    	   
    	   // first we need to give control to specific window
    	   //driver.switchTo().window(it.next().toString());
    	   
    	   //capture the title
    	   //System.out.println(driver.getTitle());
    	   
    	   //close
    	   //driver.close();
    	   
    	   
    	   //for closing all the windows accept  specific one (Amazon)
    	  /* if(driver.getTitle().equals("Amazon"));
    	   {
    		   driver.close();
    	   }*/
    	   
    	   
		//Closing the windows by using ArrayList (by index number)
    	   List<String> tabs=new ArrayList<String>(window);
    	   driver.switchTo().window(tabs.get(0));
    	   System.out.println(driver.getTitle());
    	   driver.close();
    	   
    	   List<String> tabs1=new ArrayList<String>(window);
    	   driver.switchTo().window(tabs1.get(1));
    	   System.out.println(driver.getTitle());
    	   driver.close();

    	   
       }
       

       
	}

}
