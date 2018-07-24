package core.java.datastructures.linkedList;

public class DoublyLinkedNodeListDemo {

	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.insertAtTop(10);
		linkedList.insertAtTop(90);
		linkedList.insertAtTop(223);
		linkedList.insertAtTop(23);
		System.out.println(linkedList);
	}
}
