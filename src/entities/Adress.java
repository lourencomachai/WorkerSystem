package entities;

import java.io.Serializable;

import entities.interfaces.AdressI;

public class Adress implements Serializable, AdressI{

	private String country;
	
	private String city;
	
	private Integer postalCode;
	
	
	public Adress(String country, String city, Integer postalCode) {
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
