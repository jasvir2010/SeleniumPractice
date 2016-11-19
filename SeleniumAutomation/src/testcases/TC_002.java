package testcases;

import java.util.Set;

import org.testng.annotations.Test;

import base.CreateDriver;
import pages.Login;

public class TC_002 extends CreateDriver {
	
	@Test
	public void tCase1()
	{
		driver.navigate().to("http://www.rediff.com");
		driver.manage().window().maximize();
		Set<String> windows = driver.getWindowHandles();
		for(String s : windows)
		{
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().equalsIgnoreCase("http://www.rediff.com"))
			{
				
			}
			else
			{
				driver.close();
			}
		}
	}

}
