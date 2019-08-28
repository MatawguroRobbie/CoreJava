package com.ibm.examples.exceptions;

public class ClassCastExceptionDemo {
	public static void main(String args[]) {
		Object ob = new Integer(10);
		// ClassCastException occurs
		System.out.println("The value is " + (String) ob);
	}

}
