package MyWebDriverDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClassA {
	
	WebDriver baseDriver;
	
	public BaseClassA(WebDriver clientDriver) {
		this.baseDriver=clientDriver;
	}
	
	public void setUserName(String un) {
		baseDriver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys(un);
	}
	
	public void Login() {
		baseDriver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")).click();
	}

}
