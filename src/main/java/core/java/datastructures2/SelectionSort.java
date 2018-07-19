/**
 * 
 */
package core.java.datastructures2;

/**
 * @author abhijeet
 *
 */
public class SelectionSort {
	/**
	 * 
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 76, 2, 13, 11, 90, 3 };
		array = selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * 
	 */
	private static int[] selectionSort(int[] array) {
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			pos=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[pos] > array[j]) {
					pos = j;
				}
			}
			swap(pos, i, array);
		}
		return array;
	}

	/**
	 * 
	 */
	private static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
