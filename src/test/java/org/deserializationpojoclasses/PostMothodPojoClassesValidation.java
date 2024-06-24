package org.deserializationpojoclasses;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostMothodPojoClassesValidation {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		Response res = RestAssured.given().body("")
		.when().post("/api/users").then().log().all().extract().response();
		
		

	}

}
