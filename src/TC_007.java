import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import com.sun.corba.se.spi.orbutil.fsm.Action;

//........TC_007.[To validate that the Google performs the search operation properly].......
//Author Name : Meenakshi Patil
//Date : 27/11/2016

public class TC_007 extends BaseClass {

	public static boolean IsElementSearch(By by,String name){		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(by));
	    actions.sendKeys(name);
	    actions.click().build().perform();
	    return true;
	}
   public static boolean Click(By by){
	    if(driver.findElement(by).isDisplayed())
	    {
	    	   driver.findElement(by).click();
	    }
	  	return driver.findElement(by).isDisplayed();
	}
   
	public static void main(String[] args) {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("http://www.google.co.in");
	    driver.manage().window().maximize();
	    
	    boolean IsSearchPerformProprly,IsInputTaken,IsTextPresent;
	    
	    IsInputTaken = IsElementSearch(By.xpath(".//*[@id='sb_ifc0']"),"Amitabh Bachchan");
	    
	    IsSearchPerformProprly = Click(By.xpath(".//*[@id='_fZl']"));
	    
	    WebElement element = driver.findElement(By.xpath(".//*[@id='res']"));
		   List<WebElement> links =   element.findElements(By.tagName("h3"));			
		   System.out.println(" total number of links on webpage = "+links.size());	
		   for (WebElement link : links) 
		   {
			System.out.println(link.getText());
		  }
	    
	    driver.close();
	    
	}    
}
	
	
