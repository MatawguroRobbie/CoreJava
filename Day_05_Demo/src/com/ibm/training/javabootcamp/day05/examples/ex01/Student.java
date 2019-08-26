package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;

public class Student implements Comparable {
	public String name;
	public int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}	
	public int compareTo(Object o) throws ClassCastException {
//		if (o instanceof Student)
		return (name).compareTo(((Student) o).name);
		//	return score - ((Student)o).score;
//		else
//			throw new ClassCastException("Not a Student!");

	}
}
