package com.ibm.examples.exceptions;

public class WhyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int data = 10/0;
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("rest of the code...");
			
	}

}
