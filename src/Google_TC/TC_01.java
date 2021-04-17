package Google_TC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_01 extends Base_Class {

	@Test(priority = 0)
	  public void GooglePageLaunchOne() {
		System.out.println("............To verify that the Google web page is launched successfully..........");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.google.co.in");
        
	 boolean IsSearchTextBoxPresence, IsSubmitbuttonPresence, IsImFeelingLuckyButtonPresence, IsSignInButtonPresence;		
	    
	    IsSearchTextBoxPresence = getIsElementPresenceById(By.id("lst-ib"));
	    IsSubmitbuttonPresence = getIsElementPresenceByXPath(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
	    IsImFeelingLuckyButtonPresence = getIsElementPresenceByXPath(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[2]"));
	    IsSignInButtonPresence =getIsElementPresenceById(By.id("gb_70"));	    
	   
	    System.out.println("Page title = " +driver.getTitle());
	    
	    if(IsSearchTextBoxPresence && IsSubmitbuttonPresence && IsImFeelingLuckyButtonPresence && IsSignInButtonPresence)
	    {
	    	System.out.println("Google web page is launched successfully");
	    }
	    else
	    {
	    	System.out.println("Google web page is fail to launched");
	    }
	}
	@Test(priority = 1)
	public void GoogleDialogBox() throws Exception{
		System.out.println("............To verify all the Google apps dialog box appers on the webpage..........");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		boolean IsGoogleAppPresence;
		
		IsGoogleAppPresence = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		Thread.sleep(3000);
		
		if (IsGoogleAppPresence)
		{
			System.out.println("Google Apps is displayed on the webpage sucessfully");
		} 
		else
		{
			System.out.println("Google Apps is not displayed on the webpage");
		}
		getAllLinks(By.xpath(".//*[@id='gbwa']/div[2]/ul[1]"));
		
	}
	@Test(priority = 2)
	public void VerifyGoogleAppsElement() throws Exception{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("http://www.google.co.in");
	    driver.manage().window().maximize();
	    System.out.println("............To verify that all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos) are launched properly]");
	    boolean IsMyAccountPresent,IsGoogleAppPresent,IsMyAcountTextPresent,IsGoogleMapPresent,IsMapsPresent,IsSearchTextBoxPresent,IsZoomSliderPresent,IsYoutubePresent,IsYoutubeSearchTxtPresent,isYoutubeLogoPresent,IsUploadBtnPresent,IsGooglePlayPresent,IsPlaySearchtxtPresent,IsPlayLogoPresent;
	    boolean IsNewsPresent,IsGmailPresent,IsSignInPresent,IsCreateAccountPresent,IsGmailLogoPresent,IsDrivePresent,IsMeetDrivePresent,IsUsingDrivePresent,IsGoogleDriveLogoPresent,IsDriveSymbolPresent,IsGoToGoogledriveBtnPresent,IsGooglePlusPresent,IsGooglePlusSearchPresent,IsGooglePlusLogoPresent,IsTranslatePresent,IsTranslateLogoPresent,IsTranslateBtnPresent,
	    IsGooglePhotosPresent,IsGooglePhotoLogoPresent,IsGoToGooglePhotosPresent;
	    String MyAccountText ="",NewsText="",GoToGoogleDriveBtnTxt = "";
	    
	    //.........................1.[To verify MyAccount webpage Element].................................
	    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	    Thread.sleep(3000);
	    
	    IsMyAccountPresent  = IsElementPresent(By.xpath(".//*[@id='gb192']"));
	    
	    System.out.println("My Account Page title = " +getTitle());
	    
	    MyAccountText = getText(By.xpath(".//*[@id='yDmH0d']/div[2]/c-wiz[2]/div/div/div[5]/div[1]/content/div/h1"));
	    System.out.println("My Account Page text = "+MyAccountText);
	    
	    if(driver.getPageSource().contains("My Account"))
	    {
	    System.out.println("Text is Present on the MyAccount webpage");
	    }
	    else
	    {
	    System.out.println("Text is not Present on the MyAccount webpage");
	    }
	    driver.navigate().back();

	    //.........................2.[To verify Maps webpage Element].................................
	    
	    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	    Thread.sleep(3000);
	    
	    IsMapsPresent = IsElementPresent(By.xpath(".//*[@id='gb8']"));
	    Thread.sleep(3000);
	    
	    System.out.println("Google Map Page title = " +getTitle());
	    
	    IsSearchTextBoxPresent = IsElementPresent(By.xpath(".//*[@id='searchbox']"));
	    
	    IsZoomSliderPresent = IsElementPresent(By.xpath(".//*[@id='content-container']/div[21]/div[1]/div[2]"));
	    
	    if (IsSearchTextBoxPresent && IsZoomSliderPresent ){
		    System.out.println("Element is present on the Maps webpage");
	     }
		else  {  
			System.out.println("Element is not present on the Maps page");
		}
          driver.navigate().back();
          
        //.........................3.[To verify youtube webpage Element].................................
          IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		      Thread.sleep(3000);
		      
		    IsYoutubePresent = IsElementPresent(By.xpath(".//*[@id='gb36']"));
		    Thread.sleep(3000);
	    
	    System.out.println("Youtube Page title = " +getTitle());
	    
	    IsUploadBtnPresent = IsElementPresent(By.xpath(".//*[@id='upload-btn']")); 
	    driver.navigate().back();
		  
	    IsYoutubeSearchTxtPresent = IsElementPresent(By.xpath(".//*[@id='masthead-search']"));
	    
	   isYoutubeLogoPresent = IsElementPresent(By.xpath(".//*[@id='yt-masthead']/div[1]")); 
	   Thread.sleep(3000);
	 
	   if (IsYoutubeSearchTxtPresent && IsUploadBtnPresent && isYoutubeLogoPresent)
	   {
		    System.out.println("Element is present on the Youtube webpage");
	   }else {   
			System.out.println("Element is not present on the Youtube page");
	   }
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(3000);
        
       //.........................4.[To verify "Google Play" webpage Element].................................
         
         IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		      Thread.sleep(3000);
		      
		     IsGooglePlayPresent = IsElementPresent(By.xpath(".//*[@id='gb78']"));
		    Thread.sleep(3000);
		    
		   System.out.println("Google Play Page title = " +getTitle());
		    Thread.sleep(3000);
		  
		   IsPlaySearchtxtPresent = IsElementPresent(By.xpath(".//*[@id='gbq2']"));
		   Thread.sleep(3000);
	    
		   IsPlayLogoPresent = IsElementPresent(By.xpath(".//*[@id='gbq2']"));
		   Thread.sleep(3000);
		   
		   if (IsPlaySearchtxtPresent && IsPlayLogoPresent)
	   {
	    System.out.println("Element is present on the Google Play webpage");
	   }else {   
		System.out.println("Element is not present on the Google Play page");
	   }
		 driver.navigate().back();
		 
		 //.........................5.[To verify "News" webpage Element].................................
		   
		  IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	  Thread.sleep(3000);
	  
	  IsNewsPresent = IsElementPresent(By.xpath(".//*[@id='gb5']"));     
	  
	  System.out.println("Google News Page title = " +getTitle());
	    Thread.sleep(3000);
	    
	    NewsText = getText(By.xpath(".//*[@id='app-name']"));
	    System.out.println("Google news Page text = "+NewsText);
	   
	    NewsText = getText(By.xpath(".//*[@id='anchorman-two-browse-nav']/li[1]/span"));
	    System.out.println("Google news Page text = "+NewsText);
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    
	  //.........................6.[To verify "Gmail" webpage Element].................................
	    
	    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		 Thread.sleep(3000);
		  
		 IsGmailPresent = IsElementPresent(By.xpath("//*[@id='gb23']"));
	    Thread.sleep(3000);
		 System.out.println("Gmail Page title = " +getTitle());
		 
		 
		 IsSignInPresent =IsElementPresent(By.xpath("html/body/nav/div/a[2]")); 
		 Thread.sleep(3000);
		 driver.navigate().back();
		 
		 IsGmailLogoPresent = IsElementPresent(By.xpath("html/body/nav/a/div")); 
		 
		 WebElement WE = driver.findElement(By.linkText("CREATE AN ACCOUNT"));
			Thread.sleep(2000);
			Actions action = new Actions(driver);
	
			  if (IsSignInPresent && IsGmailLogoPresent)
			   {
	   		    System.out.println("Element is present on the Gmail webpage");
			   }else 
			   {   
	   			System.out.println("Element is not present on the Gmail page");
			   }
			  driver.navigate().back();
			  
			  //.........................7.[To verify "Drive" webpage Element].................................
			  
			  IsGoogleAppPresent = IsElementPresent(By.xpath("//*[@id='gbwa']/div[1]/a"));
			  Thread.sleep(3000);  
			  
			IsDrivePresent = IsElementPresent(By.xpath("//*[@id='gb49']"));
			 System.out.println("Google Drive Page title = " +getTitle());
			 
			 IsMeetDrivePresent = IsElementPresent(By.xpath("/html/body/span/header/nav/ul/li[1]/a"));
			 Thread.sleep(3000);               
			 
			 IsUsingDrivePresent = IsElementPresent(By.xpath("/html/body/span/header/nav/ul/li[2]/a"));
			  driver.navigate().back();
			  
			 IsGoogleDriveLogoPresent = IsElementPresent(By.xpath("/html/body/span/header/div[1]/a/div"));
			 Thread.sleep(3000);  
			 
			 IsDriveSymbolPresent =  IsElementPresent(By.xpath("/html/body/section/div[2]/div/img"));
			 
			 IsGoToGoogledriveBtnPresent = IsElementPresent(By.xpath(" /html/body/section/div[2]/div/a")); 
			 Thread.sleep(3000);                                     
			  
			  if (IsMeetDrivePresent && IsUsingDrivePresent && IsGoogleDriveLogoPresent && IsDriveSymbolPresent && IsGoToGoogledriveBtnPresent)
			   {
	   		    System.out.println("Element is present on the GoogleDrive webpage");
			   }else {   
	   			System.out.println("Element is not present on the GoogleDrive page");
			   }
			  driver.navigate().to("http://www.google.co.in");
			  Thread.sleep(3000);
			  
			//.........................8.[To verify "Google+" webpage Element].................................
			  
			    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
				 Thread.sleep(3000);
				 
				 IsGooglePlusPresent = IsElementPresent(By.xpath(".//*[@id='gb119']"));
				 System.out.println("Google Plus Page title = " +getTitle());
				 
				 IsGooglePlusSearchPresent = IsElementPresent(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[4]/div[1]/c-wiz/div/div/div[1]/div[2]/div[2]"));
					                                                     
				 IsGooglePlusLogoPresent = IsElementPresent(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[4]/div[1]/c-wiz/div/div/div[1]/div[1]/a"));
				 
				 if (IsGooglePlusSearchPresent && IsGooglePlusLogoPresent)
				   {
		   		    System.out.println("Element is present on the GooglePlus webpage");
				   }else {   
		   			System.out.println("Element is not present on the GooglePlus page");
				   }
				  driver.navigate().back();
				//.........................8.[To verify "Translate" webpage Element].................................
				 
				  IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
					 Thread.sleep(3000);
					
					 IsTranslatePresent = IsElementPresent(By.xpath(" .//*[@id='gb51']"));
					 System.out.println("Google Translaters Page title = " +getTitle());
					 
					 IsTranslateLogoPresent = IsElementPresent(By.xpath(" .//*[@id='gt-appname']"));
					 Thread.sleep(3000);
					 
				     IsTranslateBtnPresent = IsElementPresent(By.xpath(" .//*[@id='gt-submit']"));
				     Thread.sleep(3000);
				     
				    if (IsTranslateLogoPresent && IsTranslateBtnPresent)
				   {
		   		    System.out.println("Element is present on the translate webpage");
				   }else {   
		   			System.out.println("Element is not present on the translate page");
				   }
				  driver.navigate().back();
				 
				//.........................8.[To verify "Photos" webpage Element].................................
					 
				  IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
					 Thread.sleep(3000);
					 
				 IsGooglePhotosPresent = IsElementPresent(By.xpath(".//*[@id='gb31']"));      
				 System.out.println("Google Photos Page title = " +getTitle());
				 Thread.sleep(3000);
				 
				 IsGooglePhotoLogoPresent =  IsElementPresent(By.xpath(" .//*[@id='js-header']/a/img")); 
				 Thread.sleep(3000);
				 
				 IsGoToGooglePhotosPresent = IsElementPresent(By.xpath(" .//*[@id='js-header-btn']")); 
				 
				  if (IsGooglePhotoLogoPresent && IsGoToGooglePhotosPresent)
				   {
		   		    System.out.println("Element is present on the GooglePhotos webpage");
				   }
				  else 
				   {   
		   			System.out.println("Element is not present on the GooglePhotos page");
				   }
				  driver.navigate().back();
				  
	             }
	@Test(priority = 3)
	public void GoogleAppsLoginAndLogout() throws Exception{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
        System.out.println("..........To verify that the user is able to Sign-in into all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos)]....................");
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
		
	}
	@Test(priority = 4)
	public void HindiLinkDisappear() throws Exception{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		System.out.println("............To verify that clicking on the language links (Hindi, Marathi etc) launches Google in respective language..........");
		
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
		  
	     }
	@Test(priority = 5)
	public void GoogleSearch(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("http://www.google.co.in");
	    driver.manage().window().maximize();
	    System.out.println("............To validate that the Google performs the search operation properly.........");
	    
	    boolean IsSearchPerformProprly,IsInputTaken,IsTextPresent;
	    
	    IsInputTaken = IsElementSearch(By.xpath(".//*[@id='sb_ifc0']"),"Amitabh Bachchan");
	    
	    IsSearchPerformProprly = Click(By.xpath(".//*[@id='_fZl']"));
	    
	    WebElement element = driver.findElement(By.xpath(".//*[@id='res']"));
		   List<WebElement> links =   element.findElements(By.tagName("h3"));			
		   System.out.println(" total number of links on webpage = "+links.size());	
		   for (WebElement link : links) 
		   {
			System.out.println(link.getText());
		  }
		  
	}
	@Test(priority = 6)
	public void GoogleProducts(){
		System.out.println("............To verify the Google apps/products on Google products webpage.........");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("https://www.google.co.in/intl/en/about/products/");
	    driver.manage().window().maximize();
	    getAllLinks(By.xpath("html/body/div[3]"));
	}
	@Test(priority = 7)
	public void LoginToGmail() throws Exception{
		System.out.println("............To verify that user is able to login to Gmail.........");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
		String LoginName = "";
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenakshi.patil04@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		
		getAllLinks(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]"));
		
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		LoginName = getText(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]"));
		System.out.println("Login Persons Name = "+LoginName);
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 8)
	public void EmailCount() throws Exception{
		System.out.println("............To verify the total no. of emails received by the user.........");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		
		
		int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
	    System.out.println("Total No of Inbox Email: " + TotalNoInboxEmail);
	
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
		  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
		  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
		  driver.findElement(By.xpath("//*[@id=':j0']")).click();
		  Thread.sleep(1000);
	    }
	     System.out.println("No of Email: " + NoOfEmailCount);
	     
	     IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));

			IsElementPresent(By.xpath(".//*[@id='gb_71']"));
			Thread.sleep(5000);
	}
	
	@Test(priority = 9)
	public void UnreadEmailCount() throws Exception{
		System.out.println("...........To verify and count unread emails in an INBOX............");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
				
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':jb']/div/div[1]"));
		Thread.sleep(3000);
		
		int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
		Thread.sleep(3000);
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
	    	List<WebElement> element = driver.findElements(By.className("zF"));
	    	NoofUnreadEmail = (NoofUnreadEmail+element.size()/2);
	  
			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			 
		    }
	    System.out.println("Total unread email in Inbox: " + NoOfEmailCount);
	    System.out.println("Total unread email in Inbox: " + NoofUnreadEmail);
	    Thread.sleep(3000);
	    IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void ReadmailCount() throws Exception{
		System.out.println("...........To verify and count read emails in an INBOX............");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
		logindetails(By.xpath(".//*[@id='Email']"),"meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);
		
		logindetails(By.xpath(".//*[@id='Passwd']"),"Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':jb']/div/div[1]"));
		Thread.sleep(3000);
		
		int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
		Thread.sleep(3000);
	    System.out.println(TotalNoInboxEmail);
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
	    	List<WebElement> element = driver.findElements(By.className("yP"));
	    	 System.out.println(element.size()/2);
	    	 NoOfReadEmail = NoOfReadEmail+(element.size()/2);

			  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
			  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
			  driver.findElement(By.xpath("//*[@id=':j0']")).click();
			  Thread.sleep(1000);
		    }
	    System.out.println("Total No of Read email in Inbox: " + NoOfReadEmail);
	    Thread.sleep(3000);
	    IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 11)
	public void ComposeMail() throws Exception{
		System.out.println("...........To verify that Compose is working properly............");
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
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 12)
	public void MailSend() throws Exception{
		System.out.println("...........To verify that email is Send properly to email address in To cc & bcc............");
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
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 13)
	public void SearchEmailsFromInbox() throws Exception{
		System.out.println("..........To verify the search operation i.e search the emails received from specific email address from INBOX............");
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
        IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	public static int NoofEmailWithAttachment =0;
	@Test(priority = 14)
	public void EmailsWithAttachment() throws Exception{
		System.out.println("..........To verify the emails which are with attachments in INBOX............");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();

		logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);

		logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(5000);
      
		int TotalNoInboxEmail = Integer.parseInt(driver.findElement(By.xpath("//*[@id=':ix']/span/span[3]")).getText());
	    
	
	    while(NoOfEmailCount < TotalNoInboxEmail)
	     {
	    	Thread.sleep(3000);
	    	List<WebElement> element = driver.findElements(By.className("yE"));
			NoofEmailWithAttachment = NoofEmailWithAttachment+element.size();
			Thread.sleep(3000);
		  List<WebElement> checkBoxes = driver.findElements(By.className("T-Jo-auh"));
		  NoOfEmailCount =  NoOfEmailCount + (checkBoxes.size()-1);
		  driver.findElement(By.xpath("//*[@id=':j0']")).click();
		  Thread.sleep(1000);
	    }
	    
	    System.out.println("Total Email with attachment: " + NoofEmailWithAttachment);
	    
	    IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 15)
	public void SettingPageDisplayed() throws Exception{
		System.out.println(".........To verify that Settings page is displayed properly............");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();

		String IsSettingDisplayed;
		
		logindetails(By.xpath(".//*[@id='Email']"), "meenifsss@gmail.com",By.xpath(".//*[@id='next']"));
		Thread.sleep(3000);

		logindetails(By.xpath(".//*[@id='Passwd']"), "Meenu@676",By.xpath(".//*[@id='signIn']"));
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath("//*[@id=':2n']/div[1]"));  
		Thread.sleep(3000);
		
		IsElementPresent(By.xpath(".//*[@id='ms']/div"));
		Thread.sleep(3000);
		
		IsSettingDisplayed = getText(By.className("dt")); 
		System.out.println("page element = "+IsSettingDisplayed);
		
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
		
	}
	@Test(priority = 16)
	public void CreateNewLabel() throws Exception{
		System.out.println("............To verify that the new label is properly created..........");
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
		
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 17)
	public void MailMoveToCreatedLabel() throws Exception{
		System.out.println("............To verify that emails are moved from source label to target label (Folders)..........");
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
		IsElementPresent(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		
		IsElementPresent(By.xpath(".//*[@id='gb_71']"));
		Thread.sleep(3000);
	}
	@Test(priority = 18)
	public void GmailSignInSignOut() throws Exception{
		System.out.println("............To verify that the user can successfully Sign-out from Gmail..........");
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
	}
	@Test(priority = 19)
	public void OpenAndCloseBrowser(){
		System.out.println("............To open and close the browser..........");
        driver.get("https://www.google.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.quit();
		
	}

	@AfterSuite
    public void tearDown() throws Exception { 
    driver.quit();
	}
}
