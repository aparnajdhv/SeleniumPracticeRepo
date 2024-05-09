package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class POMClientClass {
	WebDriver driver;
	POMClassA p1;
  @Test
  public void callFunctions() {
	  p1.setUsername("7709432979");
	  p1.setPassword("Aparna@123");
	  p1.signIn();
	  p1.showMsg();
  }
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.netflix.com/login");		
		p1=new POMClassA(driver);
  }

  @AfterTest
  public void afterTest() {
//	  d
	  driver.close();
  }

}

