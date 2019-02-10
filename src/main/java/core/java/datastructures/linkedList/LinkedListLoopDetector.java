/**
 * 
 */
package core.java.datastructures.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author abhij
 *
 */
public class LinkedListLoopDetector {
	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.insertAtTop(10);
		linkedList.insertAtTop(90);
		linkedList.insertAtTop(223);
		linkedList.insertAtTop(23);
		linkedList.head.nextNode.nextNode.nextNode.nextNode = linkedList.head;
		System.out.println(detectLoop(linkedList));
		System.out.println(detectLoopPointers(linkedList));

	}

	private static boolean detectLoop(DoublyLinkedList linkedList) {
		DoublyLinkedNode temp = linkedList.head;
		Set<DoublyLinkedNode> integers = new HashSet<>();
		boolean isLoop = false;
		while (temp != null) {
			if (!integers.add(temp)) {
				isLoop = true;
				break;
			}
			temp = temp.nextNode;
		}
		return isLoop;
	}

	private static boolean detectLoopPointers(DoublyLinkedList linkedList) {
		DoublyLinkedNode tempJump1 = linkedList.head;
		DoublyLinkedNode tempJump2 = linkedList.head;
		boolean isLoop = false;
		while (tempJump1 != null) {
			if (tempJump2.nextNode.nextNode == null || tempJump1.nextNode == null) {
				break;
			}
			if (tempJump2.nextNode.nextNode != null && tempJump1.nextNode != null) {

				System.out.println(tempJump1.data);
				tempJump1 = tempJump1.nextNode;
				System.out.println(tempJump2.data);
				tempJump2 = tempJump2.nextNode.nextNode;
			}
			if (tempJump1 == tempJump2) {
				isLoop = true;
				break;
			}
		}
		return isLoop;
	}
}
