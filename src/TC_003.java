import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//.....................TC_003.[To verify that all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos) are launched properly]...............
//Author Name : Meenakshi Patil
//Date : 22/11/2016

public class TC_003 extends BaseClass 
{
	public static void main(String[] args) throws Exception {
		
		try {		
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.get("http://www.google.co.in");
		    driver.manage().window().maximize();
		 
		    boolean IsMyAccountPresent,IsGoogleAppPresent,IsMyAcountTextPresent,IsGoogleMapPresent,IsMapsPresent,IsSearchTextBoxPresent,IsZoomSliderPresent,IsYoutubePresent,IsYoutubeSearchTxtPresent,isYoutubeLogoPresent,IsUploadBtnPresent,IsGooglePlayPresent,IsPlaySearchtxtPresent,IsPlayLogoPresent;
		    boolean IsNewsPresent,IsGmailPresent,IsSignInPresent,IsCreateAccountPresent,IsGmailLogoPresent,IsDrivePresent,IsMeetDrivePresent,IsUsingDrivePresent,IsGoogleDriveLogoPresent,IsDriveSymbolPresent,IsGoToGoogledriveBtnPresent,IsGooglePlusPresent,IsGooglePlusSearchPresent,IsGooglePlusLogoPresent,IsTranslatePresent,IsTranslateLogoPresent,IsTranslateBtnPresent,
		    IsGooglePhotosPresent,IsGooglePhotoLogoPresent,IsGoToGooglePhotosPresent;
		    String MyAccountText ="",NewsText="",GoToGoogleDriveBtnTxt = "";
		    
		    //.........................1.[To verify MyAccount webpage Element].................................
		    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		    Thread.sleep(3000);
		    
		    IsMyAccountPresent  = IsElementPresent(By.xpath(".//*[@id='gb192']"));
		    
		    System.out.println("Page title = " +getTitle());
		    
		    MyAccountText = getText(By.xpath(".//*[@id='yDmH0d']/div[2]/c-wiz[2]/div/div/div[5]/div[1]/content/div/h1"));
		    System.out.println("Page text = "+MyAccountText);
		    
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
		    
		    System.out.println("Page title = " +getTitle());
		    
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
		    
		    System.out.println("Page title = " +getTitle());
		    
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
 		    
 		   System.out.println("Page title = " +getTitle());
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
		  
		  System.out.println("Page title = " +getTitle());
		    Thread.sleep(3000);
		    
		    NewsText = getText(By.xpath(".//*[@id='app-name']"));
		    System.out.println("Page text = "+NewsText);
		   
		    NewsText = getText(By.xpath(".//*[@id='anchorman-two-browse-nav']/li[1]/span"));
		    System.out.println("Page text = "+NewsText);
		    Thread.sleep(3000);
		    
		    driver.navigate().back();
		    
		  //.........................6.[To verify "Gmail" webpage Element].................................
		    
		    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			 Thread.sleep(3000);
			  
			 IsGmailPresent = IsElementPresent(By.xpath("//*[@id='gb23']"));
		    Thread.sleep(3000);
			 System.out.println("Page title = " +getTitle());
			 
			 
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
				 System.out.println("Page title = " +getTitle());
				 
				 
				 IsMeetDrivePresent = IsElementPresent(By.xpath("/html/body/header/nav/ul/li[1]/a"));
				 Thread.sleep(3000); 
				 
				 IsUsingDrivePresent = IsElementPresent(By.xpath("/html/body/header/nav/ul/li[2]/a"));
				  driver.navigate().back();
				  
				 IsGoogleDriveLogoPresent = IsElementPresent(By.xpath("html/body/header/div[1]/span/a/div/span"));
				 Thread.sleep(3000); 
				 
				 IsDriveSymbolPresent =  IsElementPresent(By.xpath("/html/body/section/div[2]/div/img"));
				 
				 IsGoToGoogledriveBtnPresent = IsElementPresent(By.xpath("/html/body/header/nav/ul/li[6]/a")); 
				 Thread.sleep(3000);
				  
				  if (IsMeetDrivePresent && IsUsingDrivePresent && IsGoogleDriveLogoPresent && IsDriveSymbolPresent&&IsGoToGoogledriveBtnPresent)
				   {
		   		    System.out.println("Element is present on the GoogleDrive webpage");
				   }else {   
		   			System.out.println("Element is not present on the GoogleDrive page");
				   }
				  driver.navigate().back();
				  Thread.sleep(3000);
				  
				//.........................8.[To verify "Google+" webpage Element].................................
				  
				    IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
					 Thread.sleep(3000);
					 
					 IsGooglePlusPresent = IsElementPresent(By.xpath(".//*[@id='gb119']"));
					 System.out.println("Page title = " +getTitle());
					 
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
						 System.out.println("Page title = " +getTitle());
						 
						 IsTranslateLogoPresent = IsElementPresent(By.xpath(" .//*[@id='gt-appname']"));
						 Thread.sleep(3000);
						 
					     IsTranslateBtnPresent = IsElementPresent(By.xpath(".//*[@id='gt-submit']"));
					     Thread.sleep(3000);
					     
					    if (IsTranslateLogoPresent && IsTranslateBtnPresent)
					   {
			   		    System.out.println("Element is present on the GooglePlus webpage");
					   }else {   
			   			System.out.println("Element is not present on the GooglePlus page");
					   }
					  driver.navigate().back();
					 
					//.........................8.[To verify "Photos" webpage Element].................................
						 
					  IsGoogleAppPresent = IsElementPresent(By.xpath(".//*[@id='gbwa']/div[1]/a"));
						 Thread.sleep(3000);
						 
					 IsGooglePhotosPresent = IsElementPresent(By.xpath(".//*[@id='gb31']"));      
					 System.out.println("Page title = " +getTitle());
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
					 driver.quit();
		    driver.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
	}
  }
}
