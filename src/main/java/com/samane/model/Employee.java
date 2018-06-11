package com.samane.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Empl")
public class Employee extends User{
	private double salary;
	
	public Employee() {
	}

	public Employee(String name, String surname , double salary) {
		super(name,surname);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
