package com.collection;
//6. Write a Java program to insert elements into the linked list at the first and last position.
import java.util.LinkedList;
import java.util.List;

public class InsertEleAtFirstAndLastPositionLinkedList {
	
	public static void main(String args[]) {
		List<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Arvind");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Alok");
		linkedlist.add("Vinod");
		
		//Before insertion of new element
		System.out.println("Linked list elements are : "+linkedlist);
		
		//adding element at first ad last position
		linkedlist.add(0, "Ankit");//first position
		linkedlist.add(8,"Sunil");//last position
		System.out.println("\nAfter inserting element at first and last position : "+linkedlist);
		
	}

}
