package com.ibm.training.javabootcamp.day01.demo;

import java.util.Scanner;

public class TestTernaryCondition {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		a = input.nextInt();
		
		b = (a == 1) ? 20: 30; 
		System.out.println( "Value of b is : " +  b );
		
		c = (a == 10) ? 20: 30; 
		System.out.println( "Value of c is : " + c );
		
		input.close();
	}

}
