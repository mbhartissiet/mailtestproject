package com.testscript;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutMethod {
	
	
	@Test
	public void putMethod(){
		RestAssured.baseURI="http://localhost:3000";
		Response responce = given().header("Content-Type","application/json").and().body("{" +
		    "\"id\": 2,"+
		    "\"title\": \"json-server-Againupdated\"," +
		    "\"author\": \"typicode-Againupdated\"," +
		"}").when().put("/posts/2").then().statusCode(200).and().log().all().extract().response();
		JsonPath jsXapth = new JsonPath(responce.asString());
		System.out.println("ID is "   + jsXapth.get("id"));
        
}
}
