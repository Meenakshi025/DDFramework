import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//........TC__16.[To verify the search operation i.e search the emails received from specific email address from INBOXr]...............
//Author Name : Meenakshi Patil
//Date : 09/11/2016
public class TC_016 extends BaseClass {

	public static void main(String[] args) {

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(5000);

			logindetails(By.id("gbqfq"), "linkedin notifications ",By.id("gbqfb"));
			Thread.sleep(3000);
			
			List<WebElement> element = driver.findElements(By.className("zF"));
            for (int i = 0; i < element.size(); i++) 
            {
            	 System.out.println(element.get(i).getText());
            }
            
			driver.close();
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
