package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.CreateDriver;
import pages.Login;

public class TC_001 extends CreateDriver {
	
	@Test
	public void tCase1() throws IOException
	{
		Login login = new Login(driver);
		login.enterUserName("Hello");
		
		//File f = new File("./Excel Files/ReadDataXLSXFormat.xlsx");
		FileInputStream fi = new FileInputStream("./Excel Files/ReadDataXLSXFormat.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		System.out.println(s1.getPhysicalNumberOfRows());
		XSSFRow r1 = s1.getRow(0);
		System.out.println(r1.getPhysicalNumberOfCells());
		XSSFCell c1 = r1.getCell(0);
		System.out.println(c1.getStringCellValue());
		
		FileOutputStream fo = new FileOutputStream("./Excel Files/WriteDataXLSXFormat.xlsx");
		XSSFWorkbook wk1 = new XSSFWorkbook();
		XSSFSheet s2 = wk1.createSheet("Data1");
		XSSFRow r2 = s1.createRow(0);
		XSSFCell c2 = r2.createCell(0);
		c2.setCellValue("Hello World");
		wk1.write(fo);
		wk1.close();
	}

}
