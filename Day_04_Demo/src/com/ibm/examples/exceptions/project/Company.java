package com.ibm.examples.exceptions.project;

public class Company {

	private String name;
	private double budget;
	
	public Company(String name, double budget) {
		this.name = name;
		this.budget = budget;
		
	}
	
	
	public void doJob() {
		if (budget <= 0) {
			throw new IllegalArgumentException("Budget cannot be zero.");
		}
		
		Manager manager = new Manager(30, 60, 2);
		manager.assignWork();
	}
}
