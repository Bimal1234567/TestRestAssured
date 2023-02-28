package reqresCRUDOperation;

import static org.testng.Assert.assertEquals;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import POJOClasses.DataUpdate;
import POJOClasses.UserLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUser {
	public static void main(String[] args) {
		
	DataUpdate obj=new DataUpdate("morpheus", "leader", new String[] {"java", "C"},"xyz","morpheus@xyz.com");
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201)
	.log()
	.all();

	
	}
	}
	
	
	

