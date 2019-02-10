/**
 * 
 */
package core.java.datastructures.linkedList;

/**
 * @author abhij
 *
 */
public class SwapKthNodeBothEnds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.insertAtTop(10);
		linkedList.insertAtTop(90);
		linkedList.insertAtTop(223);
		linkedList.insertAtTop(23);
		System.out.println(linkedList);
		swapNodes(linkedList);
	}

	private static void swapNodes(DoublyLinkedList linkedList) {

	}

}
