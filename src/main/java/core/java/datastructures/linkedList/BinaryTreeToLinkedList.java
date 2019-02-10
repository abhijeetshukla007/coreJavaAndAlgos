/**
 * 
 */
package core.java.datastructures.linkedList;

import java.util.LinkedList;

import core.java.datastructures.binarytree.BinaryTree;
import core.java.datastructures.binarytree.Node;

/**
 * @author abhij
 *
 */
public class BinaryTreeToLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList linkedList=new LinkedList<>();
		linkedList.stream().forEach(System.out::print);
		BinaryTree tree = new BinaryTree();
		BinaryTree.root = new Node(1);
		BinaryTree.root.left = new Node(2);
		BinaryTree.root.right = new Node(3);
		BinaryTree.root.left.left = new Node(4);
		BinaryTree.root.left.right = new Node(5);
		BinaryTree.root.right.left = new Node(6);
		BinaryTree.root.right.right = new Node(7);

		binaryTreeToLinkedList(tree);
	}

	private static void binaryTreeToLinkedList(BinaryTree tree) {
		inorder(tree.root);
	}

	private static void inorder(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			System.out.println(root.key);
			return;
		}
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}

}
