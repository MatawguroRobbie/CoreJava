package com.ibm.training.javabootcamp.day05.examples.ex02;
import java.util.*;

import com.ibm.training.javabootcamp.day05.examples.ex01.Student;
/**
 * @author teacher
 * @version 2
 * 
 */
public class TreeSetStudentExample {
	public static void main(String args[]) {
		SortedSet<Student> set = new TreeSet<Student>();
		set.add(new Student("Ann", 87));
		set.add(new Student("Bob", 83));
		set.add(new Student("Pat", 99));
		set.add(new Student("Dan", 25));
		set.add(new Student("Eve", 76));
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.name + " " + s.score);
		}
	}

}
