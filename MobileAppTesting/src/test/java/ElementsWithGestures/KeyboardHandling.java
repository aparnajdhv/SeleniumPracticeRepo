package ElementsWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import UtilityPackage.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyboardHandling extends BaseClass {
  @Test
  public void testKeyboard() throws InterruptedException 
  {
	  //click on Views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  Thread.sleep(500);
	  WebElement ele= driver.findElement(AppiumBy.id("android:id/list"));
	  //scroll
	  for(int i=1;i<=2;i++) {
	  driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "direction","down",
			  "percent",1.0
			  ));
	  }
	  //click on TextFields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  area.click();
	  area.sendKeys("Hello.. !");
	  
	  //either way using keyboard
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.P));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.R));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.N));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
  }
}
