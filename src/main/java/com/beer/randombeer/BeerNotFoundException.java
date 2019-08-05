package com.beer.randombeer;

public class BeerNotFoundException extends RuntimeException {

	
	BeerNotFoundException() {
		super("Could not find random beer");
	}


}
