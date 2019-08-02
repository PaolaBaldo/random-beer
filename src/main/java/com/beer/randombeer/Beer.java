package com.beer.randombeer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String description;
	private double abv;
	private String breweryLocation;
	
	
	
	public Beer(String name, String description, double abv, String breweryLocation) {
		super();
		this.name = name;
		this.description = description;
		this.abv = abv;
		this.breweryLocation = breweryLocation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAbv() {
		return abv;
	}
	public void setAbv(double abv) {
		this.abv = abv;
	}
	public String getBreweryLocation() {
		return breweryLocation;
	}
	public void setBreweryLocation(String breweryLocation) {
		this.breweryLocation = breweryLocation;
	}
	
	

}