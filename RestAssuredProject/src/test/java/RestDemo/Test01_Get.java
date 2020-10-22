package RestDemo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_Get {

	@Test
	void test_01() {
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println("res.getStatusCode() : " + res.getStatusCode());
		System.out.println("res.getStatusLine() : " + res.getStatusLine());
		System.out.println("res.getBody() : " + res.getBody().asString());
		System.out.println("res.asString(); : " + res.asString());
	}

	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));
		// given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",
		// equalTo(701));
	}
}
