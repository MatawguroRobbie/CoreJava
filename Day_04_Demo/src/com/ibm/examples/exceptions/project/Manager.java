package com.ibm.examples.exceptions.project;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	private double manDays;
	private int numberOfDevelopers;
	private double workDays;

	public Manager(double workDays, double manDays, int numberOfDevelopers) {
		this.manDays = manDays;
		this.numberOfDevelopers = numberOfDevelopers;
		this.workDays = workDays;
	}

	public void assignWork() {

		if(numberOfDevelopers < 1) {
			throw new IllegalArgumentException("Can't do work without developers.");
		}

		for (int i = 1; i <= numberOfDevelopers; i++) {
			Developer dev = new Developer(workDays, manDays/numberOfDevelopers);
			dev.doWork();
		}

	}
}
