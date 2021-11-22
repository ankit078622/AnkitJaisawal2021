package com.collection;

import java.util.HashSet;

//. Write a Java program to get the number of elements in a hash set.
public class SizeOfHashSet {

	public static void main(String args[]) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ravinder");
		hashset.add("Sachin");
		hashset.add("Arvind");
		hashset.add("Rahul");
		hashset.add("Ruchir");
		hashset.add("Alok");
		hashset.add("Vinod");
		
		System.out.println("HashSet Elements : "+hashset);
		System.out.println("Number of element in the hash set are : "+hashset.size());
	}
}
