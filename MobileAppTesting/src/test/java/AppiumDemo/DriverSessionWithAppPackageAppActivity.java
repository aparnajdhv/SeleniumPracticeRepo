package AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithAppPackageAppActivity {
  @Test
  public void testSession() throws MalformedURLException {
	  
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Android");
	  //Clock
//	  options.setCapability("appium:appPackage", "com.google.android.deskclock");
//	  options.setCapability("appium:appActivity", "com.android.deskclock.DeskClock");
	  
	  options.setCapability("appium:appPackage", "io.appium.android.apis");
	  options.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
	  
	  
	  
	  URL url =new URL("http://0.0.0.0:4723");
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("Session Id : "+driver.getSessionId());
  }
}
