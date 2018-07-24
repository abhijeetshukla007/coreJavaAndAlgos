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
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);
		head.next.next.next.next = new Node<Integer>(5);

		Node<Integer> temp = head;
		System.out.println("original list");

		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;

		}
		Node<Integer> reversed = reverseLinkedList(head);
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
	private static Node<Integer> reverseLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> old = head;
		old.next = null;
		Node<Integer> tmp = null;
		while (temp.next != null) {
			tmp = new Node<Integer>(temp.next.value);
			tmp.next = old;
			old = tmp;
			temp = temp.next;
		}
		return old;
	}

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