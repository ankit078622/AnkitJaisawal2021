package org.espire.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedToBinaryTreeTest {

	@Test
	public void testSortedListToBinarySearchTree() {
		DoublyLinkedListNode node1 = new DoublyLinkedListNode(1);
		DoublyLinkedListNode node2 = new DoublyLinkedListNode(2);
		DoublyLinkedListNode node3 = new DoublyLinkedListNode(3);
		DoublyLinkedListNode node4 = new DoublyLinkedListNode(4);
		DoublyLinkedListNode node5 = new DoublyLinkedListNode(5);
		DoublyLinkedListNode node6 = new DoublyLinkedListNode(6);
		DoublyLinkedListNode node7 = new DoublyLinkedListNode(7);
		node7.previous = node6;
		node6.next = node7;
		node6.previous = node5;
		node5.next = node6;
		node5.previous = node4;
		node4.next = node5;
		node4.previous = node3;
		node3.next = node4;
		node3.previous = node2;
		node2.next = node3;
		node2.previous = node1;
		node1.next = node2;
		DoublyLinkedListNode.print(node1);
		DoublyLinkedToBinaryTree doublyLinkedToBinaryTree=new DoublyLinkedToBinaryTree();
		doublyLinkedToBinaryTree.printTree(node1);
	}

}
