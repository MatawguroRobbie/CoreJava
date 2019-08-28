package com.ibm.examples.exceptions;

public class UnitRate {

	public void calculatePerUnitRate() {
		// Arithmetic error occurred and passed
		int qty = 20, rate = 0, punit = 0;
		// to exception handler “ae”
		try {
			punit = qty / rate;
		} catch (ArithmeticException ae) {
			System.out
					.println("The product rate cannot be Zero, So Per Unit Rate Displayed Below is Invalid ");
		}
		System.out.println("The Per Unit Rate is = " + punit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitRate ur = new UnitRate();
		ur.calculatePerUnitRate();
	}

}
