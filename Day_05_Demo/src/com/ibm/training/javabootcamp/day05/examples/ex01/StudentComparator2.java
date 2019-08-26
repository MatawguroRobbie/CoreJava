package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;
public class StudentComparator2 implements Comparator<StudentComparator> 
    {
	
	// Overriding the compare method to sort the score
	public int compare(StudentComparator s1, StudentComparator s2) {
		System.out.println("inside the compare method 2");
		return   s1.score - s2.score ;
	}
}
