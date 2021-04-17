import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//........To verify the Google apps/products on Google products webpage..........
//Author Name : Meenakshi Patil
//Date : 27/11/2016

public class TC_008 extends BaseClass {

	public static void main(String[] args) {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("https://www.google.co.in/intl/en/about/products/");
	    driver.manage().window().maximize();
	    
	    getAllLinks(By.xpath("html/body/div[3]"));
		
	    driver.close();
	}

}
