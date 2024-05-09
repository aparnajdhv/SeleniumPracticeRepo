package MyWebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownPract {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");  
		//enter name
		WebElement name =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("Amol");
		
		//enter email
		WebElement email =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		email.sendKeys("aparna123");
		
		//password
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));
		pass.sendKeys("Aparna@123");
		
		//repassword
		WebElement repass=driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
		repass.sendKeys("Aparna@123");
		
		//checkbox
		WebElement chkbx=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		chkbx.click();
		
		//enter mobile number
		WebElement mob=driver.findElement(By.id("mobno"));
		mob.sendKeys("7234556789");
		
		//security ques
		Select securityQ =new Select(driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")));
		securityQ.selectByValue("What is your favourite food?");
		
		//secAns
		WebElement sAns= driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
		sAns.sendKeys("Gulab Jamun");
		
		//mother's maiden name
		WebElement maidenName = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input"));
		maidenName.sendKeys("Patil");
		
		//select date
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		se.selectByValue("17");
		
		//select month
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
		month.selectByValue("10");
		
		//select year
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
		year.selectByValue("1986");
		WebElement gen = driver.findElement(By.cssSelector("input[type=\"radio\"][value=\"f\"]"));
		gen.click();
		Select city=new Select(driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")));
		city.selectByValue("Pune");
		
		List<WebElement> cityOpt=city.getOptions();
		
		for(WebElement ct:cityOpt)
		{
			System.out.println("-->"+ct.getText());
		}
	}

}
