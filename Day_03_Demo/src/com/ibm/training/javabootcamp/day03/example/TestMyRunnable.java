package com.ibm.training.javabootcamp.day03.example;

public class TestMyRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable myrun = new MyRunnable("IBM","Hello");
		Thread mythread = new Thread(myrun);
		mythread.start();
	}

}
