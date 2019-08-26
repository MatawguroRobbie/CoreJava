package com.ibm.training.javabootcamp.day05.examples.ex01;

import java.util.*;

public class ArrayListvsLInkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(3));
		arrayList.add(0, new Integer(10));
		arrayList.add(3, new Integer(20));
		System.out.println(arrayList);// 10, 1 ,2 , 20 , 3
		LinkedList linkedList = new LinkedList(arrayList);
		System.out.println(linkedList);
		linkedList.add(1, "A");
		System.out.println(linkedList);
		linkedList.removeLast();
		linkedList.addFirst("B");
		System.out.println(linkedList); // B, A , 10, 1, 2, 20, --> DF
										// B, 10, A, 1, 2, 20 --> gdl

	}

}
