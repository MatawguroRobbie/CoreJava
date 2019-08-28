package com.ibm.examples.streams;

import java.io.IOException;

public class StreamExample {
	public static void main(String[] args) {
		System.out.println("simple message");
		System.err.println("error message");
		
		
		int i;
		try {
			i = System.in.read();
			//returns ASCII code of 1st character  
			System.out.println((char)i);
			//will print the character  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
