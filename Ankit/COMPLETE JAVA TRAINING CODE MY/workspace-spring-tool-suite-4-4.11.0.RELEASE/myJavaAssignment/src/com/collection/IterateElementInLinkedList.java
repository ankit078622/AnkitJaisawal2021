package com.collection;
//2. Write a Java program to iterate through all elements in a linked list.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateElementInLinkedList {
	
	public static void main(String args[]) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Vinod");
		
		Iterator iterator1=linkedlist.iterator();
		while(iterator1.hasNext()) {
			System.out.println("Linked list element : "+iterator1.next());
		}
	}

}
