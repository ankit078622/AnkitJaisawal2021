package com.collection;
//Write a Java program to get the number of elements in a tree set.
import java.util.NavigableSet;
import java.util.TreeSet;
public class GetNumberOfElementInTreeSet {
	
	public static void main(String args[]) {
		NavigableSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		System.out.println("Tree set Elements are : "+treeset+"\n Size of treeset is : "+treeset.size());

	}

}
