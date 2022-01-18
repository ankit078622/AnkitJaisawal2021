package org.espire.linkedlist;


public class ReverseLinkedList {
	// We have created data and reference part of singly linked list
	public static ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to print the created linked list
	public static void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");

	}

	// Method to reverse the linked list
	public static ListNode reverse(ListNode head) {
	    ListNode current=head;
	    ListNode previous=null;
	    ListNode next=null;
	    while(current!=null) {
	    	next=current.next;
	    	current.next=previous;
	    	previous=current;
	    	current=next;
	    }
	    return previous;
	}

	public static void main(String[] args) {
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(9);
		ListNode fourth = new ListNode(15);

		// Now we will connect them together to form a chain
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		// calling method
		System.out.println("Singly linked list before reverse");
		display(head);
		//Calling reverse method
		ListNode reverseListHead=linkedList.reverse(head);
		System.out.println("\nSingly linked list after reverse");
		display(reverseListHead);

	}

}
