package com.ibm.training.javabootcamp.day01.demo;

import java.util.Scanner;

// This is a simple Java application

public class HelloName2 {
	
	Scanner input = new Scanner(System.in);
	String name;
	
	public static void main(String[] args) {
		new HelloName2().execute();
	}
	
	private void execute() {
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.println("Hello " + name + ". Welcome to Java.");
		input.close();
	}

}
