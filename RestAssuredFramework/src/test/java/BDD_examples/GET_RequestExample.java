package BDD_examples;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_RequestExample {
  @Test (priority=1)
  public void SingleUser_Request() {
	  System.out.println("This is single user request.");
	  
	  given()
	  	.when()
	  		.get("https://reqres.in/api/users/2")
	  	.then()
	  	.assertThat()
	  	.statusCode(200)
	  	.body("data.id", equalTo(2))
	  	.body("data.first_name", equalTo("Janet"))
	  	.log().body();	  	
  }
  
  @Test (priority=2)
  public void ListOFUser_Request() {
	  System.out.println("List of Users.");
	  
	  given()
	  	.when()
	  		.get("https://reqres.in/api/users?page=2")
	  		
	  		.then()
	  		.statusCode(200)
	  		.body("data[2].id", equalTo(9))
	  		.body("data.id",hasItems(7,12,11))
	  		.body("data.id", contains(7,8,9,10,11,12))
	  		.log().body();
  }
  
}
