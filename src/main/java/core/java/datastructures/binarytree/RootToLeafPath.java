/**
 * 
 */
package core.java.datastructures.binarytree;

/**
 * @author abhijeet
 *
 */
public class RootToLeafPath {

	/**
	 * @param root
	 */
	static String path = "";

	public static void rootToLeaf(Node root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			path = path + root.key;
			System.out.println(path);
			path = (path.length() > 0) ? path.substring(0, path.length() - 1) : path;
			return;
		} else {
			path = path + root.key;
		}
		rootToLeaf(root.left);
		rootToLeaf(root.right);
		path = (path.length() > 0) ? path.substring(0, path.length() - 1) : path;
	}
}
