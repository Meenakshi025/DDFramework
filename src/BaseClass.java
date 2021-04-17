import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import TestNG_Report.NewTest;

public class BaseClass extends NewTest  {
	
	static {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing_LatestSoftware\\Chrome\\chromedriver.exe");
	}

	public static WebDriver driver = new ChromeDriver();

	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getText(By by) {
		return driver.findElement(by).getText();
	}

	public static boolean IsElementPresent(By by) 
	{
		boolean IsDisplayed = driver.findElement(by).isDisplayed();
		if (IsDisplayed) 
		{
			driver.findElement(by).click();
		}
		return IsDisplayed;
	}

	public static void getAllLinks(By by)
	{
		WebElement element = driver.findElement(by);
		List<WebElement> links = element.findElements(By.tagName("a"));
		// System.out.println(" total number of links on webpage = "+links.size());
		for (WebElement link : links) 
		{
			System.out.println(link.getText());
		}
	}

	public static void logindetails(By by, String input, By btnby)
	{
		if (driver.findElement(by).isDisplayed())		{
			driver.findElement(by).sendKeys(input);
			driver.findElement(btnby).click();
		}
	}
}
