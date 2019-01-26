package com.java.datastructures.trees;

public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {
	private T t;
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;

	public TreeNode(T t) {
		this.t = t;
	}

	public TreeNode<T> find(T t) {
		if (this.t.equals(t)) {
			return this;
		} else if ((this.t.compareTo(t) > 0) && rightChild != null) {
			return rightChild.find(t);
		} else if ((this.t.compareTo(t) < 0) && leftChild != null) {
			return leftChild.find(t);
		}
		return null;
	}

	public void insert(T data) {
		if (data.compareTo(this.t) > 0) {
			if (this.rightChild == null) {
				this.rightChild = new TreeNode<T>(data);
			} else {
				rightChild.insert(data);
			}
		} else if (data.compareTo(this.t) < 0) {
			if (leftChild == null) {
				leftChild = new TreeNode<T>(data);
			} else {
				rightChild.insert(data);
			}
		}
		return;
	}

	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public T getT() {
		return t;
	}

	@Override
	public int compareTo(TreeNode<T> o) {
		return this.t.compareTo(o.t);
	}

}
