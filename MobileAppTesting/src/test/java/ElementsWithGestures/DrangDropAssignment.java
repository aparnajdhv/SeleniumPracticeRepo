package ElementsWithGestures;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import UtilityPackage.BaseClass;
import io.appium.java_client.AppiumBy;

public class DrangDropAssignment extends BaseClass
{
  @Test
  public void dragDrop() throws InterruptedException 
  {
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  Thread.sleep(1000);
	  //click on drag drop option	  
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //first dot for dragging
	  WebElement dot3=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //drag gesture
	  driver.executeScript("mobile:dragGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)dot3).getId(),
			  "endX",641,
			  "endY",1006			  
			  ));
	  
	  String droppedResult=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Drag Dropped Result Message : "+droppedResult);
  }
}
