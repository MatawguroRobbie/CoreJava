package com.ibm.examples.exceptions;

public class CustomExceptionTest {
	
	public static void main(String[] a){ 
		try{ CustomExceptionTest.getMessage(null); 
		} 
		catch(MyCustomException e){ 
			System.out.println("Inside catch block: "+e.getMessage()); 
			} 
	} 

	private static void getMessage(String message) throws MyCustomException{ 
		if(message == null){ 
			throw new MyCustomException("Null message.");
			} 
	} 
}
