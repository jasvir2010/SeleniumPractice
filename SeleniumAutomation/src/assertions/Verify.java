package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verify {

	public static boolean vaildatePageURL(WebDriver driver, String expURL)
	{
		boolean f = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			f = true;
		}
		return f;
	}
	
	public static boolean vaildatePageTitle(WebDriver driver, String expTitle)
	{
		boolean f = false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			f = true;
		}
		return f;
	}
	
	public static boolean vaildateElementExists(WebDriver driver, String locType, String locValue)
	{
		boolean f = false;
		if(locType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locValue));
			f = true;
		}
		else if(locType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locValue));
			f = true;
		}
		return f;
	}
	
}
