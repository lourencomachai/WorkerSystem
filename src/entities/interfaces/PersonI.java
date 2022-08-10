package entities.interfaces;

import entities.enums.Gender;

public interface PersonI {
	
	void setName(String name);
	
	void setAdress(AdressI adress);
	
	void setBirthYear(Integer birthYear);
	
	void setGender(Gender gender);
	
	String getName();
	
	AdressI getAdress();
	
	Integer getBirthYear();
	
	Gender getGender();

}
