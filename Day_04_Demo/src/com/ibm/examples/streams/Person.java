package com.ibm.examples.streams;

import java.io.Serializable;

class Person implements Serializable {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Student extends Person {
	String course;
	int fee;

	public Student(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}
}
