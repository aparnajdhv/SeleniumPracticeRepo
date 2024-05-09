package MyWebDriverDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeDemoForm {

	public static void main(String[] args) throws AWTException {
			
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js =(JavascriptExecutor) driver;
				
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement fname =driver.findElement(By.id("firstName"));
		fname.sendKeys("Am");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Kd");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("amo.jdhv@gmail.com");
		WebElement gen=driver.findElement(By.id("gender-radio-2"));
		js.executeScript("arguments[0].click()",gen);
		
		WebElement mob=driver.findElement(By.id("userNumber"));
		mob.sendKeys("1234567891");
		
		
		WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		month.selectByValue("10");
		
		Select yr=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
		yr.selectByValue("1987");
		
		WebElement dobClick=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"));
		dobClick.click();		
		
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("Test");		
		
		WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-1"));
		js.executeScript("arguments[0].click()",hobbies);

		WebElement hobbies2 = driver.findElement(By.id("hobbies-checkbox-3"));
		js.executeScript("arguments[0].click()",hobbies2);
		
	    WebElement fileInput = driver.findElement(By.id("uploadPicture"));
	    fileInput.sendKeys("C:\\Users\\INDIA\\OneDrive\\Pictures\\Saved Pictures\\1.jpg");
		
	    WebElement addr=driver.findElement(By.id("currentAddress"));
	    addr.sendKeys("Phaltan");
	    	
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		state.click();
		state.sendKeys("Uttar Pradesh");
		
//		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[2]")).click();
//		state.click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("Lucknow");
		driver.findElement(By.id("submit")).click();
		driver.close();

	}

}
