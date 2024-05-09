package DemoTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProperties {
	
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void FetchData() {
		WebElement srchbx=driver.findElement(By.id(prop.getProperty("searchBoxId")));
//		srchbx.click();
		srchbx.sendKeys("POM in selenium");
		srchbx.sendKeys(Keys.ENTER);
	}

	@BeforeMethod
	public void BeforeTestExe() throws IOException {
		file = new File("D:\\Start Ageil\\Selenium\\selinium_practice\\FirstSeleniumProject\\src\\DemoTestNG\\MyData.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
		
		
	}
}
