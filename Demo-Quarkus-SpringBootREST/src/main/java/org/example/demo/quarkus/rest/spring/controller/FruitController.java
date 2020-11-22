package org.example.demo.quarkus.rest.spring.controller;

import org.example.demo.quarkus.rest.spring.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

/**
 * The rest controller of fruit.
 *
 * @author Brad Chen
 *
 */
@RestController
@RequestMapping( "/fruits" )
public class FruitController {
	private final FruitService fruitService;

	@Autowired
	public FruitController( FruitService fruitService ){
		this.fruitService = fruitService;
	}

	/**
	 * Hello world.
	 *
	 * @return hello world
	 */
	@GetMapping( value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE )
	public String hello() {
		return "hello";
	}

	/**
	 * Get fruits.
	 *
	 * @return fruits
	 */
	@GetMapping( value = "/", produces = MediaType.APPLICATION_JSON_VALUE )
	public Response list() {
		return Response.ok( this.fruitService.getFruits() ).build();
	}
}
