package com.ibm.training.javabootcamp.day01.demo.employeeapp;

import java.util.Scanner;

public class EmployeeApp {

	static private final int MAX_SIZE = 5;
	
	private Scanner input;
	private Employee[] employees = new Employee[MAX_SIZE];
	private int size = 0;

	public static void main(String[] args) {
		new EmployeeApp().execute();

	}

	private void execute() {
		input = new Scanner(System.in);

		boolean exit = false;

		do {
			System.out.println("[A]dd Employee, [L]ist Employees, or [Enter] to exit.");
			System.out.print("Option: ");
			String option = input.nextLine();

			switch (option.toUpperCase()) {
				case "A":
					addEmployee();
					break;
				case "L":
					listEmployees();
					break;
				default:
					exit = true;
			}

		} while (!exit);
		
		System.out.println("Bye!");
		input.close();

	}

	private void addEmployee() {
		if (size < MAX_SIZE) {
			System.out.println("Adding employee No." + (size + 1) + "...");
			Employee employee = new Employee();
			System.out.print("Enter First Name : ");
			employee.setFirstName(input.nextLine());			
			System.out.print("Enter Last Name  : ");
			employee.setLastName(input.nextLine());			
			employees[size++] = employee;
		} else {
			System.out.println("Max number of employees [" + MAX_SIZE + "] has been reached");
		}
	}

	private void listEmployees() {
		if (size == 0) {
			System.out.println("No employees entered");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println((i+1) + ": " + employees[i].printFullNameReversed());
			}
		}
		
	}

}
