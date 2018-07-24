package core.java.datastructures.binarytree;

/**
 * @author abhijeet
 *
 */
public class MirrorOfBinaryTree {
	/**
	 * @param root
	 *            Program to print mirror of Binary tree
	 */
	public static void printMirror(Node root) {
		if (root == null)
			return;

		Node temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		printMirror(root.left);
		printMirror(root.right);
	}
}
