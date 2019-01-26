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
		Node<Integer> reversed = reverseLinkedListApproach2(head);
		System.out.println("reversed list" + head);

		while (reversed != null) {
			System.out.println(reversed.value);
			reversed = reversed.next;
		}
	}

	/**
	 * @param head
	 * @return
	 */
	private static Node<Integer> reverseLinkedListApproach1(Node<Integer> head) {

		Node<Integer> head2 = null;
		Node<Integer> tmp = head;
		while (tmp != null) {
			if (head2 == null) {
				head2 = new Node(tmp.value);
			} else {
				Node n = new Node(tmp.value);
				n.next = head2;
				head2 = n;
			}
			tmp = tmp.next;
		}
		tmp = null;
		return head2;
	}

	/**
	 * @param head
	 * @return
	 */
	private static Node<Integer> reverseLinkedListApproach2(Node<Integer> head) {

		Node<Integer> currentNode = head;
		Node<Integer> prevNode = null;
		Node<Integer> nextNode = null;

		while (currentNode != null) {
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;
		}
		return prevNode;
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