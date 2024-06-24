package org.pojoclasses;

import io.restassured.response.Response;

public class Utilities {

	public static int getResponseCode(Response res) {
		return res.statusCode();
			}

	public static String getResponseBody(Response res) {
		return res.getBody().asString();
		

	}
}
