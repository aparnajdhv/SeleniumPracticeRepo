package BDD_examples;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class NewUserSameUpdateDelete {
	
	String id;
  @Test (priority=1)
  public void createNewUser() {
	  
	  PojoData pojo=new PojoData();
	  pojo.setName("Avneesh");
	  pojo.setJob("Doctor");
	  
	  id =given()
	  	.contentType("application/json")
	  	.body(pojo)
	  	
	  	.when()
	  		.post("https://reqres.in/api/users")
	  		.jsonPath().get("id");
	  	
	  System.out.println("Id Captured : "+id);
	  	  	
  }
  
  @Test(priority=2, dependsOnMethods="createNewUser")
  public void sameUserUpdate()
  {
	  PojoData pojo = new PojoData();
	  pojo.setName("Avneesh");
	  pojo.setJob("Surgen");
	  
	  given()
	  	.contentType("application/json")
	  	.body(pojo)
	  	
	  .when()
	  	.put("https://reqres.in/api/users/"+id)
	  	
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
	  System.out.println("Updated the Job for user with Id :"+id);
	  	
	  	
  }
  
  @Test
  public void deleteSameUser()
  {
	  given()
	  
	  .when()
	  	.delete("https://reqres.in/api/users/"+id)
	  
	  .then()
	  	.statusCode(204)
	  	.log().body();
	  
	  System.out.println("User delete with ID : "+id);
  }
}
