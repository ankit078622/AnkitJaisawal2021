package com.collection;
//. Write a Java program to convert a hash set to a List/ArrayList.
import java.util.ArrayList;
//. Write a Java program to convert a hash set to a List/ArrayList.
import java.util.HashSet;
import java.util.List;

public class CovertHashSetToArrayList {
	
	public static void main(String args[]) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ravinder");
		hashset.add("Sachin");
		hashset.add("Arvind");
		hashset.add("Rahul");
		hashset.add("Ruchir");
		hashset.add("Alok");
		hashset.add("Vinod");
		
		System.out.println("Hash Set Elements are : "+hashset);
		
		//Converting hashset to arraylist
		
		List<String> hashsetToArrayList=new ArrayList<String>(hashset);
		System.out.println("Array List : "+hashsetToArrayList);
	}

}
