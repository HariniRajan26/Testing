package selenium.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static void main(String[] args) throws IOException
	{
		String location = "C:\\Users\\harin\\OneDrive\\Documents\\testdata.xlsx";
		FileInputStream fis = new FileInputStream(location);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int total=sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows: "+total);
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of column: "+column);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getNumericCellValue());
	}

}
