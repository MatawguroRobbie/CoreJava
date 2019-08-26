package com.ibm.training.javabootcamp.day02.exercise.ex01.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest extends Student {

	@Test
	void testCompareToEquals() {
		Student s1 = new Student();
		s1.setFirstName("Juan");
		s1.setLastName("dela Cruz");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("Juan");
		s2.setLastName("dela Cruz");
		s2.setAge(19);
		
		assertEquals(0, s1.compareTo(s2));
		assertEquals(0, s2.compareTo(s1));
	}
	
	@Test
	void testCompareToEqualsCaseInsensitive() {
		Student s1 = new Student();
		s1.setFirstName("Juan");
		s1.setLastName("dela Cruz");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("JUAN");
		s2.setLastName("DELA CRUZ");
		s2.setAge(19);
		
		assertEquals(0, s1.compareTo(s2));
		assertEquals(0, s2.compareTo(s1));
	}

	@Test
	void testCompareToNotEqual() {
		Student s1 = new Student();
		s1.setFirstName("Emilio");
		s1.setLastName("Aquinaldo");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("Andres");
		s2.setLastName("Bonifacio");
		s2.setAge(19);
		
		assertTrue(s1.compareTo(s2) < 0);
		assertTrue(s2.compareTo(s1) > 0);
	}
	
	@Test
	void testCompareToNotEqualButSameLastName() {
		Student s1 = new Student();
		s1.setFirstName("Antonio");
		s1.setLastName("Luna");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("Juan");
		s2.setLastName("Luna");
		s2.setAge(19);
		
		assertTrue(s1.compareTo(s2) < 0);
		assertTrue(s2.compareTo(s1) > 0);
	}
	
	@Test
	void testEqualsTrue() {
		Student s1 = new Student();
		s1.setFirstName("Juan");
		s1.setLastName("dela Cruz");
		s1.setAge(19);
		
		Student s2 = new Student();
		s2.setFirstName("Juan");
		s2.setLastName("dela Cruz");
		s2.setAge(19);
		
		assertTrue(s1.equals(s2));
		assertTrue(s2.equals(s1));
	}

}
