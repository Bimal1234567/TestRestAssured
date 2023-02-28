package reqresCRUDOperation;

import POJOClasses.DataLib;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
;public class GetListUser {

	public static void main(String[] args) {
	     
		DataLib lib=new DataLib("Papu", "QA");
		given()
		.body(lib)
		.contentType(ContentType.JSON)
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log()
		.all();
		/*Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		ValidatableResponse response=res.then();
		response.log().all();*/
		
		
		

	}

}
