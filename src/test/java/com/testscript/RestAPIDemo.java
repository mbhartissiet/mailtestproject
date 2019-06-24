package com.testscript;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RestAPIDemo {

	@Test
	 public void GetWeatherDetails(){
		/*RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);*/
		/*Response response=RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
		int code=response.getStatusCode();
		Assert.assertEquals(200, code);
		System.out.println(response.toString());
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));*/
		/*ValidatableResponse response = RestAssured.given().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").
				then().statusCode(200).log().all();*/
		RestAssured.baseURI="http://localhost:3000";
		given().contentType("application/jason").when().get("/posts/1").then().log().all();
		
	}
}
