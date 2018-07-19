/**
 * 
 */
package core.java.datastructures.sortings;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 33, 45, 22, 55, 23 };

		selectionSort(array, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void selectionSort(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			int min = i, temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}