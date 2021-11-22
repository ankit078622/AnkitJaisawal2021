package com.collection;
//1. Write a Java program to append the specified element to the end of a linked list.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppendInLinkedList {

	public static void main(String args[]) {
		
		List<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Ravinder");
		linkedlist.add("Sachin");
		linkedlist.add("Rahul");
		linkedlist.add("Ruchir");
		linkedlist.add("Vinod");
		
		System.out.println("Linked list elements are : "+linkedlist);
	}
}
