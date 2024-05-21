package BDD_examples;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UpdateDelete {
  @Test
  public void UpdateRecord() {
	  PojoData data=new PojoData();
	  data.setName("Ayush");
	  data.setJob("Doctor");
	  
	  given()
	  .contentType("application/json")
	  	.body(data)
	  
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	.body("name", equalTo("Ayush"))
	  	.log().all();
  }
}
