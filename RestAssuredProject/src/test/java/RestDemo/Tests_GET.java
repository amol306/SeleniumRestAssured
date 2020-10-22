package RestDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Tests_GET {

	@Test
	public void test_1() {
		// Tp print entire JSON response on console
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();

		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8))
				.body("data.first_name", hasItems("Rachel", "George"));

		// given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]",
		// equalTo(8))
		// .body("data.first_name", hasItems("Rachel", "GeorgeAmol"));
	}
}
