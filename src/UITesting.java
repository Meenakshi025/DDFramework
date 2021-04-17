import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UITesting{
	public static WebDriver driver;
	public static boolean IsElementPresent(By by) 
	{
		boolean IsDisplayed = driver.findElement(by).isDisplayed();
		if (IsDisplayed) 
		{
			driver.findElement(by).click();
		}
		return IsDisplayed;
	}
	
	  public static void main(String[] args) throws Exception {

	    	WebDriver driver = new FirefoxDriver();
	        
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.messenger.com/login");
			driver.manage().window().maximize();
		
			boolean Chat_Person,Msg_Send_Button;
			
            driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("meenifsss@gmail.com");
			
		    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Meenu@676");
		    
		    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		    
		     Chat_Person = IsElementPresent(By.xpath(".//*[@id='row_header_id_user:100002683008403']/a/div[2]/div[1]/span"));
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='cch_f322afada9c9c1']/div[2]/div[2]/div[2]/div[1]/div/div")).sendKeys("Hi Shital"+"\n"+"This is a test message");
			Thread.sleep(2000);
			
			 Msg_Send_Button = IsElementPresent(By.xpath(".//*[@id='js_332']/em"));
		    
		    if (Chat_Person && Msg_Send_Button){
		    	System.out.println("Message has been sent to respective person");
		    }else{
		    	System.out.println("Message has not been sent to respective person");
		    }
			
		driver.quit();
		
		   } 
	        
	}

