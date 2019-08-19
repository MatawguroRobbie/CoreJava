package com.ibm.training.javabootcamp.day01.exercise.ex01.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void testConstructor() {
		String firstName = "Archie";
		String lastName = "Andrews";
		int age = 16;
		Student student = new Student(firstName, lastName, age);
		assertEquals(firstName, student.getFirstName());
		assertEquals(lastName, student.getLastName());
		assertEquals(age, student.getAge());
		assertTrue(student.getSchool() == null || student.getSchool().isEmpty());
		assertTrue(student.getHobbies() == null || student.getHobbies().length == 0);
	}
	
	@Test
	void testGettersAndSetters() {
		String firstName = "Veronica";
		String lastName = "Lodge";
		int age = 16;
		String school = "Riverdale High";
		String[] hobbies = {"Singing", "Dancing", "Shopping"};
		
		Student student = new Student("John", "Doe", 0);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setAge(age);
		student.setSchool(school);
		student.setHobbies(hobbies);
		
		assertEquals(firstName, student.getFirstName());
		assertEquals(lastName, student.getLastName());
		assertEquals(age, student.getAge());
		assertEquals(school, student.getSchool());
		assertArrayEquals(hobbies, student.getHobbies());
	}

	@Test
	void testToString() {
		String firstName = "Betty";
		String lastName = "Cooper";
		int age = 15;
		String[] hobbies = {"Writing", "Mechanics", "Cooking"};
		
		Student student = new Student(firstName, lastName, age);
		student.setHobbies(hobbies);
		
		String details = student.toString();
		assertTrue(details.contains(firstName));
		assertTrue(details.contains(lastName));
		assertTrue(details.contains(Integer.toString(age)));
		
		for (int i = 0; i < hobbies.length; i++) {
			assertTrue(details.contains(hobbies[i]));
		}
		
	}
}
