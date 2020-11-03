package samplepackage;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PostRequestAutomation {

	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		String json = "{\r\n" + 
				"    \"name\": \"Kartik Patel\",\r\n" + 
				"    \"job\": \"SDET\"\r\n" + 
				"}";
		RestAssured.given().body(json).post().then()
		.log().all()
		.assertThat()
		.statusCode(201);
	}
}
