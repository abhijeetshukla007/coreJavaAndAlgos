package core.java.datastructures.binarytree;

/**
 * @author abhijeet
 *
 */
public class PostOrderTraversal {
	/**
	 * @param node
	 */
	public static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key+" ");
	}
}
