package com.ibm.training.javabootcamp.day05.examples.ex01;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> lista = new ArrayList<String>();
	       lista.add("Blue");
	       lista.add("Red");
	       lista.add("White");
	       lista.add("Yellow");
	       lista.add("Black");
	       System.out.println("These are the  " + lista.size() + " colors that the list have:\n");
	       Iterator<String> it = lista.iterator();
	       while(it.hasNext())
	        {
	          System.out.println("\t\t " + it.next());
	        }
	}

}
