package AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil {

	public static AppiumDriver driver;
	
	public static AppiumDriver init()
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		
		String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		options.setCapability("appium:app", path);
		URL url;
		try {
			 url=new URL("http://0.0.0.0:4723");
			driver=new AndroidDriver(url,options);
			System.out.println("Session ID : "+driver.getSessionId());
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}		
		
		return driver;
	}
	
}
