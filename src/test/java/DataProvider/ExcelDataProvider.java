package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("D:\\workspace\\com.Interview.Framework.practice\\ApplicationTestData\\AppTestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
			e.printStackTrace();
		}
	}
		
		public String getData(int sheetIndex, int row, int col)
		{
		    String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
			return data;
		}
		
		public String getData(String sheetName, int row , int col)
		{
		    String data = wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
			return data;
		}
	}


