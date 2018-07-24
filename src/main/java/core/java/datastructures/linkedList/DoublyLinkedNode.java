package core.java.datastructures.linkedList;

public class DoublyLinkedNode {
	public int data;
	public DoublyLinkedNode previousNode;
	public DoublyLinkedNode nextNode;

	public DoublyLinkedNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoublyLinkedNode previousNode) {
		this.previousNode = previousNode;
	}

	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "DoublyLinkedNode [data=" + data +"]";
	}

}
