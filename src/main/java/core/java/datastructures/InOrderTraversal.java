/**
 * 
 */
package core.java.datastructures;

/**
 * @author abhijeet
 *
 */
public class InOrderTraversal {

	/**
	 * @param root
	 */
	public static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}

}
