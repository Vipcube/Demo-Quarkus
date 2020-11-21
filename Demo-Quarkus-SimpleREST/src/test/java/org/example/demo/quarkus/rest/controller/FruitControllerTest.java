package org.example.demo.quarkus.rest.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * The unit test of FruitController.
 *
 * @author Brad Chen
 *
 */
@QuarkusTest
public class FruitControllerTest {
	@Test
	public void testHelloEndpoint() {
		given()
			.when().get("/fruits/hello")
			.then()
			.statusCode(200)
			.body( is("hello") );
	}

	@Test
	public void testFruitsEndpoint() {
		given()
			.when().get("/fruits")
			.then()
			.statusCode(200)
			.body( is("[{\"name\":\"Apple\",\"description\":\"Winter fruit\"},{\"name\":\"Pineapple\",\"description\":\"Tropical fruit\"}]" ) );
	}
}
