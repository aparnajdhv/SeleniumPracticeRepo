package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	//Encapsulation = wrapping of data and functions together in single unit
	// Identification part (Locators) + Action 
	
	private WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By PIMLink=By.partialLinkText("PIM");
	private By userDrpDwn=By.className("oxd-userdropdown-tab");
//	private By logOutOpt = By.partialLinkText("Logout");
	private By logOutOpt = By.cssSelector("[href=\'/web/auth/logout\']");
	
	//methods
	public String PIM()
	{
		driver.findElement(PIMLink).click();
		return driver.getCurrentUrl();
	}
	
	public String Logout()
	{
		driver.findElement(userDrpDwn).click();
		driver.findElement(logOutOpt).click();
		return driver.getCurrentUrl();
	}

}
