package com.ibm.training.javabootcamp.day01.demo;

public class TestPrePostIncrementDecrement {

	public static void main(String[] args) {
		int i = 6;
		System.out.println("starting value of i is: " + i);
		i++;
		System.out.println("i++ gives you: " + i);
		++i;

		System.out.println("++i gives you: " + i + "\n");
		System.out.println("System.out.println(++i) will give you:");
		System.out.println(++i);

		System.out.println("\nbut System.out.println(i++) gives:");
		System.out.println(i++);
		System.out.println("why didn't it change?\n");
		System.out.println("but if we use System.out.println(i) now, it is:");
		System.out.println(i);

		System.out.println("\nSystem.out.println(--i) gives:");
		System.out.println(--i);

		System.out.println("\nWhat about System.out.println(i--) ?");
		System.out.println(i--);

		System.out.println("\nWhat is the value of i now? 9 or 8?");
	}

}
