package AppiumDemo;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void testLocators() {
	  
	  AppiumDriver driver = DriverUtil.init();
	  
	  //accessibilityId
	  WebElement element1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  element1.click();
	  driver.navigate().back();
	  
	  //id
	  WebElement element2=driver.findElements(AppiumBy.id("android:id/text1")).get(1);
	  element2.click();
	  driver.navigate().back();
	  
	  //xpath
	  WebElement element3=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  element3.click();
	  driver.navigate().back();
	  
	  //UiSelector
	  WebElement element4=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")"));
	  element4.click();
	  driver.navigate().back();
	   
	//class
	  WebElement element5=driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
	  element5.click();
	  driver.navigate().back();
	  
  }
}
