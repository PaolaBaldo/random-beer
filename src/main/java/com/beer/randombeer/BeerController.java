package com.beer.randombeer;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BeerController {
	
	private final BeerRepository repository;

	public BeerController(BeerRepository repository) {
		super();
		this.repository = repository;
	}
	
	// tag::get-single-item[]
		@GetMapping("/beers/{id}")
		Resource<Beer> one(@PathVariable Long id) {
			
			Beer beer = repository.findById(id)
				.orElseThrow(() -> new BeerNotFoundException(id));
			
			return new Resource<>(beer,
				linkTo(methodOn(BeerController.class).one(id)).withSelfRel());
				//linkTo(methodOn(BeerController.class).all()).withRel("beers"));
		}
		// end::0get-single-item[]
		
		/*@GetMapping("/beers/random")
		Resource<Beer> getRandom() {
			
			Beer beer = repository.findBeer();
				
			
			return new Resource<>(beer,
				linkTo(methodOn(BeerController.class).getRandom()).withSelfRel());
				//linkTo(methodOn(BeerController.class).all()).withRel("beers"));
		}*/
		
		@CrossOrigin(origins = "http://localhost:8000")
	    @GetMapping("beers/random")
	    public Beer getRandom() {
	        System.out.println("==== in Beer ====");
	        Beer beer = repository.findBeer();
	        return beer;
	    }
		
	
}
