package com.ibm.training.javabootcamp.day02.exercise.ex01.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentAgeComparatorTest {

	StudentAgeComparator comparator;
	
	@BeforeEach
	void setUp() throws Exception {
		comparator = new StudentAgeComparator();
	}

	@Test
	void testCompareDifferentAge() {
		Student s1 = new Student();
		s1.setFirstName("Juan");
		s1.setLastName("Luna");
		s1.setAge(18);
		
		Student s2 = new Student();
		s2.setFirstName("Antonio");
		s2.setLastName("Luna");
		s2.setAge(19);
		
		assertTrue(comparator.compare(s1, s2) < 0);
		assertTrue(comparator.compare(s2, s1) > 0);
	}

	@Test
	void testCompareSameAge() {
		Student s1 = new Student();
		s1.setFirstName("Jose");
		s1.setLastName("Rizal");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("Antonio");
		s2.setLastName("Luna");
		s2.setAge(19);
		
		assertTrue(comparator.compare(s1, s2) > 0);
		assertTrue(comparator.compare(s2, s1) < 0);
	}
}
