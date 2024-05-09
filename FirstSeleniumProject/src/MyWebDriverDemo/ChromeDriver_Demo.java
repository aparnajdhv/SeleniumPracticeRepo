package MyWebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		String pgSource = driver.getPageSource();
		System.out.println(pgSource);
	
		driver.close();
	}

}
