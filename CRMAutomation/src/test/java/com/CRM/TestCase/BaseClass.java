package com.CRM.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.DashboardPage;
import com.CRM.Pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public DashboardPage dp;
	public LoginPage lp;
	String baseUrl="https://opensource-demo.orangehrmlive.com/web/auth/login";
	
	
	
	@BeforeTest
	public void browserSetUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseUrl);
		dp=new DashboardPage(driver);
		lp=new LoginPage(driver);
	}
}
