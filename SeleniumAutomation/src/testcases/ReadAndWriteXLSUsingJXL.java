package testcases;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.WorkbookMethods;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ReadAndWriteXLSUsingJXL{

	File fileToRead = new File("./Excel Files/ReadData.xls");
	File fileToWrite = new File("./Excel Files/WriteData.xls");
//	Workbook wb = Workbook.getWorkbook(fileToRead);
//	Sheet s1 = wb.getSheet(0);
//	WritableWorkbook wk = Workbook.createWorkbook(fileToWrite);
//	WritableSheet s2 = wk.createSheet("Data", 0);
//	
//	int rowCount = s1.getRows();
//	int colCount = s1.getColumns();
//	
//	for(int i=0;i<rowCount;i++)
//	{
//		for(int j=0;j<colCount;j++)
//		{
//			Cell data = s1.getCell(j,i);
//			System.out.println(data.getContents());
//			Label l = new Label(j,i,data.getContents());
//			s2.addCell(l);
//		}
//	}
//	
//	wk.write();
//	wk.close();
//	wb.close();
}
