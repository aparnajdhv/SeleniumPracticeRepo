package BDD_examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class HeaderTest {
  @Test
  public void headerTestDemo() 
  {
	  Response res = given()
			  
			  .when()
			  	.get("https://www.google.com");
	  
	  Headers hd = res.getHeaders();
	  String prevHeader="Content-Type=text/html; charset=ISO-8859-1";
	  System.out.println(hd);
	  Assert.assertEquals(hd.equals(prevHeader), "Failed");
  }
}
