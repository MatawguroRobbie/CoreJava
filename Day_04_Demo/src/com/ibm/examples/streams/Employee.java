package com.ibm.examples.streams;

public class Employee implements java.io.Serializable {
	public String name;
	public String address;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
