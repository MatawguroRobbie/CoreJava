package com.ibm.training.javabootcamp.day03.example;

public class TestMyThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mth1 = new MyThread("IBM", "Hello");
		System.out.println("This threads name is: " + mth1.getName());
		mth1.start();
	}
}
