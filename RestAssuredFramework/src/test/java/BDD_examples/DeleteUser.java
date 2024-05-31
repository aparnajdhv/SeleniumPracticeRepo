package BDD_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DeleteUser {
  @Test (priority=1)
  public void deleteUser() {
	  
	  Response res = given()	  	  
						  .when()
						  	.delete("https://reqres.in/api/users/2");
						  	
	  int actCode=res.getStatusCode();
	  Assert.assertEquals(actCode, 204,"Status Code Not Matched .!");
	  System.out.println("Staus Code Matched : "+actCode);
	  System.out.println("User got deleted successfuly with status Code :"+actCode);
	  
  }
}
