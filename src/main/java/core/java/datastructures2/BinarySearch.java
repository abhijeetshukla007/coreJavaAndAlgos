/**
 * 
 */
package core.java.datastructures2;

/**
 * @author abhijeet
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 76, 82, 113, 121, 190, 311 };
		 System.out.println(binarySearch(array, 0, array.length-1, 3191));
		//System.out.println(myBinarySearch(array, 0, array.length - 1, 319));
	}

	/**
	 * @return
	 * 
	 */
	private static int binarySearch(int[] array, int low, int high, int key) {
		int mid = (high + low) / 2;
		if (array[mid] == key) {
			return mid;
		} else if (array[mid] > key) {
			return binarySearch(array, 0, mid - 1, key);
		} else if (array[mid] < key && key <= array[high]) {
			return binarySearch(array, mid + 1, high, key);
		} else {
			return -1;
		}
	}

	private static int myBinarySearch(int[] array, long l, long r, long key) {
		long mid = (l + r) / 2;
		if (array[(int) mid] == key) {
			return (int) mid;
		} else if (array[(int) mid] > key) {
			return myBinarySearch(array, 0, mid, key);
		} else if (array[(int) mid] < key) {
			return myBinarySearch(array, mid + 1, r, key);
		} else
			return -1;
	}
}
