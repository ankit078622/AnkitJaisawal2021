package com.collection2;
//. Write a Java program to add all the elements of a priority queue to another priority queue.
import java.util.PriorityQueue;

public class AddElementOneToAnotherPriorityQueue {
	
	public static void main(String args[]) {
		PriorityQueue<String> priorityqueue=new PriorityQueue<String>();
		//Adding color to queue
		priorityqueue.add("Reg");
		priorityqueue.add("Yellow");
		priorityqueue.add("Blue");
		priorityqueue.add("SkyBlue");
		//Printing 
		System.out.println("Old Priority Queue : "+priorityqueue);
		
		//Creating second priority queue
		PriorityQueue<String> newpriorityqueue=new PriorityQueue<String>();
		newpriorityqueue.addAll(priorityqueue);
		System.out.println("New priority queue : "+newpriorityqueue);//After copy from old queue to new queue
		
		
	}

}
