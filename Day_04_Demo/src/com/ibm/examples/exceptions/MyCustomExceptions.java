package com.ibm.examples.exceptions;

class MyCustomException extends Exception {
	private String message = null;
	
	public MyCustomException () {
		super();
	}
	
	public MyCustomException (String message) {
		super(message);
		this.message = message;
	}
	public MyCustomException(Throwable cause) {
		super(cause);
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	@Override
	public String getMessage() {
		 return message;
	}
	
}


