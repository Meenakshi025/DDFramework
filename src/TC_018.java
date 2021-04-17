import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_018 extends BaseClass{

	public static void main(String[] args) {
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();

			String IsSettingDisplayed;
			
			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath(".//*[@id=':2o']"));
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath(".//*[@id='ms']/div"));
			Thread.sleep(3000);
			
			IsSettingDisplayed = getText(By.className("dt")); 
			System.out.println("page element = "+IsSettingDisplayed);
			
			driver.close();
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		   }

	}

}
