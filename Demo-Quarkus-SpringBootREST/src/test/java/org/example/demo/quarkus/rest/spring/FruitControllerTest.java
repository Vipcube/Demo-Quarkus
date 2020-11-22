package org.example.demo.quarkus.rest.spring;

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
			.body( "$.size()", is( 2 ),
					"[0].name", is( "Apple" ),
					"[0].description", is( "Winter fruit" ),
					"[1].name", is( "Pineapple" ),
					"[1].description", is( "Tropical fruit" ) );
	}
}
