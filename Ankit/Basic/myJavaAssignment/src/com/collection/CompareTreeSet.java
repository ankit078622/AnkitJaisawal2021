package com.collection;
// Write a Java program to compare two tree sets. 

import java.util.NavigableSet;
import java.util.TreeSet;

public class CompareTreeSet {
	
	public static void main(String args[]) {
		//First tree set
		NavigableSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		//Second tree set
		NavigableSet<String> treeset1=new TreeSet<String>();
		treeset1.add("Blue");
		treeset1.add("Yellow");
		treeset1.add("Red");
		treeset1.add("Yellow");
		treeset1.add("Brown");
		treeset1.add("White");
		
		System.out.println("First tree set : "+treeset);
		System.out.println("Second tree set : "+treeset1);
		
		//Comparing tree set
		System.out.println("Tree compairing : "+treeset.equals(treeset1));
		
		
	}

}
