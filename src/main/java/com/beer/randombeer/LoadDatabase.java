package com.beer.randombeer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(BeerRepository repository) {
		return args -> {
			repository.save(new Beer("Toppling Goliath Kentucky Brunch", "This beer is the real McCoy. Barrel aged and crammed with coffee, none other will stand in it’s way. Sought out for being delicious, it is notoriously difficult to track down. If you can find one, shoot to kill, because it is definitely wanted... dead or alive.", 12.0, "Decorah, Iowa, United States"));
			repository.save(new Beer("Westvleteren 12 (XII)", "Westvleteren has the smallest output of the Trappist breweries, with only a small part of their production available outside of Belgium.", 10.2, "Westvleteren, Belgium"));
			repository.save(new Beer("Boréale IPA du Nord-Est", "Épisode 4. Non, notre maître brasseur n’est pas devenu mégalo! Bien au contraire, avec ce nouvel Épisode, c’est en toute humilité qu’il souhaite nous faire découvrir sa dernière création houblonnée : une IPA du Nord-Est.\n" + 
					"Prenez une grande inspiration, car cette nouvelle IPA va vous faire voyager! \n" + 
					"", 6.0, "Blainville, Quebec, Canada"));
			repository.save(new Beer("Cigar City Hunahpu's Imperial Stout - Double Barrel Aged", "50% aged in Rum barrels, 50% aged in Apple Brandy barrels", 11.0, "Tampa, Florida, United States"));
			repository.save(new Beer("Three Floyds Dark Lord - Bourbon Barrel Aged", "Dark Lord aged in a variety of Bourbon barrels including Woodford Reserve and Heaven Hill. \n" + 
					"", 15.0, "Munster, Indiana, United States\n" + 
					""));
			repository.save(new Beer("Russian River Pliny the Younger", "Pliny the Younger was Pliny the Elder’s nephew, in the case of this beer, the \"Younger\" is a triple IPA. Pliny the Younger is hopped three times more than our standard IPA, and is dry hopped four different times.", 11.0, "\n" + 
					"Santa Rosa, California, United States"));
			
		};
	}
}
