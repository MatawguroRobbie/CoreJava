package com.ibm.training.javabootcamp.day01.exercise.ex01.model;

import java.util.Arrays;

public class Student {

	// TODO: Add private instance attributes here
	private String firstName;
	private String lastName;
	private int age;
	private String school;
	private String[] hobbies;

	// TODO: Create constructor using first name, last name, age (in that order)
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// TODO: Add getters and setters for instance attributes
	// Hint: Source -> Generate Getters and Setters...
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	// TODO: Override toString to print out student details
	@Override
	public String toString( ) {
		
		// TODO: Implement logic here for printing details
		StringBuilder details = new StringBuilder();
		details.append("{firstName:")
			   .append(firstName)
			   .append(", ")
			   .append("lastName:")
			   .append(lastName)
			   .append(", ")
			   .append("age:")
			   .append(age)
			   .append(", ")
			   .append("hobbies:")
			   .append(Arrays.toString(hobbies))
			   .append("}");

		
		return details.toString();
		
	}
}
