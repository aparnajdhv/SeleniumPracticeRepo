package MyWebDriverDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Navigate_To_Website {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open google.com
		driver.get("https://www.google.com/");
		
		//click on Gmail link
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot, new File("D://screenShotImg.jpeg"));
		driver.close();
	}

}
