package com.collection;
//5. Write a Java program to test a hash set is empty or not.
import java.util.HashSet;

public class TestHashSetIsEmptyOrNot {

	public static void main(String args[]) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("India");
		hashset.add("UK");
		hashset.add("Singapur");
		hashset.add("London");
		hashset.add("Sri Lanka");
		
		//Print the HashSet
		System.out.println("HashSet : "+hashset);
		
		//Cheking HashSet is empty or not
		System.out.println("Is HashSet empty : "+hashset.isEmpty());
		
		
		hashset.clear();//clearing all element from hashset
		//Cheking HashSet is empty or not
		System.out.println("Is HashSet empty : "+hashset.isEmpty());
	}
}
