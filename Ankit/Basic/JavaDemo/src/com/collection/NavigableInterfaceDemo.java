package com.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

//Java code to demonstrate
//Adding of elements in
//NavigableSet
public class NavigableInterfaceDemo {

	public static void main(String args[]) {
		
		NavigableSet<String> treeset=new TreeSet<String>();
		
		//Element are added using add() method
		treeset.add("T");
		treeset.add("B");
		treeset.add("C");
		treeset.add("Z");
		treeset.add("Z");
		//treeset.add(null);//tree set does not allow you null values
		
		System.out.println(treeset);
	}
}
