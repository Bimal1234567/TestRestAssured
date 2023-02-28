package reqresCRUDOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SingleUserNotFound {

	public static void main(String[] args) {
     Response resp=   RestAssured.get("https://reqres.in/api/users/23");
    ValidatableResponse res= resp.then();
    res.log().all();
	}

}
