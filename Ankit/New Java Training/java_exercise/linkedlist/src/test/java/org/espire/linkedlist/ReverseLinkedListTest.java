package org.espire.linkedlist;

import static org.junit.Assert.*;

import org.espire.linkedlist.ReverseLinkedList.ListNode;
import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void testReverseSinglyLinkedList() {
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.head = new ListNode(10);
		linkedList.head.next = new ListNode(8);
		linkedList.head.next.next = new ListNode(48);
		linkedList.head.next.next.next = new ListNode(63);
		// calling method
		System.out.println("Singly linked list before reverse");
		linkedList.display(linkedList.head);
		// Calling reverse method
		ListNode reverseListHead = linkedList.reverse(linkedList.head);
		System.out.println("\nSingly linked list after reverse");
		linkedList.display(reverseListHead);

	}

}
