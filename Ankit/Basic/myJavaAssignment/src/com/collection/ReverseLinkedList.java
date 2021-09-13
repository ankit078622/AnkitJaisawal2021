package com.collection;
//4. Write a Java program to iterate a linked list in reverse order.
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	
	public static void main(String args[]) {
		
		List<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Arvind");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Alok");
		linkedlist.add("Vinod");
		
		//Iterate the linked list before reverse
		System.out.println("Linked list elements are before reverse : "+linkedlist);
		
		//Iterate the linked list in reverse order
		System.out.print("\nIterate the linked list in reverse order : ");
		for(int i=linkedlist.size()-1;i>=0;i--) {
			System.out.print("\t"+linkedlist.get(i));
		}
		
	}

}
