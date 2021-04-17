import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//..........TC_012.[To verify and count unread emails in an INBOX].........
//Author Name : Meenakshi Patil
//Date :
public class TC_012 extends BaseClass {
	public static int NoOfEmailCount =0;
	public static int NoofUnreadEmail=0; 
	public static void main(String[] args) throws Exception {
		try{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':jb']/div/div[1]"));
		Thread.sleep(3000);
		
		int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
	   
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
	    	//List<WebElement> element = driver.findElements(By.className("zF"));
	    	//NoofUnreadEmail = (NoofUnreadEmail+element.size()/2);

			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  
			  List<WebElement> element = driver.findElements(By.className("zF"));
		    	NoofUnreadEmail = (NoofUnreadEmail+element.size()/2);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			  Thread.sleep(1000);
		    }

	    System.out.println("Total unread email in Inbox: " + NoofUnreadEmail);
		driver.close();
	 } 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	 }	
	}
}
