package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By username=By.name("username");	
	private By pass=By.ByName.name("password");
	private By LoginBtn=By.ByTagName.tagName("button");
	
	//methods
	
	public String Login(String un, String pw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(pass).sendKeys(pw);
		driver.findElement(LoginBtn).click();
		return driver.getCurrentUrl();
	}

}
