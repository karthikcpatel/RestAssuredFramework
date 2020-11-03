package samplepackage;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestAutomation {

	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		Response response = RestAssured.given().param("page", "2").when().get();
		System.out.println("Response Body: " +response.getBody().asString());
		System.out.println("Status Code: " +response.getStatusCode());
		System.out.println("Content Type: " +response.contentType());
		System.out.println(response.prettyPrint());
	}
	
}
