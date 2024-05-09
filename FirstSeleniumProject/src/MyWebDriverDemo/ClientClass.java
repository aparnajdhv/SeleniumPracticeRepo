package MyWebDriverDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ClientClass {
	WebDriver driver;
	BaseClassA bc;
  @Test
  public void ActualTestCaseBody() {
	  bc.setUserName("7709432979");
	  bc.Login();
  }
  @BeforeTest
  public void beforeTest() {
	  		
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	  
	  driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
	  bc=new BaseClassA(driver);
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
