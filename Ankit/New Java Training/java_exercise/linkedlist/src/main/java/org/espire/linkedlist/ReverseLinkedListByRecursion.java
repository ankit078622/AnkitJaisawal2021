package org.espire.linkedlist;

import java.awt.List;

public class ReverseLinkedListByRecursion {

	public static ListNode head;

	public static class ListNode {
		public Integer data;
		public ListNode next;

		public ListNode(Integer data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * For displaying the linked list
	 * 
	 * @param head
	 */
	public void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print("null");

	}

	public ListNode reverseLinkedList(ListNode head) {
		if (head == null) {
			return head;
		}
		// If only one node in linked list
		if (head.next == null) {
			return head;
		}
		ListNode newHead = reverseLinkedList(head.next);
		// Changing the reference for middle chain
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	/**
	 * Creating the main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseLinkedListByRecursion linkedList = new ReverseLinkedListByRecursion();

		// Adding node in linkedlist
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(80);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);

		// Now connecting each node with each other
		head.next = second;
		second.next = third;
		third.next = fourth;

		// Print the linked list
		System.out.println("Singly linked list before reverse:");
		linkedList.printLinkedList(head);

		// Calling the reverse method
		ListNode reverseListNode = linkedList.reverseLinkedList(head);

		// Printing the linked list after reverse
		System.out.println("\nSingly linked list after reverse:");
		linkedList.printLinkedList(reverseListNode);

	}
}
