package MyWebDriverDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CityBankSite  {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.navigate().to("https://staragile.melimu.com/login/index.php");
		driver.findElement(By.id("username")).sendKeys("aparna.jdhv@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aarohi@123");
		driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).click();
		
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String>itr=windows.iterator();
//		String win1 =itr.next();
//		String win2 = itr.next();
//		
		//after login inner page
		
//		driver.switchTo().window(win2);
		
		WebElement started=driver.findElement(By.xpath("//*[@id=\"region-main\"]/div[2]/div[2]/ul/li[2]/a"));
		js.executeScript("arguments[0].click()", started);
		
		WebElement resume=driver.findElement(By.id("card-parent-6622439d67462_356"));
		js.executeScript("arguments[0].click()", resume);
//		String win3 =itr.next();
//		driver.switchTo().window(win3);
		
		
	}

}
