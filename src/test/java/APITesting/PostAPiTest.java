package APITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAPiTest {

	@Test
	public void postAPITesting() {
		// https://reqres.in/api/users/
		RestAssured.baseURI = "https://reqres.in/api";

		// Step2: Create a Request
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-type", "application/json");
		
		//Before we HIT the API, we need to create request body
		JSONObject requestPayload = new JSONObject();
		requestPayload.put("name", "AJay");
		requestPayload.put("job", "IT");
		
		//link the payload with the request
		httpRequest.body(requestPayload.toJSONString());
		
		// Step3: Hit the API and specify hte HTTP Method
		Response response = httpRequest.request(Method.POST, "/users/");

		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}
}
