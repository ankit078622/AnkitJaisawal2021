package com.collection;
//Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String args[]) {
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		//Printing treeset
		System.out.println("Tree Set :"+treeset);
	}

}
