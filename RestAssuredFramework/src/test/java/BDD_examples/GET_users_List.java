package BDD_examples;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_users_List {
  @Test
  public void GETUsersPagination() {
	  
	  given()
	  	.when()
	  		.get("https://reqres.in/api/users?page=1")
	  	
	  	.then()
	  	.statusCode(200)
	  	.body("data.id",contains(1,2,3,4,5,6))
	  	.log().body()
	  	;
  }
}
