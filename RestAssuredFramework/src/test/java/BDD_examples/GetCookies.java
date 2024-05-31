package BDD_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

import java.util.Map;

public class GetCookies {
  @Test
  public void GetCookiesTest() 
  {
	
	  Response res = given()
	  
	  .when()
	  .get("https://www.google.com");
	  
	  Map<String,String>actCookies=res.getCookies();
	  String prevCookie = "AQTF6HwcsS0EImW-fYXlDicQ9kb3GnjRVr61iFvNcCaEEAg1pBPk61rsPVA";
	  System.out.println("Actual Cookies :"+actCookies);
	  
	  Assert.assertFalse(actCookies.equals(prevCookie),"Test Failed");
	  System.out.println("Test Passed ! Cookie did not matched to previous cookie.");
	 
	  
  }
}
