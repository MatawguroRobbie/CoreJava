package com.ibm.training.javabootcamp.day01.demo;

import java.util.Scanner;

// This is a simple Java application

public class HelloName {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hello " + name + ". Welcome to Java.");
		input.close();
	}

}
