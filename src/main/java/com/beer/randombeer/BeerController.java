package com.beer.randombeer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BeerController {
	
	private final BeerRepository repository;

	public BeerController(BeerRepository repository) {
		super();
		this.repository = repository;
	}
	
	
		
		@CrossOrigin(origins = "http://localhost:8000")
	    @GetMapping("beers/random")
	    public Beer getRandom() {
			try {
				Beer beer = repository.findRandomBeer();
		        return beer;
				
			}catch(BeerNotFoundException e) {
				e.getMessage();
			}
			return null;
	    }
		
	
}
