package core.java.datastructures.linkedList;

public class Node<T> {
	T value;
	Node<T> next;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextNode() {
		return next;
	}

	public void setNextNode(Node<T> next) {
		this.next = next;
	}

	public Node(T value) {
		this.value = value;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}