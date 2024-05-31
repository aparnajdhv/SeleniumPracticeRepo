package UtilityPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class UtilClass {
  @Test
  public static void scrollup(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","up",
				  "percent",1.0
				  ));
	}
  @Test
  public static void scrollDown(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","down",
				  "percent",1.0
				  ));
	}
}
