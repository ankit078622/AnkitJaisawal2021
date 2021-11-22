package com.collection;
/*  
 * PriorityQueue doesn’t permit null.
We can’t create PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering.
 If multiple elements are tied for least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, 
so java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from Abstract
 */
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String argss[]) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Rahul");
		queue.add("Vijay");
		queue.add("Karan");
		//queue.add(null);// not allowed null values
		System.out.println("head: "+queue.element());
		System.out.println("Head 1: "+queue.peek());/* Object peek() It is used to retrieves, but does not remove, the
											         * head of this queue, or returns null if this queue is empty.
											         * 
											         */
		System.out.println("Iterating the queue elements : ");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements");
		
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
