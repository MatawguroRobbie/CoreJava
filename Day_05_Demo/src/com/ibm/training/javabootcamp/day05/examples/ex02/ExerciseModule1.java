package com.ibm.training.javabootcamp.day05.examples.ex02;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ExerciseModule1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = 0;
		// Ask to the user how many string elements need to insert.
		System.out.println("How many elements do you want to insert?");
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Using the last variable store each string value in an ArrayList Object.
		ArrayList al = new ArrayList();
		for (int i = 0; i < n; i++) {
			try {
				System.out.printf("Insert the %d element: \t", i);
				al.add(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// The elements of the array list should be sorted, you can create another
		// Object to do that.
		TreeSet ts = new TreeSet(al);
		// Print the sorted list using an iterator.
		System.out.println("the elements sorted are:");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println("\t\t " + it.next());
		}

	}

}
