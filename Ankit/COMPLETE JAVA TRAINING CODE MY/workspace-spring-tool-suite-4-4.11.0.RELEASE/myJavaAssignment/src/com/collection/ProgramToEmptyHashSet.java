package com.collection;
//4. Write a Java program to empty an hash set.
import java.util.HashSet;
public class ProgramToEmptyHashSet {

	public static void main(String args[]) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ravinder");
		hashset.add("Sachin");
		hashset.add("Arvind");
		hashset.add("Rahul");
		hashset.add("Ruchir");
		hashset.add("Alok");
		hashset.add("Vinod");
		
		hashset.removeAll(hashset);
		
		System.out.println("HashSet is Empty : "+hashset);
		
		
		
	}
}
