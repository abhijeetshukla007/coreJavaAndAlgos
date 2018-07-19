package core.java.datastructures;

class Node {
	int key;
	Node right, left;

	public Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return String.valueOf(key);
	}

}

public class BinaryTree {
	/*
	 * Tree is a hierarchical data structure. Main uses of trees include
	 * maintaining hierarchical data, providing moderate access and insert/
	 * delete operations. Binary trees are special cases of tree where every
	 * node has at most two children.
	 */

	static Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int key) {
		root = new Node(key);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTree.root = new Node(1);
		BinaryTree.root.left = new Node(2);
		BinaryTree.root.right = new Node(3);
		BinaryTree.root.left.left = new Node(4);
		BinaryTree.root.left.right = new Node(5);
		BinaryTree.root.right.left = new Node(6);
		BinaryTree.root.right.right = new Node(7);

		System.out.println("Pre order");
		PreOrderTraversal.preOrder(root);
		System.out.println("\n\nPost order");
		PostOrderTraversal.postOrder(root);
		System.out.println("\n\nIn Order");
		InOrderTraversal.inorder(root);

		System.out.println("\n\nLevel Order");
		LevelOrderTraversal.levelOrder(root);

		System.out.println("\n\nRoot to Leaf Path");
		RootToLeafPath.rootToLeaf(root);

		System.out.println("\n\n Mirror of Binary Tree\n");

		MirrorOfBinaryTree.printMirror(root);
		PreOrderTraversal.preOrder(root);

		BinaryTree tree2 = new BinaryTree();
		BinaryTree.root = new Node(10);
		BinaryTree.root.left = new Node(8);
		BinaryTree.root.right = new Node(2);
		BinaryTree.root.left.left = new Node(3);
		BinaryTree.root.left.right = new Node(5);
		BinaryTree.root.right.left = new Node(2);
		
		BinaryTree tree3 = new BinaryTree();
		BinaryTree.root = new Node(9);
		BinaryTree.root.left = new Node(5);
		BinaryTree.root.right = new Node(12);
		BinaryTree.root.left.left = new Node(3);
		BinaryTree.root.left.right = new Node(5);
		BinaryTree.root.right.left = new Node(2);
		BinaryTree.root.right.right = new Node(2);

		RootToLeafPath.rootToLeaf(BinaryTree.root);
	}
}
