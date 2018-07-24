package core.java.datastructures.linkedList;

public class SampleLinkedList<T> {

	public static void main(String[] args) {
		SampleLinkedList<Integer> linkedList = new SampleLinkedList<>();
		linkedList.insertAtHead(2);
		linkedList.insertAtHead(3);
		linkedList.insertAtHead(4);
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(2);
		System.out.println(linkedList.toString());
		System.out.println("length of List:" + linkedList.getLength());
		linkedList.deleteFromHead();
		System.out.println("deleted from head");
		System.out.println(linkedList);
		System.out.println("Found:" + linkedList.find(4));
		System.out.println("Found:" + linkedList.find(19));

	}

	Node<Integer> head;

	public Node<T> find(T t) {
		Node<T> currentNode = (Node<T>) this.head;
		while (currentNode != null) {
			if (currentNode.getValue() == t) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		return null;
	}

	void deleteFromHead() {
		this.head = this.head.getNextNode();
	}

	void insertAtHead(T data) {
		Node<Integer> newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int getLength() {
		int length = 0;
		Node<?> current = this.head;
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result = result + " " + current.toString();
			current = current.getNextNode();
		}
		return result;
	}

}