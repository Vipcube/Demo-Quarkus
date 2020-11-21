package org.example.demo.quarkus.rest.service;

import lombok.Getter;
import org.example.demo.quarkus.rest.dto.Fruit;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * The fruit service.
 *
 * @author Brad Chen
 *
 */
@ApplicationScoped
public class FruitService {
	@Getter
	private final List<Fruit> fruits = new ArrayList<>();

	public FruitService(){
		fruits.add( Fruit.builder()
				.description( "Winter fruit" )
				.name( "Apple" )
				.build() );
		fruits.add( Fruit.builder()
				.description( "Tropical fruit" )
				.name( "Pineapple" )
				.build() );
	}
}
