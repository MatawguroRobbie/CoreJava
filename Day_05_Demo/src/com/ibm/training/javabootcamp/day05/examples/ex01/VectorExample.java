package com.ibm.training.javabootcamp.day05.examples.ex01;

import java.util.*;

public class VectorExample {
	public static void main(String args[]) {
		Vector v = new Vector(3, 4);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(new Integer(1));
		System.out.println("Capacity after 1 additions: " + v.capacity());
		v.addElement(new Integer(2));
		System.out.println("Capacity after 2 additions: " + v.capacity());
		v.addElement(new Integer(3));
		System.out.println("Capacity after 3 additions: " + v.capacity());
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions: " + v.capacity());
	}

}
