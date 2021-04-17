import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_015 extends BaseClass {

	 public static void UserDetails(By by, String input){
  		 if(driver.findElement(by).isDisplayed())
  		 {
  			 driver.findElement(by).sendKeys(input);
  			driver.findElement(by).click();
  		  }
  		 }	
  		 
	public static void main(String[] args) throws Exception {
		try{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
		boolean IsComposeButtonDisplayed,IsToPresent,IsCCPresent,IsBCCPresent;
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':j3']/div/div")); 
		
		UserDetails(By.className("vO"),"meenakshi.patil04@gmail.com");
		Thread.sleep(3000);
		
		UserDetails(By.className("aoT"),"Test Mail");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.className("LW-avf"));
		element.sendKeys("This is test mail");
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//div[contains(text(),'Send')]"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':jf']/div"));
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("Test Mail")){
			System.out.println("Email exist in sent mail");
		}else{
			System.out.println("Email not exist in sent mail");
		}
	driver.close();
	 } 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	 }	
	}

}
