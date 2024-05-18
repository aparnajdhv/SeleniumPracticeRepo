package com.CRM.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//screenshots//CRM"+System.currentTimeMillis()+".png");
		try {
		FileHandler.copy(temp, dest);
		}catch(IOException e){
			System.out.print("Exception Raised : ");
			e.printStackTrace();
		}
	}
}