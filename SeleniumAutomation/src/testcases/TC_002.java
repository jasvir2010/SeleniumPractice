package testcases;

import org.testng.annotations.Test;

import base.CreateDriver;
import pages.Login;

public class TC_002 extends CreateDriver {
	
	@Test
	public void tCase1()
	{
		Login login = new Login(driver);
		login.enterUserName("Hello");
	}

}
