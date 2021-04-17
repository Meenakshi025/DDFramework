import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//........TC__10.[To verify the total no. of emails received by the user]...............
//Author Name : Meenakshi Patil
//Date : 28/11/2016


public class TC_010 extends BaseClass {

	public static int NoOfEmailCount =0;
	
	public static void main(String[] args) 
	{
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();
					
			logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);
			
			logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
			
			
			int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
		    System.out.println("Total No of Inbox Email: " + TotalNoInboxEmail);
		
		    while(NoOfEmailCount < TotalNoInboxEmail)
		     {
			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			  Thread.sleep(1000);
		    }
		     System.out.println("No of Email: " + NoOfEmailCount);
		 driver.close();
  } 
catch (Exception e) 
{
	System.out.println(e.getMessage());
 }		
		
	}
}