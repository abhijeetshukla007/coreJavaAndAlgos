package core.java.datastructures.binarytree;

import java.util.HashSet;
import java.util.Set;

public class VisibleFromTop {

	Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		BinaryTree tree2 = new BinaryTree();
		BinaryTree.root = new Node(10);
		BinaryTree.root.left = new Node(8);
		BinaryTree.root.right = new Node(2);
		BinaryTree.root.left.left = new Node(3);
		BinaryTree.root.left.right = new Node(5);
		BinaryTree.root.right.left = new Node(2);
	}

	void printVisibleNodes(Node node) {
		if (set.isEmpty()) {
			System.out.println(node.key);
		} else {
			
		}
		
		if (node.left!=null) {
			set.add(-1);
			printVisibleNodes(node.left);
		}

	}
}
