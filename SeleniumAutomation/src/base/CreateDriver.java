package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void bMet()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void aMet()
	{
		driver.quit();
	}

}
