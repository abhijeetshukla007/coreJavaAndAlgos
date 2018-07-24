package core.java.datastructures.binarytree;

/**
 * @author abhijeet
 *
 */
public class PreOrderTraversal {
	public static void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
}
