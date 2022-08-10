package entities;

import java.io.Serializable;

import entities.enums.Gender;
import entities.interfaces.AdressI;
import entities.interfaces.WorkerI;

public class Worker extends Person implements Serializable, WorkerI {
	
	private Double salary;

	public Worker(String name, Integer birthYear, Gender gender, AdressI adress, Double Salary) {
		super(name, birthYear, gender, adress);
		this.salary = salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}	
	
}
