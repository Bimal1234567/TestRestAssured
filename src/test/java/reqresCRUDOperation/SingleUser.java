package reqresCRUDOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SingleUser {

	public static void main(String[] args) {
		 Response res=RestAssured.get("https://reqres.in/api/users/2");
		 ValidatableResponse response= res.then();
		 response.log().all();

	}

}
