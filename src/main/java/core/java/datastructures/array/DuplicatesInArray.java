package core.java.datastructures.array;

import java.util.stream.Stream;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 22, 3, 4, 1, 2, 3 };
		printDuplicates(array);
	}

	private static void printDuplicates(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[Math.abs(array[i])] >= 0) {
				array[Math.abs(array[i])] = -array[Math.abs(array[i])];
			} else {
				System.out.println(Math.abs(array[i]));
			}
		}
	}

	/*
	 * void printRepeating(int arr[], int size) { int i;
	 * System.out.println("The repeating elements are : ");
	 * 
	 * for (i = 0; i < size; i++) { if (arr[Math.abs(arr[i])] >= 0)
	 * arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; else
	 * System.out.print(Math.abs(arr[i]) + " "); } }
	 * 
	 * // Driver program public static void main(String[] args) { DuplicatesInArray
	 * duplicate = new DuplicatesInArray(); int arr[] = { 1, 2, 3, 1, 3, 6, 6 }; int
	 * arr_size = arr.length;
	 * 
	 * duplicate.printRepeating(arr, arr_size); }
	 */
}
