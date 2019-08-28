package com.ibm.training.javabootcamp.day03.example;

public class TestGarbage1 {

	public void finalize() {
		System.out.println("Object is garbage collected.");
	}
	
	public static void main(String args[]) {
		TestGarbage1 s1 = new TestGarbage1();
		TestGarbage1 s2 = new TestGarbage1();
		s2.hashCode();
		s1 = null;
		System.out.println("First gc call...");
		System.gc();
		// Try different sleep times and notice the effect on the garbage collection
		try {
			Thread.sleep(0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		s2 = null;
		System.out.println("Second gc call...");
		System.gc();
	}
}
