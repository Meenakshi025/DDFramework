import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class TC_020 extends BaseClass {

	public static void main(String[] args) {
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();

			String IsMoved;
			
			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath("//*[@id=':3k']/div"));
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath("//*[@id=':3d']/div[1]/div"));   
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath("//*[@id=':lp']/div")); 
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath("//*[@id=':jz']/div/div[2]/span/a")); 
			Thread.sleep(3000);
			
			IsMoved = getText(By.xpath("//*[@id=':2']/div"));
			Thread.sleep(3000);
			
			driver.close();
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		   }
	}

}
