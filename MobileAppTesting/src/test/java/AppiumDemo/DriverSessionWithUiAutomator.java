package AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithUiAutomator {
  @Test
  public void testSession() throws MalformedURLException {
	   
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Android");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app",path);
	  
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  AppiumDriver driver=new AndroidDriver(url,options);
	  
	  System.out.println("Session ID : "+driver.getSessionId());
	  //dumpsys window | grep -E mCurrentFocus
  }
}
