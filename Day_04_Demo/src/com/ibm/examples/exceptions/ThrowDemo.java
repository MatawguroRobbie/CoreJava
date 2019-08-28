package com.ibm.examples.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowDemo {
	public double divide(int dividend, int divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("Divide by 0 error");
		}
		return dividend / divisor;
	}

	public void sample() throws IOException, SQLException {
		// Statements
		// if (somethingWrong)
		IOException e = new IOException();
		throw e;
//		SQLException e2 = new SQLException();
//		throw e2;
		// More Statements
	}

}
