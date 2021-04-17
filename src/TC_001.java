import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

//..........TC_001.[To verify that the Google web page is launched successfully].......
//Author Name : Meenakshi Patil
//Date : 14/11.2016

public class TC_001 extends BaseClass{	

	public static  boolean getIsElementPresenceByXPath(By by)
	{
		 return driver.findElement(by).isDisplayed();
	}
	
	public static  boolean getIsElementPresenceById(String by)
	{
		 return driver.findElement(By.id(by)).isDisplayed();
	}
	
	public static void main(String[] args) throws Exception {
		try {					
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.get("http://www.google.co.in");
		    driver.manage().window().maximize();
		    boolean IsSearchTextBoxPresence, IsSubmitbuttonPresence, IsImFeelingLuckyButtonPresence, IsSignInButtonPresence;		
		    
		    IsSearchTextBoxPresence = getIsElementPresenceById("lst-ib");
		    IsSubmitbuttonPresence = getIsElementPresenceByXPath(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		    IsImFeelingLuckyButtonPresence = getIsElementPresenceByXPath(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[2]"));
		    IsSignInButtonPresence = getIsElementPresenceById("gb_70");	    
		   
		    System.out.println("Page title = " +getTitle());	
		    
		    if(IsSearchTextBoxPresence && IsSubmitbuttonPresence && IsImFeelingLuckyButtonPresence && IsSignInButtonPresence)
		    {
		    	System.out.println("Google web page is launched successfully");
		    }
		    else
		    {
		    	System.out.println("Google web page is fail to launched");
		    }
		    driver.close();
		    
		    } catch (Exception e) 
		    {
			System.out.println(e.getMessage());
		   }
	}

}
