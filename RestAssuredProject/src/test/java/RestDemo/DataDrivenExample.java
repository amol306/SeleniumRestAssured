package RestDemo;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExample extends DataforTests {

	// @Test(dataProvider = "DataPost")
	public void test_1_post(String email, String first_name, String last_name, String avatar) {
		baseURI = "https://reqres.in/api/";
		JSONObject req = new JSONObject();
		req.put("email", email);
		req.put("first_name", first_name);
		req.put("last_name", last_name);
		req.put("avatar", avatar);
		System.out.println(req.toJSONString());
		given().header("Content-Type", "appliction/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(req.toJSONString()).when().post("/users").then().statusCode(201).log().all();
	}

	// @Test(dataProvider = "DataDelete")
	public void test_2_delete(int id) {
		baseURI = "https://reqres.in/api/";
		when().delete("/users/" + id).then().statusCode(204).log().all();
	}

	@Parameters({ "id" })
	@Test
	public void test_3_delete2(int id) {
		System.out.println("TestNG file value = " + id);
		baseURI = "https://reqres.in/api/";
		when().delete("/users/" + id).then().statusCode(204).log().all();
	}
}
