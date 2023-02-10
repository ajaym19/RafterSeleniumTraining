package APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPITest {

	@Test
	public void getAPITest() {
		// Step1: Specify the base URI
		// https://reqres.in/api/users/
		RestAssured.baseURI = "https://reqres.in/api";

		// Step2: Create a Request
		RequestSpecification httpRequest = RestAssured.given();

		// Step3: Hit the API and specify hte HTTP Method
		Response response = httpRequest.request(Method.GET, "/users/");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		JsonPath jsonPath = response.jsonPath();
		
		System.out.println(jsonPath.get("page"));
		System.out.println(jsonPath.get("total_pages"));
		
		//Adding Assertions
		Assert.assertTrue(responseBody.contains("page"));
		Assert.assertEquals(jsonPath.get("per_page"), 6);
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println(response.header("Connection"));
		
		
		
	}

}
