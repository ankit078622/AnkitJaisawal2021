package com.collection2;
//Write a Java program to remove all the elements from a priority queue.
import java.util.PriorityQueue;
public class RemoveAllElementPriorityQueue {
	
	public static void main(String args[]) {
		PriorityQueue<String> priorityqueue=new PriorityQueue<String>();
		//Adding color to queue
		priorityqueue.add("Reg");
		priorityqueue.add("Yellow");
		priorityqueue.add("Blue");
		priorityqueue.add("SkyBlue");
		priorityqueue.add("Green");
		
		//Before remove all element
		System.out.println("Colors are : "+priorityqueue);
		
		//After remove all element
		priorityqueue.clear();		
		System.out.println("Colors: "+priorityqueue);
	}

}
