package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test (priority=1)
  public void validateLogin() {
	  String ActualUrl=lp.Login("Admin","admin123");
	  Assert.assertTrue(ActualUrl.contains("dashboard"),"Test Case Failed : URL not Matched..!");
	  System.out.println("Test Case Passed : URL Matched..!");
  }
}
