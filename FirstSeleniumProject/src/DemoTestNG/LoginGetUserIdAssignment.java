package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class LoginGetUserIdAssignment {
	WebDriver driver;
	String fPath="D:\\Start Ageil\\Selenium\\OHRMAssignment.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb,wbWrite;	
	XSSFSheet sheet,sheetWrite;
	XSSFRow row,rowWrite;
	XSSFCell cell, cellWrite;
	
  @Test(priority=1,dataProvider = "FirstLoginData")
  public void firstLogin(String un, String pwd) {
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  
  @Test (priority=2)
  public void afterLoginDashboard() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click(); //click PIM
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click(); //click on add
	  
	  
	  /*
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Avi");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1001");
	  WebElement empType=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div"));
	  empType.click();
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ENTER).perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")).click();
	  Thread.sleep(2000);
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ENTER).perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys("Amol");
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div")).click();
	  Thread.sleep(2000);
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ENTER).perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div")).click();
	  Thread.sleep(2000);
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ARROW_DOWN).perform();
	  act.keyDown(Keys.ENTER).perform();
	  */
  }
  
  @Test (priority=3)
  public void fetchExcelData() throws IOException, InterruptedException
  {
	  file= new File(fPath);
	  fis=new FileInputStream(file);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("Sheet1");
	  Thread.sleep(5000);
	  row=sheet.getRow(1);
	  cell=row.getCell(1);
	  driver.findElement(By.name("firstName")).sendKeys(cell.getStringCellValue());
	  
	  
	  cell=row.getCell(2);
	  driver.findElement(By.name("middleName")).sendKeys(cell.getStringCellValue());
	  
	  
	  cell=row.getCell(3);
	  driver.findElement(By.name("lastName")).sendKeys(cell.getStringCellValue());
	    
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	  Thread.sleep(5000);
	  cell=row.getCell(4);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(cell.getStringCellValue());
	  
	  cell=row.getCell(5);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(cell.getStringCellValue());
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(cell.getStringCellValue());
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click(); //logout
	  
	  //login again with excel data credentials
	  
	  String user=row.getCell(4).getStringCellValue();
	  driver.findElement(By.name("username")).sendKeys(user);
	  String pass=row.getCell(5).getStringCellValue();
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  //after login with new credentials
	  
	  //select My Info
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
	  //get Employee ID
	  WebElement EmpID=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
	  
	  //store EmpId in excel sheet
	  fos=new FileOutputStream(file);
	  sheetWrite=wb.getSheet("Sheet1");
	  
//	  WebElement EmpID=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
	  rowWrite=sheet.getRow(1);
	  cellWrite=rowWrite.createCell(6);
	  cellWrite.setCellValue(EmpID.getAttribute("value"));
	  Thread.sleep(5000);
	  //read Username from right top corner
	  String ActualValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
	  
	  rowWrite=sheet.getRow(1);
	  cellWrite=rowWrite.createCell(8);
	  cellWrite.setCellValue(ActualValue);
	  
	  String expectedValue=row.getCell(7).getStringCellValue();
	  if(expectedValue.equals(ActualValue))
	  {
		  rowWrite=sheet.getRow(1);
		  cellWrite=rowWrite.createCell(9);
		  cellWrite.setCellValue("Passed");
	  }else
	  {
		  rowWrite=sheet.getRow(1);
		  cellWrite=rowWrite.createCell(9);
		  cellWrite.setCellValue("Failed");
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  
	  wb.write(fos);
	  wb.close();
	  fis.close();
	  fos.close();		  
  }
  
  @Test(priority=4, dataProvider = "FirstLoginData")
  public void loginAgain(String uname, String passwd) {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(passwd);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  
  @Test(priority=5)
  public void deleteRecord() throws IOException, InterruptedException
  {
	  file= new File(fPath);
	  fis=new FileInputStream(file);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("Sheet1");
	  
	  row=sheet.getRow(1);
	  cell=row.getCell(1);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys(cell.getStringCellValue());
	  Thread.sleep(5000);
	  //click on search
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]/i")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]/i")).click(); //confirm delete
	  Thread.sleep(5000);
	  //logout
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  
	  wb.close();
	  fis.close();
  }
  
  @DataProvider
  public Object[][] FirstLoginData() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" }      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
