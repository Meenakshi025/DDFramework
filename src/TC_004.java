import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//.........TC_004.[To verify that the user is able to Sign-in into all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos)].....
//Author Name : Meenakshi Patil
//Date : 09/12/2016
	
public class TC_004 extends BaseClass {

	public static void main(String[] args) {
		try {

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://www.google.co.in");
			driver.manage().window().maximize();

		     String MyAccountText = "",LoginName = "";
			// .........................1.[To verify MyAccount webpage should login with login details].................................
			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb192']"));
			System.out.println("Page title = " + getTitle());

			IsElementPresent(By.xpath("//*[@id='gb_70']"));

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
			Thread.sleep(3000);

			LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);
			Thread.sleep(3000);

			IsElementPresent(By.xpath("//*[@id='gb_71']"));
			Thread.sleep(3000);

			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);
			// .........................2.[To verify Maps webpage Element].................................

			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb8']"));
			Thread.sleep(3000);
			System.out.println("Page title = " + getTitle());

			IsElementPresent(By.xpath(".//*[@id='gb_70']"));

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div/div/div[2]/div[4]/div[1]/a/span"));
			Thread.sleep(3000);

			LoginName = getText(By.xpath(".//*[@id='gb']/div/div/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			Thread.sleep(3000);
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));

			driver.navigate().to("http://www.google.com");

			
			 //.........................3.[To verify youtube webpage Element]................................. 
			 IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			 Thread.sleep(3000);
			 
			 IsElementPresent(By.xpath(".//*[@id='gb36']"));
			 Thread.sleep(3000); 
			 System.out.println("Page title = "+getTitle());
			 
			 IsElementPresent(By.xpath("//*[@id='yt-masthead-signin']/div/button"));
			 Thread.sleep(3000);
			 
			 logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']")); Thread.sleep(3000);
			  
			 logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']")); Thread.sleep(3000);
			
			 IsElementPresent(By.xpath("//*[@id='yt-masthead-account-picker']/button/span/span/span/span/img"));
			 Thread.sleep(3000);
			    
			    if(driver.getPageSource().contains("Meenifsss@gmail.com"))
			    {
			    System.out.println("Text is Present on the youtube webpage");
			    }
			    else
			    {
			    System.out.println("Text is not Present on the youtube webpage");
			    }
			 
			 IsElementPresent(By.partialLinkText("Sign out"));
			 Thread.sleep(7000);
			 
			 driver.navigate().to("http://www.google.com");
			 Thread.sleep(3000);
			 
			// .........................4.[To verify "Google Play" webpage Element].................................

			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb78']"));
			System.out.println("Page title = " + getTitle());
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath(".//*[@id='gb_70']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));

			LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));

			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);

			// .........................5.[To verify "News" webpage Element].................................

			   IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
				Thread.sleep(3000);

				IsElementPresent(By.xpath(".//*[@id='gb5']"));
				System.out.println("Page title = " + getTitle());
				Thread.sleep(4000);

				IsElementPresent(By.xpath("//*[@id='gb_70']"));
				Thread.sleep(3000);

				logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
				Thread.sleep(3000);

				logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
				Thread.sleep(4000);

				IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
				Thread.sleep(3000);

				LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
				System.out.println("Login Persons Name = " + LoginName);

				IsElementPresent(By.xpath(".//*[@id='gb_71']"));
				Thread.sleep(3000);
				
				driver.navigate().to("http://www.google.com");
				Thread.sleep(3000);
			// .........................6.[To verify "Gmail" webpage Element].................................

			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath("//*[@id='gb23']"));
			Thread.sleep(3000);
			System.out.println("Page title = " + getTitle());

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
			Thread.sleep(3000);

			LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));
			Thread.sleep(3000);
			
			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);

			// .........................7.[To verify "Drive" webpage Element].................................

			IsElementPresent(By.xpath("//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath("//*[@id='gb49']"));
			System.out.println("Page title = " + getTitle());

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div[2]/div[4]/div/div[3]/div/a"));
			Thread.sleep(3000);
			
			LoginName = getText(By.xpath(".//*[@id='gb']/div[2]/div[7]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));
			Thread.sleep(3000);
			
			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);

			// .........................8.[To verify "Google+" webpage Element].................................

			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb119']"));
			System.out.println("Page title = " + getTitle());

			IsElementPresent(By.xpath("	 .//*[@id='gb_70']"));

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div/div/div/div[4]/div[1]/a/span"));
			Thread.sleep(3000);
			
			LoginName = getText(By.xpath(".//*[@id='gb']/div/div/div/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));
			Thread.sleep(3000);
			
			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);

			// .........................9.[To verify "Translate" webpage Element]..................
			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(" .//*[@id='gb51']"));
			System.out.println("Page title = " + getTitle());

			IsElementPresent(By.xpath(".//*[@id='gb_70']"));

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
			Thread.sleep(3000);
			
			LoginName = getText(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));
			Thread.sleep(3000);
			
			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);

			// .........................10.[To verify "Photos" webpage Element].................................

			IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb31']"));
			System.out.println("Page title = " + getTitle());
			Thread.sleep(3000);
			IsElementPresent(By.xpath("//*[@id='js-hero-btn']"));

			logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
			Thread.sleep(3000);

			logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
			Thread.sleep(3000);

			IsElementPresent(By.xpath(".//*[@id='gb']/div/div/div/div[4]/div[1]/a/span"));
			Thread.sleep(3000);
			
			LoginName = getText(By.xpath(".//*[@id='gb']/div/div/div/div[4]/div[2]/div[1]/div/div[1]"));
			System.out.println("Login Persons Name = " + LoginName);
			Thread.sleep(3000);
			
			IsElementPresent(By.xpath(".//*[@id='gb_71']"));

			driver.navigate().to("http://www.google.com");
		
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
