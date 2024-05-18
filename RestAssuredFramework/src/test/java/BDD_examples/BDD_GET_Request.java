package BDD_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class BDD_GET_Request {
  @Test (priority=1)
  public void Get_GoogleTest() {
	  	given()
	  	
	  	.when()
	  	.get("https://www.google.com")
	  	
	  	.then()
	  	.statusCode(200)
	  	.log().all();
//	  	.log().cookies();
//	  	.log().headers();
	  		  	
  }
  
  @Test (priority=2)
  public void Get_GoogleTest_getResponse() {
	  	
	  Response res = given()	  	
					  	.when()
					  		.get("https://www.google.com");
	  	
	  	int actCode=res.getStatusCode();
	  	Assert.assertEquals(actCode, 200,"Status Code Not Matched .!");
	  	System.out.println("Staus Code Matched : "+actCode);
  }
}
