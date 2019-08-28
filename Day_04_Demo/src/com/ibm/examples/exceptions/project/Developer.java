package com.ibm.examples.exceptions.project;

public class Developer {
	
	private static int lastId = 0;
	private int id;
	private double workDays;
	private double workLoad;
	
	public Developer(double workDays, double workLoad) {
		id = ++lastId;
		this.workDays = workDays;
		this.workLoad = workLoad;
	}

	public void doWork() {
		if(workLoad / workDays > 1) {
			throw new IllegalArgumentException("More work assigned than dev " + id + " can handle.");
		} else {
			System.out.println("Dev " + id + " doing work.");
		}
	}
}
