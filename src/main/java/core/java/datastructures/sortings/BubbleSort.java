/**
 * 
 */
package core.java.datastructures.sortings;

/**
 * @author abhijeet
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 33, 45, 22, 55, 23 };
		array=newSort(array);
		
		//sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	public static int[] sort(int[] array) {
		int temp;
		boolean swapped = false;
		for (int i = 0; i < array.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return array;
	}

	private static int[] newSort(int[] array) {
		int temp = 0;
		for (int i = 0; i <= array.length - 2; i++) {
			for (int j = 0; j <= array.length - 2 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		return array;
	}
}
