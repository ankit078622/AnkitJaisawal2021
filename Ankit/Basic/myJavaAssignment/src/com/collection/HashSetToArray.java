package com.collection;
// Write a Java program to convert a hash set to an array.

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String args[]) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("India");
		hashset.add("UK");
		hashset.add("Singapur");
		hashset.add("London");
		hashset.add("Sri Lanka");
		
		System.out.println("Hash set elements are : "+hashset);
		
		//Converting hashset to array
		Object array[]=hashset.toArray();
		
		//Printing array
		System.out.println("Array elements are :");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
}
