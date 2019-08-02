package com.beer.randombeer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BeerRepository extends JpaRepository<Beer, Long> {
	
	
	@Query(value="SELECT * FROM Beer ORDER BY RAND() LIMIT 1", nativeQuery = true)
	Beer findBeer();

}
