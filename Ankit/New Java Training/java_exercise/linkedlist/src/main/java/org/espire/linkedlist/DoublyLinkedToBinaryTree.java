package org.espire.linkedlist;

public class DoublyLinkedToBinaryTree {

	public static BinaryTreeNode sortedListToBinarySearchTree(DoublyLinkedListNode head) {
		// finding the size of the list
		Integer len = 0;
		DoublyLinkedListNode currentNode = head;
		while (currentNode != null) {
			len++;
			currentNode = currentNode.next;
		}
		return construct(head, 0, len - 1);
	}

	public static BinaryTreeNode construct(DoublyLinkedListNode head, Integer start, Integer end) {
		// terminal condition
		if (start > end) {
			return null;
		}
		// find middle index
		Integer mid = start + (end - start) / 2;
		// we will now build the left subtree since it is a bottom up approach
		BinaryTreeNode left = construct(head, start, mid - 1);
		BinaryTreeNode root = new BinaryTreeNode(head.value);
		root.left = left;
		if (head.next != null) {
			head.value = head.next.value;
			head.next = head.next.next;
		}
		root.right = construct(head, mid + 1, end);
		return root;
	}

	public static void printTree(DoublyLinkedListNode node) {
		System.out.println(BinaryTreeNode.print(sortedListToBinarySearchTree(node)));
	}
	public static void main(String[] args) {
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
		System.out.println("-------------");
		//System.out.println(BinaryTreeNode.print(sortedListToBinarySearchTree(node1)));
		printTree(node1);
		
	}
}

class BinaryTreeNode {
	Integer value;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(Integer value) {
		super();
		this.value = value;
	}

	public static String print(BinaryTreeNode node) {
		if (node != null) {
			return node.value + "->(" + print(node.left) + "," + print(node.right) + ")";
		}
		return null;
	}
}

class DoublyLinkedListNode {
	Integer value;
	DoublyLinkedListNode previous;
	DoublyLinkedListNode next;

	public DoublyLinkedListNode(Integer value) {
		super();
		this.value = value;
	}

	public static void print(DoublyLinkedListNode node) {
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println();
	}
}
