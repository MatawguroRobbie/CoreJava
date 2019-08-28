package com.ibm.examples.exceptions.project;

public class Client {

	double budget;
	
	public Client (double budget) {
		this.budget = budget;
	}

	public void orderJob() {
		Company company = new Company("IBM", budget);
		company.doJob();
	}
}
