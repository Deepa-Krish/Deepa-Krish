package readExcel.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PomReadExcelSheetCommon {
	public static String[][] pomreadData(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		System.out.println("RowCount "+rowCount);
		short cellCount = ws.getRow(0).getLastCellNum();
		System.out.println("CellCount "+cellCount);
		
		String [][] excelData =  new String [rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
			
			excelData[i-1][j] = cellValue;
			
			System.out.println("Values "+cellValue);
		}	
	}  
		wb.close();
		return excelData;
 }
}