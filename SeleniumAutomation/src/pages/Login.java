package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import assertions.Verify;

public class Login {
	
	WebDriver driver;
	ResourceBundle rb;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		rb = ResourceBundle.getBundle("Element");
	}
	
	public void enterUserName(String uName)
	{
		driver.findElement(By.id(rb.getString("login_user_id"))).sendKeys(uName);
		//boolean actResult = Verify.vaildatePageURL(driver, "https://www.facebook.com");
		//Assert.assertTrue(actResult,"[ERROR - URL Not Matching]"+" http://www.facebook.com");
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(By.id(rb.getString("login_pass_id"))).sendKeys(pass);
		//boolean actResult = Verify.vaildatePageURL(driver, "https://www.facebook.com");
		//Assert.assertTrue(actResult,"[ERROR - URL Not Matching]"+" http://www.facebook.com");
	}

}
