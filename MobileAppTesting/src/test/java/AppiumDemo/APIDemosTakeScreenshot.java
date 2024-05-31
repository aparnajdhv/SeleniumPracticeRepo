package AppiumDemo;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class APIDemosTakeScreenshot {
	
  @Test
  public void screenShot() throws IOException 
  {
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Android");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app", path);	  
		URL url=new URL("http://0.0.0.0:4723");
		AppiumDriver driver=new AndroidDriver(url,options);
		System.out.println("Session ID : "+driver.getSessionId());
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(System.getProperty("user.dir")+"//ScreenShots//"+System.currentTimeMillis()+".png");
		FileHandler.copy(screenShot,dest);	  
  }
}
