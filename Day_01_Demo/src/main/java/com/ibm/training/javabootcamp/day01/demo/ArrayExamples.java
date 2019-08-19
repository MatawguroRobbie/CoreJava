package com.ibm.training.javabootcamp.day01.demo;

public class ArrayExamples {

	public static void main(String[] args) {
		// declaration and instantiation
		int arr[] = new int[10];
		// initialization
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		// Print array
		for (int i = 0; i < arr.length; i++) // Length of array
			System.out.println(arr[i]);
	}

}
