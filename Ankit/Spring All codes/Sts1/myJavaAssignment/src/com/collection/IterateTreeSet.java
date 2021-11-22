package com.collection;
//Write a Java program to iterate through all elements in a tree set. 
import java.util.Iterator;
import java.util.TreeSet;
public class IterateTreeSet {
	public static void main(String args[]) {
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Red");
		treeset.add("Yellow");
		treeset.add("Brown");
		treeset.add("White");
		
		//Iterate the tree set
		Iterator<String> iteratetree=treeset.iterator();
		System.out.println("Tree set :");
		while(iteratetree.hasNext()) {
			System.out.println(iteratetree.next());
		}
	}

}
