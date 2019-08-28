package com.ibm.training.javabootcamp.day03.example;

public class DisplayMessage implements Runnable {

	private String message;
	
	public DisplayMessage(String message) {
		this.message = message;
	}
	
	public void run() {
		while(true) {
			System.out.println(message);
			try {
				Thread.sleep(2); // Added a delay here to try to not swamp the output
			} catch (InterruptedException e) {
				// Do nothing
			}
		}
	}

}
