package com.collection2;
//Write a Java program to iterate through all elements in priority queue. 
import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratePriorityQueue {
	
	public static void main(String args[]) {
		PriorityQueue<String> priorityqueue=new PriorityQueue<String>();
		//Adding clor to queue
		priorityqueue.add("Reg");
		priorityqueue.add("Yellow");
		priorityqueue.add("Blue");
		priorityqueue.add("SkyBlue");
		
		//Iterate all the colors
		Iterator iterate=priorityqueue.iterator();
		System.out.println("Colors are : ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

}
