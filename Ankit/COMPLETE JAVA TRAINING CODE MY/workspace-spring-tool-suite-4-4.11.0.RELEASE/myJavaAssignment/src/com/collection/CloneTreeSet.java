package com.collection;
//Write a Java program to clone a tree set list to another tree set. 
import java.util.NavigableSet;
import java.util.TreeSet;

public class CloneTreeSet {
	public static void main(String args[]) {
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");

		System.out.println("TreeSet before clone : "+treeset);
		
		//After the clone
		TreeSet<String> treeset1=new TreeSet<String>();
		treeset1=(TreeSet)treeset.clone();
		System.out.println("After clone of the tree set"+treeset1);
	}

}
