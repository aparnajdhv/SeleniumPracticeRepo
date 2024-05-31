package BDD_examples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class OAuthTestCase {
  @Test
  public void OAuthTest() {
	  
	  given()
	  	.auth().oauth2("770943")
	  .when()
	  	.get("https://postman-echo.com/")
	  	
	  
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
	  System.out.println("OAuth2.0 Authentication is validated!");
  }
}
