package com.ibm.training.javabootcamp.day01.demo;

public class TestStringImmutable {

	public static void main(String[] a) {
		String s = "Hello World";
		s.substring(0, 6);
		System.out.println("String s= " + s + "\nString s is immutable");
		// String is immutable;
		String s1 = s.substring(0, 6);
		System.out.println("string s1= " + s1);
	}
}
