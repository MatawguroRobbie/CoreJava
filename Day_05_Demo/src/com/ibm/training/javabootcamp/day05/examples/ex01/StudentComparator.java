package com.ibm.training.javabootcamp.day05.examples.ex01;

import java.util.*;

public class StudentComparator implements Comparator<StudentComparator>, Comparable<StudentComparator> {
	public String name;
	public int score;

	StudentComparator() {
	}

	StudentComparator(String n, int a) {
		name = n;
		score = a;
	}

	public String getStudentName() {
		return name;
	}

	public int getStudentscore() {
		return score;
	}

	// Overriding the compareTo method
	public int compareTo(StudentComparator d) {
		System.out.println("inside the compareTo method");
		return (d.name).compareTo(this.name);
	}

	// Overriding the compare method to sort the score
	public int compare(StudentComparator s1, StudentComparator s2) {
		System.out.println("inside the compare method");
		return s2.score - s1.score;
	}
}
