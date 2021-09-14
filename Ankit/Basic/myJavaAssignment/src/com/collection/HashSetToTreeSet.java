package com.collection;
//Write a Java program to convert a hash set to a tree set.
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String args[]) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Red");
		hashset.add("Blue");
		hashset.add("Yellow");
		hashset.add("White");
		hashset.add("Black");
		
		System.out.println("Hash Set Elements are : "+hashset);
		
		TreeSet<String> hashsetTotreeset=new TreeSet<String>(hashset);
		System.out.println("Tree Set Elements are : "+hashsetTotreeset);
	}
}
