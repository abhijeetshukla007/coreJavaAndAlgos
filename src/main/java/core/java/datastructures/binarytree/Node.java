package core.java.datastructures.binarytree;

public class Node {
	public int key;
	public Node right;
	public Node left;

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