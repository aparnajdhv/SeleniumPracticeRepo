package BDD_examples;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class QueryPathParamsTest {
  @Test
  public void QueryParamsTest() {
	  
	  given()
	  	.pathParam("myPath", "users")
	  	.queryParam("page", 1)
	  	
	  	.when()
	  		.get("https://reqres.in/api/{myPath}")
	  	
	  	.then()
	  		.statusCode(200)
	  		.log().body();
	  
  }
}
