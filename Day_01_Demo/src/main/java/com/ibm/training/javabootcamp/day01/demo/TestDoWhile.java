package com.ibm.training.javabootcamp.day01.demo;

// This is a simple Java application

public class TestDoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			System.out.println(i + " squared is " + (i * i));
			i++;
		} while (i < 10);
	}
	
}