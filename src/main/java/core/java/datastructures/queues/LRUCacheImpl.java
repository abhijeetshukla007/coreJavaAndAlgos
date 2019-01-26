/**
 * 
 */
package core.java.datastructures.queues;

import java.util.HashMap;

/**
 * @author abhij
 *
 */
class Node {
	int value;
	Node next;
	Node prev;

	public Node(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
}

class DLinkedList {
	int size;
	Node head;
	Node tail;

	public DLinkedList(int size) {
		this.size = size;
	}

	void addAtTop(Node top) {
		if (head == null) {
			head = top;
			head.next = tail;
		} else {
			if (tail == null) {
				top.next = head;
				head.prev = top;
				this.head = top;
				tail = this.head.next;
			} else {
				top.next = head;
				head.prev = top;
				this.head = top;
			}
		}
	}

	void remove(Node node) {
		Node prev = node.prev;
		Node next = node.next;
		prev.next = next;
		next.prev = prev;
	}

	Node removeFromBottom() {
		Node prev = tail.prev;
		prev.next = null;
		tail = prev;
		return tail;
	}
}

public class LRUCacheImpl {

	private DLinkedList linkedList;
	private HashMap<Integer, Node> nodeMap;

	public LRUCacheImpl(int size) {
		linkedList = new DLinkedList(size);
		nodeMap = new HashMap<>();
	}

	void addToCache(int value) {
		if (!nodeMap.containsKey(value)) {
			if (nodeMap.size() == linkedList.size) {
				nodeMap.remove(linkedList.tail.value);
				linkedList.removeFromBottom();
				Node newNode = new Node(value);
				nodeMap.put(value, newNode);
				linkedList.addAtTop(newNode);
			} else {
				Node newNode = new Node(value);
				nodeMap.put(value, newNode);
				linkedList.addAtTop(newNode);
			}
		} else {
			Node node = nodeMap.get(value);
			linkedList.remove(node);
			linkedList.addAtTop(node);
		}
	}

	Node getFromCache(int value) {
		Node node = null;
		if (nodeMap.containsKey(value)) {
			node = nodeMap.get(value);
			linkedList.remove(node);
			linkedList.addAtTop(node);
		}
		return node;
	}

	void printCache() {
		Node temp = linkedList.head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LRUCacheImpl cache = new LRUCacheImpl(5);
		cache.addToCache(1);
		cache.addToCache(2);
		cache.addToCache(3);
		cache.addToCache(4);
		cache.printCache();

		cache.getFromCache(3);
		cache.printCache();
		cache.addToCache(5);
		cache.addToCache(6);
		cache.printCache();
	}
}
