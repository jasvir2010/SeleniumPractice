package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	ResourceBundle rb;
	
	public Login(ChromeDriver driver)
	{
		this.driver = driver;
		rb = ResourceBundle.getBundle("Element");
	}
	
	public void enterUserName(String uName)
	{
		driver.findElementById(rb.getString("login_user_id")).sendKeys(uName);
	}

}
