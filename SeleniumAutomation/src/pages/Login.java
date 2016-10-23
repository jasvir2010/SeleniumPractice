package pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	
	public Login(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUserName(String uName)
	{
		driver.findElementById("email").sendKeys(uName);
	}

}
