package BDD_examples;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;	
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

public class POST_RequestWays {
  @Test
  public void PostWithMap() {
	  
	  HashMap<String, Object> data=new HashMap<String, Object>();
	  data.put("name", "Aparna");
	  data.put("job", "React Developer");
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  .when()
	  	.post("https://reqres.in/api/users")
	  
	  .then()
	  	.statusCode(201)
	  	.body("name", equalTo("Aparna"))
	  	.log().body()
	  	.log().all();
	  
	  System.out.println("New user added by HashMap method.");
  }
  
  
  	@Test (priority=2)
    public void PojoWay() 
  	{
  		PojoData data=new PojoData();
  		
  		data.setName("ShriLaxmi");
  		data.setJob("Management");
	  
  		given()
  			.contentType("application/json")
  			.body(data)
  		
  		
  		.when()
  			.post("https://reqres.in/api/users")
  			
  		.then()
  			.statusCode(201)
  			.body("name",equalTo("ShriLaxmi")) //json validation
  			.log().all();
  		
  			//validation for java object
  			System.out.println(data.getName().equals("ShriLaxmi"));
  			System.out.println(data.getJob().equals("Management"));  			
  		
  	}  
}
