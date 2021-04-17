import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//...........TC_006.[To open and close the browser]..............
//Author Name : Meenakshi Patil
//Date : 25/11/2016

public class TC_006 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium testing Videos\\Software\\Exe files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.quit();
		
	}

}
