package ElementsWithGestures;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import UtilityPackage.BaseClass;
import io.appium.java_client.AppiumBy;

public class alertHandling extends BaseClass {
  @Test
  public void alertDemo() {
	  //click on App
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //click on Alert dialog
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //click on 1st alert type
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert Meassage : "+alt.getText());
	  
	  //click on OK
	  alt.accept();
	  
	  
  }
}
