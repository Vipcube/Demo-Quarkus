package org.example.demo.quarkus.rest.controller;

import org.example.demo.quarkus.rest.service.FruitService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The rest controller of fruit.
 *
 * @author Brad Chen
 *
 */
@Path( "/fruits" )
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public class FruitController {
	private final FruitService fruitService;

	@Inject
	public FruitController( FruitService fruitService ){
		this.fruitService = fruitService;
	}

	/**
	 * Hello world.
	 *
	 * @return hello world
	 */
	@GET
	@Path( "/hello" )
	@Produces( MediaType.TEXT_PLAIN )
	public String hello() {
		return "hello";
	}

	/**
	 * Get fruits.
	 *
	 * @return fruits
	 */
	@GET
	public Response list() {
		return Response.ok( this.fruitService.getFruits() ).build();
	}
}
