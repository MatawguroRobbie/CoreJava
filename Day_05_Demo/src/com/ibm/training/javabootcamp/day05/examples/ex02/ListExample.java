package com.ibm.training.javabootcamp.day05.examples.ex02;
import java.util.*;
/**
 * 
 * @author teacher
 * @version 2
 * 
 */
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> lista = new ArrayList<String>();
	       lista.add("Blue");
	       lista.add("Red");
	       lista.add("White");
	       lista.add("Yellow");
	       lista.add("Black");
	       List<String> strings = new ArrayList<String>();
	       for (String s : strings) {
	    	   System.out.println(s);
	       }
	       System.out.println("These are " + lista.size() + " colors that the list has:\n");
	       Iterator<String> it = lista.iterator();
	       while(it.hasNext())
	        {
	          System.out.println("\t\t " + it.next());
	        }
	}

}
