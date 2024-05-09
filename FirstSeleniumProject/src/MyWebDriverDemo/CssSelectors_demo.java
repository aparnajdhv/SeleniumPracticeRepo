package MyWebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("aparna.jdhv@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("test@123");
//		driver.findElement(By.name("login")).click();
		//driver.close();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		List<WebElement> listCheckboxs = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		
		
		for(int i=0;i<listCheckboxs.size();i++)
		{
			if(listCheckboxs.get(i).isSelected()==false)
				listCheckboxs.get(i).click();
				
			System.out.println(listCheckboxs.get(i).getAttribute("value"));
			
		}
	}

}
