package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadExcelFile {
	String fPath ="D:\\MyExcelSheet.xlxs";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void getRow() {
	  row=sheet.getRow(0);
	  cell=row.getCell(0);
	  System.out.print(cell.getStringCellValue());
	  
	  cell=row.getCell(1);
	  System.out.println(" "+cell.getStringCellValue());
	  
	  row=sheet.getRow(1);
	  cell=row.getCell(0);
	  System.out.print(cell.getStringCellValue());
	  
	  cell=row.getCell(1);
	  System.out.println(" "+cell.getStringCellValue());
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File(fPath);
	  fis=new FileInputStream(file);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("ExcelAppy");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  
	  wb.close();
	  fis.close();
  }

}
