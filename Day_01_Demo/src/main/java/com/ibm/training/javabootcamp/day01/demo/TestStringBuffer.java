package com.ibm.training.javabootcamp.day01.demo;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("StringBuffer objects ");
		// this will change the string
		sb.insert(0, "Test");
		// prints TestStringBufffer objects
		System.out.println(sb);
	}

}
