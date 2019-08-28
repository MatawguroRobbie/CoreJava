package com.ibm.training.javabootcamp.day03.example;

class Table_2 {
	synchronized void printTable(int n) { // method synchronized
		for(int i = 0; i <= 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class MyThread1_2 extends Thread {
	Table_2 t;
	MyThread1_2(Table_2 t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2_2 extends Thread {
	Table_2 t;
	MyThread2_2(Table_2 t) {
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table_2 obj = new Table_2(); //only one object
		MyThread1_2 t1 = new MyThread1_2(obj);
		MyThread2_2 t2 = new MyThread2_2(obj);
		t1.start();
		t2.start();
	}

}
