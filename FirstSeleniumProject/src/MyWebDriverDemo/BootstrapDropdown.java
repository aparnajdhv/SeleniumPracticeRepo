package MyWebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver","C:\\selReq\\DST214\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='menu' and  @aria-labelledby='menu1']/li/a"));

		System.out.println("Total elements: "+list.size());

		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
	}

}