package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public Object[][] readExcel(String name) throws InvalidFormatException, IOException {
		
		// Step 1: Open the workbook
		File loginWbook = new File("./data/"+name+".xlsx");		
		XSSFWorkbook wbook = new XSSFWorkbook(loginWbook);
		
		// Step 2: Go to the specific sheet
		XSSFSheet sheet = wbook.getSheet("Data");
		
		// Step 2a: Get the number of rows
		int rowcount = sheet.getLastRowNum();
		System.out.println("Number of rows :"+rowcount);
		
		// Step 2b: Get the number of columns in row 1
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowcount][columnCount];
		
		for (int i = 1; i <= rowcount; i++) {
			
			// Step 3: Go to the specific row
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				// Step 4: Go to the specific cell
				XSSFCell cell = row.getCell(j);
				// Step 5: Read the content of the cell
				String testdata = cell.getStringCellValue();
				System.out.println(testdata);
				data[i-1][j] =  testdata;
			}
		}
		return data;
		
	}

}
