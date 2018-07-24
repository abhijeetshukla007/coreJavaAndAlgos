/**
 * 
 */
package core.java.datastructures.sortings;

/**
 * @author abhijeet
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 34, 5, 33, 45, 22, 55, 23 };
		// insertionSort(array);
		insertionSortNew(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void insertionSortNew(int[] array) {
		int temp = 0, j = 0;
		for (int i = 1; i < array.length; i++) {
			j = i - 1;
			int t=array[i];
			while (j >= 0 && array[j] >t) {
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;
			}
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
