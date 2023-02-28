package reqresCRUDOperation;


import static io.restassured.RestAssured.*;

import POJOClasses.Projectk;
import io.restassured.http.ContentType;

public class RajaDelux {
	public static void main(String[] args) {

	Projectk k=new Projectk("morpheus","leader");
	given()
	.body(k)
	.contentType(ContentType.JSON)
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201)
	.log()
	.all();
	
	}
}
