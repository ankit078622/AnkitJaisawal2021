/**
 * 
 */
package org.espire.printleafnode;


import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class BinaryTreeLeafNodeTest {

	@Test
	public void testLeafNode() {
		BinaryTreeLeafNode.TreeNode root = BinaryTreeLeafNode.addNewNode(1);
		root.left = BinaryTreeLeafNode.addNewNode(2);
		root.right = BinaryTreeLeafNode.addNewNode(3);
		root.left.left = BinaryTreeLeafNode.addNewNode(4);
		root.right.left = BinaryTreeLeafNode.addNewNode(5);
		root.right.right = BinaryTreeLeafNode.addNewNode(8);
		root.right.left.left = BinaryTreeLeafNode.addNewNode(5);
		root.right.left.right = BinaryTreeLeafNode.addNewNode(7);
		root.right.right.left = BinaryTreeLeafNode.addNewNode(12);
		root.right.right.right = BinaryTreeLeafNode.addNewNode(18);
		BinaryTreeLeafNode.printLeafNodes(root);
	}

}
