package com.collection2;
//Write a Java program to count the number of elements in a priority queue.
import java.util.PriorityQueue;

public class CountNumberOfElementInPQueue {

	public static void main(String args[]) {
		
		PriorityQueue<String> countryQueue=new PriorityQueue<String>();
		countryQueue.add("India");
		countryQueue.add("UK");
		countryQueue.add("Singapur");
		countryQueue.add("London");
		countryQueue.add("Sri Lanka");
		
		//printing queue element number of element present in queue
		System.out.println("Queue Elements are : "+countryQueue+"\nNumber of element in queue : "+countryQueue.size());
		
	}
}
