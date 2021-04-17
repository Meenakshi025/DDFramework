import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_005 extends BaseClass {

//.........TC_005.[To verify that clicking on the language links (Hindi, Marathi etc) launches Google in respective language].....
//Author Name : Meenakshi Patil
//Date : 25/11/2016
	

	public static void main(String[] args) throws Exception {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();

		boolean HindiLang,IsClickedLangDisappear;
		
		String SignInBtn = "",SearchBtn = "",FeelingLuckyBtn = "",HindilinkText;
		
		 HindilinkText = driver.findElement(By.xpath(".//*[@id='_eEe']/a[1]")).getText();
		 System.out.println("hindi  = "+HindilinkText);
		 
		 HindiLang = IsElementPresent(By.xpath(".//*[@id='_eEe']/a[1]"));
		 Thread.sleep(3000);
		
		 SignInBtn = getText(By.xpath(".//*[@id='gb_70']"));
		 Thread.sleep(3000);
		
		  /*SearchBtn = getText(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));;
		  Thread.sleep(3000);
		  
		  FeelingLuckyBtn= getText(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[2]"));
		  System.out.println("Feeking lucky button text = "+FeelingLuckyBtn);
		  Thread.sleep(3000);*/
		
		  String ActualText = driver.findElement(By.xpath(".//*[@id='_eEe']/a[1]")).getText();
		  Thread.sleep(3000);
		  
		  System.out.println("Hindi Link Text = "+ActualText);
		
		  if (HindilinkText.equals(ActualText))
		     System.out.println("View link: Displayed");
		  else
		     System.out.println("View link: NotDisplayed");
		 
		driver.close();
	}
}

