package DemoTestNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddDataToExcel {

	String fPath="D:\\MyExcelSheet.xlxs";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	
	public void setData() {
		row=sheet.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("First Name");
		
		cell=row.createCell(1);
		cell.setCellValue("Last Name");
		
		row=sheet.createRow(1);
		cell=row.createCell(0);
		cell.setCellValue("Aparna");
		
		cell=row.createCell(1);
		cell.setCellValue("Kadam");
		
	}
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file=new File(fPath);
		fos=new FileOutputStream(file);
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("ExcelAppy");	
		
	}
	
	@AfterTest
	public void afterTest() throws IOException {
		
		wb.write(fos);
		wb.close();
		fos.close();
	}
}
