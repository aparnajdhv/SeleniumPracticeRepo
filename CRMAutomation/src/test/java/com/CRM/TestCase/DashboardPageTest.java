package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.CRM.Pages.DashboardPage;
import com.CRM.Utility.Utility;

public class DashboardPageTest extends BaseClass
{
//	LoginPageTest lp=new LoginPageTest();
	
  @Test(priority=1)
  public void validateDashboard() throws InterruptedException {
	  
	  String loggedInChk=lp.Login("Admin","admin123");
	  Assert.assertTrue(loggedInChk.contains("dashboard"),"Failed : Not logged In");
	  String dashUrl=dp.PIM();	  
	  Thread.sleep(5000);
	  Utility.captureScreenshot(driver);
	  Assert.assertTrue(dashUrl.contains("pim"),"Not on PIM..");
	  System.out.println("Successfully clicked on PIM.");
  }
  
  @Test(priority=2)
  public void UserLogout() 
  {	  
	  dp.Logout();  
	  System.out.println("Logout");
  }  
  
}
