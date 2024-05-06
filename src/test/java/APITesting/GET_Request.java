package APITesting;

import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class GET_Request {

	@Test
	void getweltherDeatails() {
		
		
		
	// Specify base URI
		//RestAssured.baseURI = "https://reqres.in/api/{resource}";
	
	 RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	// Request object	
	RequestSpecification httpRequest= RestAssured.given();
	
	// Response object
	 io.restassured.response.Response response=httpRequest.request(Method.GET,"/Hyderabad");
	//Response response = httpRequest.request(Method.GET);

	// print response in console window
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	 
	}
	
}
