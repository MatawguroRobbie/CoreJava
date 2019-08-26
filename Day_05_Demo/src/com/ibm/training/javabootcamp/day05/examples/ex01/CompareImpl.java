package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;

public class CompareImpl {
	public static void main(String args[]) {
		List<StudentComparator> list = new ArrayList<StudentComparator>();
		list.add(new StudentComparator("Ajay", 55));
		list.add(new StudentComparator("Vijay", 90));
		list.add(new StudentComparator("Sujay", 60));
		list.add(new StudentComparator("Ranajay", 99));
		Collections.sort(list);
		
		// Sorts array list
		for (StudentComparator a : list)
			// sorted name list
			System.out.print(a.getStudentName() + ", "); // Sorts the array
															// list|
														// using comparator
		Collections.sort(list, new StudentComparator());
		for (StudentComparator a : list)
			// sorted scores
			System.out.print(a.getStudentName() + "  : " + a.getStudentscore()
					+ ", ");
		//-----------------------------------------------------------------
		List<StudentComparator> list2 = new ArrayList<>();
		list2.add(new StudentComparator("Ajay", 55));
		list2.add(new StudentComparator("Vijay", 90));
		list2.add(new StudentComparator("Sujay", 60));
		list2.add(new StudentComparator("Ranajay", 99));
		
		Collections.sort(list2, new StudentComparator2());
		for (StudentComparator a : list2)
			// sorted scores
			System.out.print(a.getStudentName() + "  : " + a.getStudentscore()
					+ ", ");
		
	}
}