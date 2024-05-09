package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstDemoTestNG {
  WebDriver driver;
	@Test (priority=3)
	  public void a1() {
		  driver.findElement(By.partialLinkText("Mobil")).click();
	  }
	@Test (priority=1)
	  public void a2() {
		  driver.findElement(By.partialLinkText("Elec")).click();
	  }
	@Test (priority=2)
	  public void a3() {
		  driver.findElement(By.partialLinkText("Gift")).click();
	  }
	
	@BeforeMethod
	public void head() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void footer() {
		driver.close();
	}
}
