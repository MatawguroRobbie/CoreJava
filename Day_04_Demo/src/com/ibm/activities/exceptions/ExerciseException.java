package com.ibm.activities.exceptions;

public class ExerciseException {
	public static void main(String[] args) {
		try {
			happy1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void happy1() throws Exception {
		happy2();
	}

	public static void happy2() throws Exception {
		happy3();
	}

	public static void happy3() throws Exception {
		throw new Exception("Be Happy Exception Prevents U!");
	}
}
