import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//..........TC_014.[To verify that "Compose" is working properly]........
public class TC_014 extends BaseClass {

	public static void main(String[] args) throws Exception {
		try{
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
		boolean IsComposeDialogDisplayed;
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':j3']/div/div"));
		
		IsComposeDialogDisplayed = IsElementPresent(By.className("aaZ"));

		if (IsComposeDialogDisplayed)
		{
			System.out.println("Compose dialog box is displayed once clicked on compose button");
		} 
		else
		{
			System.out.println("Compose dialog box is not displayed once clicked on compose button");
		}
		
		driver.close();
		 } 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		 }	
	}

}
