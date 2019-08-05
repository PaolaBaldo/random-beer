package com.beer.randombeer;

import org.springframework.hateoas.Resource;
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
		@GetMapping("/beers/random")
		Resource<Beer> getRandom() throws BeerNotFoundException {
			
			Beer beer = repository.findRandomBeer();
			if(beer == null) {
				throw new BeerNotFoundException();
			}
				
			return new Resource<>(beer);
				
		}

		
	
}
