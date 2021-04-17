package Google_TC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	static {
		System.setProperty("webdriver.chrome.driver",
			"D:\\Testing_LatestSoftware\\Chrome\\chromedriver.exe");
	}
	
	public static WebDriver driver = new ChromeDriver();
	public static int NoofUnreadEmail =0;
	public static int NoOfEmailCount =0;
	public static int NoOfReadEmail =0;
	public static boolean getIsElementPresenceByXPath(By by) {
		return driver.findElement(by).isDisplayed();
	}

	public static boolean getIsElementPresenceById(By by) {
		return driver.findElement(by).isDisplayed();
	}
	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getText(By by) {
		return driver.findElement(by).getText();
	}

	public static boolean IsElementPresent(By by) 
	{
		boolean IsDisplayed = driver.findElement(by).isDisplayed();
		if (IsDisplayed) 
		{
			driver.findElement(by).click();
		}
		return IsDisplayed;
	}

	public static void getAllLinks(By by)
	{
		WebElement element = driver.findElement(by);
		List<WebElement> links = element.findElements(By.tagName("a"));
		// System.out.println(" total number of links on webpage = "+links.size());
		for (WebElement link : links) 
		{
			System.out.println(link.getText());
		}
	}

	public static void logindetails(By by, String input, By btnby)
	{
		if (driver.findElement(by).isDisplayed()) 
		{
			driver.findElement(by).sendKeys(input);
			driver.findElement(btnby).click();
		}
	}
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
   public static void UserDetails(By by, String input){
		 if(driver.findElement(by).isDisplayed())
		 {
			 driver.findElement(by).sendKeys(input);
			driver.findElement(by).click();
		  }
		 }	

}
