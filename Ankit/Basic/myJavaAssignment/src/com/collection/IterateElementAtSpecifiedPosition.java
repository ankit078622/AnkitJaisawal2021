package com.collection;
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateElementAtSpecifiedPosition {
	
	public static void main(String args[]) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Arvind");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Alok");
		linkedlist.add("Vinod");
		
		System.out.println("Linked list element are : "+linkedlist);
		
		//Here Iterating element starts from 2 position
		//First method
		System.out.println("\nIterating the element from second position : ");
		Iterator iterating=linkedlist.listIterator(2);
		while(iterating.hasNext()) {
			System.out.println(iterating.next());
		}
		
		//Here Iterating element starts from 1 position
	    //Second method
		System.out.println("\nIterating the element from first position position : ");
		for(int i=1;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
	}

}
