package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Utility.Utility;

public class LoginPageTest extends BaseClass {
  @Test (priority=1)
  public void validateLogin() {
	  
	  String ActualUrl=lp.Login("Admin","admin123");
	  Assert.assertTrue(ActualUrl.contains("dashboard"),"Test Case Failed : URL not Matched..!");
	  Utility.captureScreenshot(driver);
	  System.out.println("Test Case Passed : URL Matched..!");
  }
}
