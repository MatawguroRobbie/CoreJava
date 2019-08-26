package com.ibm.training.javabootcamp.day02.exercise.ex01.model;

public class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	private int age;
	private String college;

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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public int compareTo(Student student) {
		int result = 0;

		/*
		 * TODO Implement logic that compares lastName first, then firstName if last
		 * names are the same. Comparison should be case insensitive
		 */

		return result;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;

		// TODO implement logic that compares firstName, lastName, age

		return result;
	}

	@Override
	public String toString() {

		StringBuilder details = new StringBuilder();
		details.append("{lastName:").append(lastName).append(", ").append("firstName:").append(firstName).append(", ")
				.append("age:").append(age).append(", ").append("college:").append(college).append("}");

		return details.toString();

	}
}
