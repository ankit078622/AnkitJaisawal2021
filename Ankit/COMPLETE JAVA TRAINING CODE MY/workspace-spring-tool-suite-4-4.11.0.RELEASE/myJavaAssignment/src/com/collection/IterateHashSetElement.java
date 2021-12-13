package com.collection;
//2. Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetElement {
	public static void main(String args[]) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ravinder");
		hashset.add("Sachin");
		hashset.add("Arvind");
		hashset.add("Rahul");
		hashset.add("Ruchir");
		hashset.add("Alok");
		hashset.add("Vinod");
		
		Iterator iterateset=hashset.iterator();
		System.out.println("Hash set element are : ");
		while(iterateset.hasNext()) {
			System.out.println(iterateset.next());
		}
	}

}
