import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class TC_019 extends BaseClass{

	public static void main(String[] args) {
		
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://mail.google.com");
			driver.manage().window().maximize();

			String Newlable;
			
			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);
			
			IsElementPresent(By.className("CJ"));
			Thread.sleep(3000);
			
			IsElementPresent(By.className("CK"));
			Thread.sleep(3000);
			
			IsElementPresent(By.className("alZ"));
			
			logindetails(By.className("xx"), "Testing_3",By.xpath("/html/body/div[18]/div[3]/button[1]"));
			Thread.sleep(3000);
			driver.navigate().back();
			
			if(driver.getPageSource().contains("Testing_3")){
				System.out.println("New lable created");
			}else{
				System.out.println("New lable not created");
			}
			//driver.close();
		   } catch (Exception e) {
			System.out.println(e.getMessage());
		   }
	}

}
