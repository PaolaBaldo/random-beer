package com.beer.randombeer;

public class BeerNotFoundException extends RuntimeException {

	BeerNotFoundException(Long id) {
		super("Could not find beer " + id);
	}
}
