/**
 * 
 */
package core.java.datastructures.sortings;

public class SelectionSort<T> {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 33, 45, 22, 55,1, 23 };
		array = selectionSortPractice(array);
		// selectionSort(array, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static int[] selectionSortPractice(int[] array) {
		int minIndex = 0, temp, count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
				count++;
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}
		System.out.println("count:" + count);
		return array;
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
	public  void genericSort(Comparable<T>[] objects) {
		for (int i=0; i < objects.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < objects.length; j++) {
				if (objects[j].compareTo((T) objects[minIndex]) < 0) {
					minIndex = j;
				}
			}
			Comparable<T> tmp = objects[minIndex];
			objects[minIndex] = objects[i];
			objects[i] = tmp;
		}
}}