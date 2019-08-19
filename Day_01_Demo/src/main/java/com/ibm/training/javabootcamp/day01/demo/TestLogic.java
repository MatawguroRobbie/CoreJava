package com.ibm.training.javabootcamp.day01.demo;

public class TestLogic {

	public static void main(String[] args) {
		int a, b;
		a = 1;
		b = 2;
		if (a == 1 && b == 1) {
			System.out.println("Value of a=1 and b=1");
		} else if (a == 1 || b == 1) {
			System.out.println("Value of either of a or b is 1");
		}
	}

}
