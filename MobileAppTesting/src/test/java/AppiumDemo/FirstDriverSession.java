package AppiumDemo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstDriverSession {
  @Test
  public void testSession() throws IOException {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appium:automationName", "UiAutomator2");
	  cap.setCapability("deviceName", "pixel_3a");
	  cap.setCapability("appium:udid", "emulator-5554");
	  
	  //application path
	  String path=System.getProperty("user.dir")+"//src//test/resources//ApiDemos-debug.apk";
	  cap.setCapability("app", path);
	  
	  //server address
	  URL url = new URL("http://0.0.0.0:4723");
	  
	  //start server and pass
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  
	  System.out.println("Session Id :"+driver.getSessionId());
  }
}
