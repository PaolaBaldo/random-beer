package com.beer.randombeer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(BeerRepository repository) {
		return args -> {
			repository.save(new Beer("bud", "bud", 0, "bud"));
			repository.save(new Beer("bud2", "bud2", 0, "bud2"));
		};
	}
}
