/**
 * 
 */
package core.java.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author abhijeet
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param root
	 */
	public static void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		Node temp = root;

		while (temp != null) {
			System.out.print(temp.key);
			queue.add(temp.left);
			queue.add(temp.right);
			temp = queue.poll();
		}
	}

}
