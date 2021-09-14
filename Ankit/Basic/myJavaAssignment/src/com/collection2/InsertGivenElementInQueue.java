package com.collection2;
//Write a Java program to insert a given element into a priority queue.
import java.util.Iterator;
import java.util.PriorityQueue;

public class InsertGivenElementInQueue {

	public static void main(String args[]) {
		PriorityQueue<String> priorityqueue=new PriorityQueue<String>();
		//Adding color to queue
		priorityqueue.add("Reg");
		priorityqueue.add("Yellow");
		priorityqueue.add("Blue");
		priorityqueue.add("SkyBlue");
		
		System.out.println("Queue Elements : "+priorityqueue);
		
		//Adding new element
		priorityqueue.add("Green");
		System.out.println("After Inserting given element : "+priorityqueue);
		
		
	}
}
