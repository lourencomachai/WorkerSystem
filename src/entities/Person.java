package entities;

import java.io.Serializable;

import entities.enums.Gender;

import entities.interfaces.PersonI;

import entities.interfaces.AdressI;

public abstract class Person implements Serializable, PersonI{
	
	private String name;
	
	private Integer birthYear;
	
	private Gender gender;
	
	private AdressI adress;

	
	public Person(String name, Integer birthYear, Gender gender, AdressI adress) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public AdressI getAdress() {
		return adress;
	}

	public void setAdress(AdressI adress) {
		this.adress = adress;
	}
	
}
