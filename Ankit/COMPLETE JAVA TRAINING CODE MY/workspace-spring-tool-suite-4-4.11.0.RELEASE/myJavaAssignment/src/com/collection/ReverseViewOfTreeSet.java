package com.collection;
//Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.NavigableSet;
import java.util.TreeSet;

public class ReverseViewOfTreeSet {
	public static void main(String args[]) {
		NavigableSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		//Before reverse
		System.out.println("Before Reverse : "+treeset);
		//After reverse	
		NavigableSet<String> reverseTree=treeset.descendingSet();
		System.out.println("After reverse : "+reverseTree);
		
	}

}
