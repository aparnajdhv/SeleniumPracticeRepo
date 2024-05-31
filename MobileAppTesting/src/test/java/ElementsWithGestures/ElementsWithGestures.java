package ElementsWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import AppiumDemo.DriverUtil;
import UtilityPackage.UtilClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ElementsWithGestures {
  @Test
  public void clickGesture() throws InterruptedException 
  {
	 AppiumDriver driver=DriverUtil.init();
	 
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 Thread.sleep(1000);
	 //next inner window
	 WebElement scrollView=driver.findElement(AppiumBy.id("android:id/list"));
	
	 UtilClass.scrollup(driver, scrollView);
	 
//	 driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
//			 "elementId",((RemoteWebElement)scrollView).getId(),
//			 "direction","up",
//			 "percent",1.0
//			 ));
	 Thread.sleep(1000);
	 driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
			 "elementId",((RemoteWebElement)scrollView).getId(),
			 "direction","down",
			 "percent",1.0
			 ));
	 
  }
}
