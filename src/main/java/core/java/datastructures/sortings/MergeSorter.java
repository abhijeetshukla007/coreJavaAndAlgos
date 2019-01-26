/**
 * 
 */
package core.java.datastructures.sortings;

import java.util.Arrays;

/**
 * @author abhijeet
 *
 */
public class MergeSorter {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 3, 11, 65, 32, 2 };
		new MergeSorter().sort(arr);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, arr.length)));
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] data) {
		mergeSort(0, data.length - 1, data);
	}

	/**
	 * @param i
	 * @param mid
	 * @param array
	 */
	private void mergeSort(int start, int end, int[] array) {
		int middle = 0;
		if (start < end) {
			middle = (end + start) / 2;
			mergeSort(start, middle, array);
			mergeSort(middle + 1, end, array);
			merge(start, end, middle, array);
		}
	}

	private void merge(int start, int end, int mid, int[] arr) {
		int sizeOfLeft = mid - start + 1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		left = Arrays.copyOfRange(arr, start, mid + 1);
		right = Arrays.copyOfRange(arr, mid + 1, end + 1);
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
		}
	}
}
