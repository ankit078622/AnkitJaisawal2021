package com.collection;

import java.util.HashSet;

//1.Write a Java program to append the specified element to the end of a hash set.
public class AppendInHashSet {

	public static void main(String args[]) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ravinder");
		hashset.add("Sachin");
		hashset.add("Arvind");
		hashset.add("Rahul");
		hashset.add("Ruchir");
		hashset.add("Alok");
		hashset.add("Vinod");
		hashset.add("A");
		hashset.add("B");
		
		System.out.println("Hash set element : "+hashset);
	}
}
