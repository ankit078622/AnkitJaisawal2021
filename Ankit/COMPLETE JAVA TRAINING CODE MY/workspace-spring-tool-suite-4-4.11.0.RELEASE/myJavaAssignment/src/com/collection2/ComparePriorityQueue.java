package com.collection2;

import java.util.PriorityQueue;

public class ComparePriorityQueue {

	public static void main(String args[]) {
		//First queue
		PriorityQueue<String> countryQueue=new PriorityQueue<String>();
		countryQueue.add("India");
		countryQueue.add("UK");
		countryQueue.add("Singapur");
		countryQueue.add("London");
		countryQueue.add("Sri Lanka");
		//Printing first queue
		System.out.println("First Queue is : "+countryQueue);
		
		//Second queue
		PriorityQueue<String> countryQueue1=new PriorityQueue<String>();
		countryQueue1.add("India");
		countryQueue1.add("UK");
		countryQueue1.add("Singapur");
		countryQueue1.add("London");
		countryQueue1.add("Sri Lanka");
		//Second queue
		System.out.println("Second queue is : "+countryQueue1);
		
		//Comparing
		System.out.println("\nCompairision queue result : "+countryQueue.containsAll(countryQueue1));
		
		//Comparing  single-2 element
		System.out.println("\nCompairing queue results : ");
		for(String element:countryQueue) {
			System.out.println(countryQueue1.contains(element));
		}
		
		
	}
}
