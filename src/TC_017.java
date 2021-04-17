import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//........TC__16.[To verify the emails which are with attachments in INBOX]...............
//Author Name : Meenakshi Patil
//Date : 09/11/2016

public class TC_017 extends BaseClass{
	public static int NoofEmailWithAttachment=0; 
	public static int NoOfEmailCount =0;
	public static void main(String[] args) {
		
		try {
		
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(5000);
          
			int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
		    
		
		    while(NoOfEmailCount < TotalNoInboxEmail)
		     {
		    	List<WebElement> element = driver.findElements(By.className("yE"));
				NoofEmailWithAttachment = NoofEmailWithAttachment+element.size();

			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			  Thread.sleep(1000);
		    }
		    
		    System.out.println("Total Email with attachment: " + NoofEmailWithAttachment);
		
			driver.close();
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		   }
	 }
}
