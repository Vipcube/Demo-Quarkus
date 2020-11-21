package org.example.demo.quarkus.rest.dto;

import lombok.Builder;
import lombok.Data;

/**
 * The DTO of fruit.
 *
 * @author Brad Chen
 *
 */
@Data
@Builder
public class Fruit {
	public String name;
	public String description;
}
