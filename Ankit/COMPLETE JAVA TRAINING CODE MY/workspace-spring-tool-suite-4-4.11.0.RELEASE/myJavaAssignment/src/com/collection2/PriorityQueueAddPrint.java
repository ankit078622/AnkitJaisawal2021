package com.collection2;
//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueAddPrint {
	
	public static void main(String args[]) {
		PriorityQueue<String> priorityqueue=new PriorityQueue<String>();
		//Adding clor to queue
		priorityqueue.add("Reg");
		priorityqueue.add("Yellow");
		priorityqueue.add("Blue");
		priorityqueue.add("SkyBlue");
		
		//Printing color 
		System.out.println("The colors are : "+priorityqueue);
		}

}
