package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClassA {
	WebDriver driver;
	
	public POMClassA(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String un)
	{
		driver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\":r3:\"]")).sendKeys(pwd);
	}
	
	public void signIn()
	{
		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/form/button[1]")).click();
	}
	
	public void showMsg()
	{
		System.out.println(driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText());
	}
}

