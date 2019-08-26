package com.ibm.training.javabootcamp.day05.examples.ex01;

import java.util.*;

public class ComparatorNyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StudentComparator> set = new TreeSet<>();
		set.add(new StudentComparator("Ann", 87));
		set.add(new StudentComparator("Bob", 83));
		set.add(new StudentComparator("Pat", 99));
		set.add(new StudentComparator("Dan", 25));
		set.add(new StudentComparator("Eve", 76));
		Iterator<StudentComparator> iter = set.iterator();

		while (iter.hasNext()) {
			StudentComparator s = iter.next();
			System.out.println(s.name + " " + s.score);
		}

	}

}
