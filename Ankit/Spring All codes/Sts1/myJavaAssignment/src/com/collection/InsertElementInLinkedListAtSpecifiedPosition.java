package com.collection;
//5. Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertElementInLinkedListAtSpecifiedPosition {
	
	public static void main(String args[]) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Arvind");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Alok");
		linkedlist.add("Vinod");
		System.out.println("Linked list elements are : "+linkedlist);
		
		//Inserting element at specified position
		int index;
		System.out.print("\nWhat position do wnat to add element : ");
		Scanner userInput=new Scanner(System.in);
		index=userInput.nextInt();
		System.out.print("\nEnter the element name you want to add : ");
		String name=userInput.next();
		linkedlist.add(index,name);
		
		//Retrieving the element after insertion
		System.out.println("Linked list elements are after insertion of new element : "+linkedlist);
		
	}

}
