package org.espire.linkedlist;

public class SinglyLinkedList {

	// Generic type
//	public class ListNode1<T>{
//		private T data;
//		private ListNode1<T> next;
//	}
	// We have created data and reference part of singly linked list
	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to print the created linked list
	public static void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");

	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(9);
		ListNode fourth = new ListNode(15);

		// Now we will connect them together to form a chain
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		// calling method
		display();

	}

}
