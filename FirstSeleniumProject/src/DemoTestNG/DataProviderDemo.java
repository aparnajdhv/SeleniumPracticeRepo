package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	String exceptedURL="https://practicetestautomation.com/logged-in-successfully/",actualURL;
	
	@Test(dataProvider = "dp", groups="login")
	public void fun(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
		actualURL=driver.getCurrentUrl();
//		if(actualURL.equals(exceptedURL)==true)
//		{
//			System.out.println("Successfully Loggen In : Username : "+un+" Password : "+pwd);
//		}else {
//			System.out.println("Invalid Credentials: Username : "+un+" Password : "+pwd);
//		}
		
//		Assert.assertEquals(actualURL, exceptedURL);
//		Assert.assertTrue(actualURL.equals(exceptedURL));
	}
	
	@AfterMethod 
	public void afterMethod() {
		driver.close();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@DataProvider
	public Object[][] dp(){
		return new Object[][] {
			new Object[] {"student","Password123"},
			new Object[] {"Aparna","Aparna123"},
			new Object[] {"Aarohi","Aru"},
			new Object[] {"Avneesh","Avi"},
		};
	}

}
