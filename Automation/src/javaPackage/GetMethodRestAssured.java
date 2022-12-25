package javaPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethodRestAssured {
	
	@Test
	
	public void getDetails() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification  httprequest = RestAssured.given();
		Response resp = httprequest.request(Method.GET,"");
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.prettyPrint());
		
		Headers allheaders = resp.headers();
		for(Header hd:allheaders ) {
			System.out.println(hd.getName() +" : "+hd.getValue());
		}
		
		
	}

}
