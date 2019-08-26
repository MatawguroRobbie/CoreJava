package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hashSet = new HashSet();
		hashSet.add("Yellow");
		hashSet.add("White ");
		hashSet.add("Green");
		hashSet.add("Orange");
		System.out.println("An unsorted set of strings");
		System.out.println(hashSet + "\n");
		SortedSet treeSet = new TreeSet();
		treeSet.addAll(hashSet);
		System.out.println("An sorted set of strings");
		System.out.println(treeSet + "\n");
	}

}
