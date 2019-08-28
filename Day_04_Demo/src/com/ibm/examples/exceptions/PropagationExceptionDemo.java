package com.ibm.examples.exceptions;

public class PropagationExceptionDemo {
	void calculatePerUnitRate() {
		int qty = 25, rate = 0, punit = 0;
		punit = qty / rate;
	}

	void callPerUnitRate() {
		calculatePerUnitRate();
	}

	public static void main(String[] args) {
		PropagationExceptionDemo ur = new PropagationExceptionDemo();
		ur.callPerUnitRate();
	}
}
