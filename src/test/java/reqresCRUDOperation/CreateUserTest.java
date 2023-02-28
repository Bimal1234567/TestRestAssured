package reqresCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest{
	    @Test
    	public void createuser()
    	{
    		JSONObject obj=new JSONObject();
    		obj.put("name","morpheus");
    		obj.put("job","leader");
    		RequestSpecification request= RestAssured.given();
    		request.body(obj);
    		request.contentType(ContentType.JSON);
    		Response res=request.post("https://reqres.in/api/users");
    		System.out.println(res.getStatusCode());
    		ValidatableResponse response=res.then();
    		response.log().all();
    	}
    	
    	
	
	
	
}
