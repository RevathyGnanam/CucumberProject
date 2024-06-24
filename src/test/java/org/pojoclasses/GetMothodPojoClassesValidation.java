package org.pojoclasses;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMothodPojoClassesValidation extends Utilities {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://reqres.in";
		  Response res = RestAssured.given().queryParam("page", "2").
		when().get("/api/users")
		.then().log().all().extract().response();
		  System.out.println(getResponseCode(res));
		  
		  RootClass userdetails = res.as(RootClass.class);
		  //RootClass userdetails = mainrootclass.getRootclass();
		   //page Details
		   System.out.println(userdetails.getPage());
		   System.out.println(userdetails.getPer_page());
		   System.out.println(userdetails.getTotal());
		   System.out.println(userdetails.getTotal_pages());
		 //Data Details  
		 List<DataDetails> Data = userdetails.getData();
		 for (DataDetails listOfData : Data) {
			 System.out.println(listOfData.getId());
			 System.out.println(listOfData.getEmail());
			 System.out.println(listOfData.getFirst_name());
			 System.out.println(listOfData.getLast_name());
			 System.out.println(listOfData.getAvatar());	 
			
		}
		 //Support Details
		 System.out.println(userdetails.getSupport().getUrl());
		 System.out.println(userdetails.getSupport().getText());
		 
		 
		   
		   
		   

	}

}
