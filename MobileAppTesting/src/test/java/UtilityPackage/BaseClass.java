package UtilityPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AppiumDemo.DriverUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	
	public AppiumDriver driver;
  @BeforeTest
  public void setUp() 
  {
	  driver=DriverUtil.init();
  }
}
