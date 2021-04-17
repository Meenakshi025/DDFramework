import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

//..........TC_009.To verify that user is able to login to Gmail..........
//Author Name : Meenakshi Patil
//Date : 28/11/2016

public class TC_009 extends BaseClass{

	public static void main(String[] args) {
		try {
	    	
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();
			
			String LoginName = "";
					
			logindetails(By.xpath(".//*[@id='Email']"),"meenakshi.patil04@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);
			
			logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
			
			getAllLinks(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]"));
			
			IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
			
			LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = "+LoginName);
			
		driver.close();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
