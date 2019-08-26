package com.ibm.training.javabootcamp.day05.examples.ex02;
import java.util.*;
/**
 * 
 * @author teacher
 * @version 2
 *
 */
public class SetInterfaceEx {
	public static void main(String[] args) {
		int a[] = { 5, 2, 9, 4, 1 , 10, 20, 21, 22, 31};
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++)
			hs.add(new Integer(a[i]));
		System.out.println(hs.size() + " The HashSet is " + hs);
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			lhs.add(new Integer(a[i]));
		System.out.println(hs.size() + " The LinkedHashSet is " + lhs);
		Set<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++)
			ts.add(new Integer(a[i]));
		System.out.println(hs.size() + " The TreeSet is " + ts);
	}
}
