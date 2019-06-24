package com.testscript;


import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

public class PostMethod_JSON_Object {
	
	@Test
	public void getMethod() throws JSONException{
		JSONObject json = new JSONObject();
		int randomid = new Random().nextInt(1000);
		json.put("id", randomid);
		json.put("title", "myTitle" +randomid);
		json.put("author", "author"+randomid);
		RestAssured.baseURI="http://localhost:3000";
		
		given().
		header("Content-Type","application/json").and().
		body(json.toString()).when().
		post("/posts").then().statusCode(201).
		and().log().all();
		
	}

}
