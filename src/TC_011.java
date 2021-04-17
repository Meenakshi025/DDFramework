import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//........TC__11.[To verify the total no. of emails marked with STAR]...............
//Author Name : Meenakshi Patil
//Date : 28/11/2016

public class TC_011 extends BaseClass {

	public static void main(String[] args) {
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();
			boolean IsUnStarredEmailPresent = false;
					
			logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);
			
			logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);
			
			 driver.findElement(By.xpath("//*[@id=':jc']/div/div[1]")).click();
			Thread.sleep(5000);
			
			WebElement Flag_Star = driver.findElement(By.xpath("//*[@id=':2']/div/div[2]"));
			List<WebElement> EmailRow = Flag_Star.findElements(By.tagName("tr"));
            System.out.println("Starred mail count = "+EmailRow.size());
			
			driver.close();
  } 
catch (Exception e) 
{
	System.out.println(e.getMessage());
 }		
		
	}

}
