package com.collection;
//Write a Java program to get the first and last elements in a tree set. 
import java.util.NavigableSet;
import java.util.TreeSet;

public class FirstAndLastElementInTreeSet {
	
	public static void main(String args[]) {
		NavigableSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		Object firstelement=treeset.first();
		Object lastelement=treeset.last();
		System.out.println("First Element : "+firstelement+"\nLast Element : "+lastelement);
	}

}
