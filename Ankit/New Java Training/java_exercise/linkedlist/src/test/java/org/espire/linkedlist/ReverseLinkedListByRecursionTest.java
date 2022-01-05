/**
 * 
 */
package org.espire.linkedlist;

import static org.junit.Assert.*;

import org.espire.linkedlist.ReverseLinkedListByRecursion.ListNode;
import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class ReverseLinkedListByRecursionTest {

	/**
	 * Test method for {@link org.espire.linkedlist.ReverseLinkedListByRecursion#reverseLinkedList(org.espire.linkedlist.ReverseLinkedListByRecursion.ListNode)}.
	 */
	@Test
	public void testReverseLinkedList() {
	
		ReverseLinkedListByRecursion linkedList = new ReverseLinkedListByRecursion();

		// Adding node in linkedlist
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(80);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);

		// Now connecting each node with each other
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		// Print the linked list
		System.out.println("Singly linked list before reverse:");
		linkedList.printLinkedList(linkedList.head);

		// Calling the reverse method
		ListNode reverseListNode = linkedList.reverseLinkedList(linkedList.head);

		// Printing the linked list after reverse
		System.out.println("\nSingly linked list after reverse:");
		linkedList.printLinkedList(reverseListNode);
	}

}
