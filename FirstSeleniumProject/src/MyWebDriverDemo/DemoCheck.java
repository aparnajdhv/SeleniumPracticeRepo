package MyWebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheck {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).getText());
		
		System.out.println("Fetching Data using For Each Loop");
		
		for(WebElement lst:list)
			System.out.println(lst.getText());
		
	}

}
