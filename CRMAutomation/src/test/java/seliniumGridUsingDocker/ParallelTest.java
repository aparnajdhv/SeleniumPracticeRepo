package seliniumGridUsingDocker;

import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTest {
	WebDriver driver;
	
	
  @Test
  @Parameters("browserName")
  public void ParallelBrowserExecution(String browserName) throws MalformedURLException, InterruptedException {
	  
	if(browserName.equalsIgnoreCase("chrome")) {
		
		ChromeOptions options=new ChromeOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		System.out.println("Remote connection with Chrome done !");
		
	}else if(browserName.equalsIgnoreCase("firefox")){
		
		FirefoxOptions options=new FirefoxOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		System.out.println("Remote connection with Firefox done !");
		
	}else if(browserName.equalsIgnoreCase("edge")){
		
		EdgeOptions options=new EdgeOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		System.out.println("Remote connection with Edge done !");
		
	}
	System.out.println("Remote connection done !");
	Thread.sleep(5000);
	driver.get("https://www.amazon.in");
	Thread.sleep(10000);
	System.out.println("Title of the Application opened : "+driver.getTitle());
	driver.quit();
  }
}
