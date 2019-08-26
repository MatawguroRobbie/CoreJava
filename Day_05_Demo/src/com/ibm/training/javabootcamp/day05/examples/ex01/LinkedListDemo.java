package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;

public class LinkedListDemo {
	public static void main(String args[]) {
		// Create a linked list
		LinkedList lnkList = new LinkedList();
		// Adding elements to the linked list
		lnkList.add("M");
		lnkList.add("I");
		lnkList.add("N");
		lnkList.add("D");
		lnkList.add("I");
		lnkList.addLast("A");
		lnkList.addFirst("I");
		lnkList.add(1, "B");
		System.out.println("The value of LinkedList: " + lnkList); // I, B, M, I, N, D, I, A -- > GDL
		 // I, B, M, I, N, D, I, A -- > DF
		// Remove first and last elements
		lnkList.removeFirst();
		lnkList.removeLast();
		System.out.println("Value after deleting first and last: "
		+ lnkList);  //  B, M, I, N, D, I, -- > GDL
			//  B, M, I, N, D, I, -- > DF
		}

}
