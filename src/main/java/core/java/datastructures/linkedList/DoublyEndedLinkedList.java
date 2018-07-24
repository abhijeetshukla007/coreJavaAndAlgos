package core.java.datastructures.linkedList;

public class DoublyEndedLinkedList<T> {
	public static void main(String[] args) {
		DoublyEndedLinkedList<Integer> dList = new DoublyEndedLinkedList<>();
		dList.insertAtTail(2);
		dList.insertAtTail(3);
		dList.insertAtTail(565);
		System.out.println(dList);
	}

	private Node<T> head;
	private Node<T> tail;

	void insertAtTail(T t) {
		Node<T> node = new Node(t);
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail != null) {
			this.tail.next = node;
		}
		this.tail = node;

	}

	class Node<T> {
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

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result = result + " " + current.toString();
			current = current.getNextNode();
		}
		return result + "}";
	}
}