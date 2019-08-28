package com.ibm.training.javabootcamp.day03.example;

public class MyThread extends Thread {

	private String name, msg;
	
	public MyThread(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}
	
	public void run() {
		System.out.println(name + " starts its execution.");
		for(int i = 0; i <= 5; i++) {
			System.out.println(name + " says: " + msg + " for " + i + " time/s.");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				// Do nothing
			}			
		}
		System.out.println(name + " finished execution.");
	}
}
