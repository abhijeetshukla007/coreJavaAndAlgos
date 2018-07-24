package core.java.datastructures.linkedList;

public class DoublyLinkedList {
	public DoublyLinkedNode head;

	public void insertAtTop(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public int getLength() {
		DoublyLinkedNode currentNode = this.head;
		int length = 0;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNextNode();
		}
		return length;
	}

	@Override
	public String toString() {
		DoublyLinkedNode node = this.head;
		String result = "{";
		while (node != null) {
			result = result +node.toString();
			node = node.getNextNode();
		}
		return result + "}";
	}

}
