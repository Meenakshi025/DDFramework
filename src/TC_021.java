import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class TC_021 extends BaseClass {

	public static void main(String[] args) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();
			
			String GmailPageTitle;
		
		logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);

		logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		System.out.println("Page title = " +getTitle());

		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		Thread.sleep(3000);

		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
		
		System.out.println("Page title = " +getTitle());
		
		driver.close();
		
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		   }
	}

}
