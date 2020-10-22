package RestDemo;

import java.util.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_POST {

	@Test
	public void test_1_post() {
		// Map<String, Object> map = new HashMap<String, Object>();
		// map.put("name", "Amol");
		// map.put("job", "SE");
		// System.out.println(map);
		// JSONObject mapreq = new JSONObject(map);
		// System.out.println(mapreq.toJSONString());

		JSONObject req = new JSONObject();
		req.put("email", "email");
		req.put("first_name", "first_name");
		req.put("last_name", "last_name");
		req.put("avatar", "avatar");
		System.out.println(req.toJSONString());
		given().header("Content-Type", "appliction/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(req.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}

	@Test
	public void test_2_put() {
		JSONObject req = new JSONObject();
		req.put("email", "email");
		req.put("first_name", "first_name");
		req.put("last_name", "last_name");
		req.put("avatar", "avatar");
		System.out.println(req.toJSONString());
		given().header("Content-Type", "appliction/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(req.toJSONString()).when().put("https://reqres.in/api/users").then().statusCode(200).log().all();
	}

	@Test
	public void test_3_patch() {
		JSONObject req = new JSONObject();
		req.put("email", "email");
		req.put("first_name", "first_name");
		req.put("last_name", "last_name");
		req.put("avatar", "avatar");
		System.out.println(req.toJSONString());
		given().header("Content-Type", "appliction/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(req.toJSONString()).when().patch("https://reqres.in/api/users").then().statusCode(200).log()
				.all();
	}

	@Test
	public void test_4_delete() {
		when().delete("https://reqres.in/api/users/1").then().statusCode(204).log().all();
	}
}
