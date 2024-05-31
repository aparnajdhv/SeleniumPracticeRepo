package ElementsWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import UtilityPackage.BaseClass;
import io.appium.java_client.AppiumBy;

public class swipeGesture extends BaseClass{
  @Test
  public void swipeGestureDemo() 
  {
	  //click views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //click gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //click photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //get photos element for swipe
	  WebElement photos=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	 
	  driver.executeScript("mobile:swipeGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)photos).getId(),
			  "direction", "left",
			  "percent",1.0
			  ));
	  
	  System.out.println("Swiped successfully");
	  
  }
}
