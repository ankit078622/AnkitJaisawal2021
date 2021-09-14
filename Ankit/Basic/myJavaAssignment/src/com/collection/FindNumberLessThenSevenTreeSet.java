package com.collection;
import java.util.Iterator;
//Write a Java program to find the numbers less than 7 in a tree set.
import java.util.NavigableSet;
import java.util.TreeSet;

//Write a Java program to find the numbers less than 7 in a tree set.
public class FindNumberLessThenSevenTreeSet {
	
	public static void main(String args[]) {
		NavigableSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(1);
		treeset.add(2);
		treeset.add(3);
		treeset.add(65);
		treeset.add(8);
		treeset.add(9);
		
		TreeSet number=(TreeSet)treeset.headSet(7);
		Iterator itr=number.iterator();
		while(itr.hasNext()) {
		System.out.println("Number less then 7 are : "+itr.next());
		}
		
	}

}
