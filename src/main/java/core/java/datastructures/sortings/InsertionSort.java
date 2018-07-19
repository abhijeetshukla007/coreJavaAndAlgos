/**
 * 
 */
package core.java.datastructures.sortings;

/**
 * @author M1034403
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 33, 45, 22, 55, 23 };
		insertionSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * @param a
	 */
	private static int[] insertionSort(int[] a) {
		System.out.println(a.length);
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (a[j] > key && j >= 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

		return a;
	}
}
