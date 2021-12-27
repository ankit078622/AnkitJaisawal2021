package org.espire.printleafnode;

public class BinaryTreeLeafNode {

	// A Binary Tree Node
	public static class TreeNode {
		public Integer data;
		public TreeNode left, right;
	};

	// Function to print leaf
	// nodes from left to right
	public static void printLeafNodes(TreeNode root) {

		// if node is null ,return
		if (root == null) {
			return;
		}
		// If node is leaf node , print its data
		if (root.left == null && root.right == null) {
			System.out.println(root.data + " ");
		}
		// If left child exists, check for leaf
		// recursively
		if (root.left != null) {
			printLeafNodes(root.left);
		}
		// If right child exists, check for leaf
		// recursively
		if (root.right != null) {
			printLeafNodes(root.right);
		}
	}

	public static TreeNode addNewNode(Integer data) {
		TreeNode temp = new TreeNode();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	// Main method
	public static void main(String[] args) {

		// Let us create binary tree shown in
		// above diagram
		TreeNode root = addNewNode(1);
		root.left = addNewNode(2);
		root.right = addNewNode(3);
		root.left.left = addNewNode(4);
		root.right.left = addNewNode(5);
		root.right.right = addNewNode(8);
		root.right.left.left = addNewNode(6);
		root.right.left.right = addNewNode(7);
		root.right.right.left = addNewNode(9);
		root.right.right.right = addNewNode(10);

		// Print leaf nodes of the given tree
		printLeafNodes(root);
	}
}
