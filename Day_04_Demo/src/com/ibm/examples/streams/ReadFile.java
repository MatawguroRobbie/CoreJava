package com.ibm.examples.streams;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	FileInputStream fis;
	DataInputStream dis;
	BufferedInputStream bis;

	ReadFile() throws IOException {
		fis = new FileInputStream("ReadMe.txt");
		dis = new DataInputStream(fis);
		bis = new BufferedInputStream(dis);
	}

	public void readData() throws IOException {
		int no = bis.read();
		while (no != -1) {
			char val = (char) no;
			no = bis.read();
			if (val == '\n')
				System.out.println();
			else
				System.out.print(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile f;
		try {
			f = new ReadFile();
			f.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
