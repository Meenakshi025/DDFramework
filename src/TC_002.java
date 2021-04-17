import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//............................TC_002.[To verify all the Google apps dialog box appers on the webpage] ............................
//Author Name : Meenakshi Patil
//Date : 21/11/2016

public class TC_002 extends BaseClass
{	
	public static void main(String[] args) throws Exception {
		    try {
		    	
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://www.google.co.in");
			driver.manage().window().maximize();
			
			boolean IsGoogleAppPresence,IsDialogBoxPresence;
			
    		IsGoogleAppPresence = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);
			
			if (IsGoogleAppPresence)
			{
				System.out.println("Google Apps is displayed on the webpage sucessfully");
			} 
			else
			{
				System.out.println("Google Apps is not displayed on the webpage");
			}
			getAllLinks(By.xpath(".//*[@id='gbwa']/div[2]/ul[1]"));
		  
			driver.close();
			
		} 
		    catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
