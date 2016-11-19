package utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadAndWriteXLSUsingJXL {
	
	public String[][] ReadXLS(String filePath) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File fileToRead = new File(filePath);
		Workbook wb = Workbook.getWorkbook(fileToRead);

		Sheet s1 = wb.getSheet(0);
		
		int rowCount = s1.getRows();
		int colCount = s1.getColumns();	
		String [][] arr = new String[rowCount][colCount]; 
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				Cell data = s1.getCell(j,i);
				System.out.println(data.getContents());
				arr[i][j] = data.getContents();
			}
		}		
		wb.close();
		return arr;		
	}
	
	public void WriteXLS() throws IOException, RowsExceededException, WriteException
	{
		int row=0,col=0;
		String data = "Hello";
		File fileToWrite = new File("./Excel Files/WriteData.xls");
		WritableWorkbook wk = Workbook.createWorkbook(fileToWrite);
		WritableSheet s = wk.createSheet("Data", 0);	
		Label l = new Label(col,row,data);
		s.addCell(l);
		wk.write();
		wk.close();
	}
	
}
