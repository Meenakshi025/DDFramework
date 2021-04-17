import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//............ To verify and count the read emails in an INBOX..............
//Name : Meenakshi Patil
//Date : 10/12/2016

public class TC_013 extends BaseClass{
	public static int NoOfEmailCount =0;
	public static int NoOfReadEmail=0;
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
	    System.out.println(TotalNoInboxEmail);
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
	    	List<WebElement> element = driver.findElements(By.className("yP"));
	    	 System.out.println(element.size()/2);
	    	NoOfReadEmail = NoOfReadEmail+(element.size()/2);

			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			  Thread.sleep(1000);
		    }
	    System.out.println("Total No of Read email in Inbox: " + NoOfReadEmail);
	    driver.close();
		 } 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		 }	
	}

}
