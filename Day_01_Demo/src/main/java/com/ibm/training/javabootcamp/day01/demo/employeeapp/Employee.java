package com.ibm.training.javabootcamp.day01.demo.employeeapp;

public class Employee {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String printFullName() {
		return firstName + " " + lastName;
	}
	
	public String printFullNameReversed() {
		return lastName.toUpperCase() + ", " + firstName;
	}
	
}
