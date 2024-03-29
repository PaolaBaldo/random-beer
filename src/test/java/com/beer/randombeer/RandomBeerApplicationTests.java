package com.beer.randombeer;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomBeerApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	  private TestRestTemplate restTemplate;

	  @Test
	  public void corsWithAnnotation() throws Exception {
	    ResponseEntity<Beer> entity = this.restTemplate.exchange(
	        RequestEntity.get(uri("/beers/random")).header(HttpHeaders.ORIGIN, "http://localhost:8000").build(),
	        Beer.class);
	    assertEquals(HttpStatus.OK, entity.getStatusCode());
	  }
	  
	  private URI uri(String path) {
		    return restTemplate.getRestTemplate().getUriTemplateHandler().expand(path);
		  }

}
