package com.java.datastructures.trees;

public class BinarySearchTree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public void insert(T data) {
		if (root == null) {
			root = new TreeNode<T>(data);
		} else {
			root.insert(data);
		}
	}

	public TreeNode<T> find(T t) {
		if (root != null) {
			root.find(t);
		}
		return null;
	}

	public void delete(T t) {
		TreeNode<T> parent = this.root;
		TreeNode<T> current = this.root;
		boolean isLeftChild = false;
		if (current == null) {
			return;
		} else {
			while (current != null && current.getT() != t) {
				parent = current;
				if (t.compareTo(current.getT()) > 0) {
					current = current.getRightChild();
					isLeftChild = false;
				} else if (t.compareTo(current.getT()) < 0) {
					current = current.getLeftChild();
					isLeftChild = true;
				}
			}
		}
	}
}
