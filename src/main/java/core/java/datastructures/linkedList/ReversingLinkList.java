/**
 * 
 */
package core.java.datastructures.linkedList;

/**
 * @author abhijeet
 *
 */
public class ReversingLinkList {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		Node temp = head;
		System.out.println("original list");

		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;

		}
		Node reversed = reverseLinkedList(head);
		System.out.println("reversed list");
		while (reversed != null) {
			System.out.println(reversed.value);
			reversed = reversed.next;
		}
		System.out.println(reversed.value);
	}

	/**
	 * @param head
	 * @return
	 */
	private static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node old = head;
		old.next = null;
		Node tmp = null;
		while (temp.next != null) {
			tmp = new Node(temp.next.value);
			tmp.next = old;
			old = tmp;
			temp = temp.next;
		}
		return old;
	}

}

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}