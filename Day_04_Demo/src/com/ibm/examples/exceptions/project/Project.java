package com.ibm.examples.exceptions.project;

public class Project {

	public static void main(String[] args) {
		Client client = new Client(1000000D);
		
		client.orderJob();
	}

}
