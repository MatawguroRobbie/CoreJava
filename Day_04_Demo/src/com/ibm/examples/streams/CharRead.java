package com.ibm.examples.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char c = (char) br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Reading character
	}

}
