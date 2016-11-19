package testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.CreateDriver;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import pages.Login;
import utilities.ReadAndWriteXLSUsingJXL;

public class TC_001 extends CreateDriver {
	
	@Test(dataProvider="dp2")
	public void tCase1(String uname,String pass) throws IOException
	{
		
		Logger l = Logger.getLogger("TC_001.class");
		
		Login login = new Login(driver);
		login.enterUserName(uname);
		login.enterPassword(pass);
		
	}

	@DataProvider
	public Object[][] dp1()
	{
		String [][] arr = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return arr;
	}
	
	@DataProvider
	public Object[][] dp2() throws RowsExceededException, BiffException, WriteException, IOException
	{
		ReadAndWriteXLSUsingJXL read = new ReadAndWriteXLSUsingJXL();
		String [][] arr = read.ReadXLS("./InputData/InputData.xls");
		return arr;
	}
}
