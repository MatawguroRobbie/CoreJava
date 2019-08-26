package com.ibm.training.javabootcamp.day02.exercise.ex01;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.ibm.training.javabootcamp.day02.exercise.ex01.model.Student;
import com.ibm.training.javabootcamp.day02.exercise.ex01.model.StudentAgeComparator;

public class StudentApp {

	public static void main(String[] args) {
		new StudentApp().execute();
		
	}

	private void execute() {
		
		Student s1 = new Student();
		s1.setFirstName("Juan");
		s1.setLastName("Luna");
		s1.setAge(18);
		
		Student s2 = new Student();
		s2.setFirstName("Antonio");
		s2.setLastName("Luna");
		s2.setAge(19);
		
		Student s3 = new Student();
		s3.setFirstName("Jose");
		s3.setLastName("Rizal");
		s3.setAge(20);
		
		Student s4 = new Student();
		s4.setFirstName("Apolinario");
		s4.setLastName("Mabini");
		s4.setAge(21);

		Student s5 = new Student();
		s5.setFirstName("Emilio");
		s5.setLastName("Aguinaldo");
		s5.setAge(21);
		
		SortedSet<Student> nameSet = new TreeSet<Student>();
		nameSet.add(s1);
		nameSet.add(s2);
		nameSet.add(s3);
		nameSet.add(s4);
		nameSet.add(s5);
		Iterator<Student> iter = nameSet.iterator();
		System.out.println("Sorted by last name, first name");
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.toString());
		}
		
		SortedSet<Student> ageSet = new TreeSet<Student>(new StudentAgeComparator());
		ageSet.add(s1);
		ageSet.add(s2);
		ageSet.add(s3);
		ageSet.add(s4);
		ageSet.add(s5);
		Iterator<Student> ageIter = ageSet.iterator();
		System.out.println("Sorted by age ascending, last name, first name");
		while (ageIter.hasNext()) {
			Student s = ageIter.next();
			System.out.println(s.toString());
		}
	}
}
