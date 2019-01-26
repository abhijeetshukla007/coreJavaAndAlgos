/**
 * 
 */
package com.core.java.hackerrank.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxTransformHKR3 {
	/**
	 * @author abhij
	 * @param bufferedWriter
	 * @throws IOException
	 *
	 */

	// Complete the solve function below.
	static long solve(int[] A, BufferedWriter bufferedWriter) throws IOException {
		maxTransform(A);
		/*long sum = maxTransformWithSum3(arr);
		System.out.println(sum);
		// long sum = maxTransformWithSum(A);
		bufferedWriter.write(Arrays.toString(arr));
		bufferedWriter.newLine();

		bufferedWriter.close();*/
		return 0;
	}

	/**
	 * @param A
	 */
	private static long maxTransformWithSum3(int[] A) {
		long sum = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			arrayList.add(A[i]);
			sum = sum + A[i];
		}
		int pos = 0;
		for (int i = A.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arrayList.get(pos + j) > arrayList.get(pos + j + 1)) {
					arrayList.add(arrayList.get(pos + j));
					sum = sum + arrayList.get(pos + j);
				} else {
					arrayList.add(arrayList.get(pos + j + 1));
					sum = sum + arrayList.get(pos + j + 1);
				}
			}
			pos = pos + i;
		}
		System.out.println(arrayList);
		int m = 1000000007;
		// System.out.println(Arrays.toString(result));
		return sum % m;
	}

	/**
	 * @param A
	 */
	private static long maxTransformWithSum(int[] A) {
		long sum = 0;
		for (int i = A.length; i > 0; i--) {
			int pos = A.length - i, pos2 = A.length - i, max = A[pos2];
			for (int j = 0; j < i; j++) {
				if (A[pos2 + j] > max) {
					max = A[pos2 + j];
				}
				sum = sum + max;
				// result[pos] = max;
				pos = pos + A.length - j;
			}
		}
		System.out.println(sum);
		int m = 1000000007;
		// System.out.println(Arrays.toString(result));
		return sum % m;
	}

	/**
	 * @param A
	 */
	private static void maxTransform(int[] A) {
		int j = 0;
		long N = (A.length * (A.length + 1)) / 2;
		System.out.println(N);
		int[] result = new int[(int) N];
		for (int k = 0; k <= A.length - 1; k++) {
			for (int i = 0; i <= A.length - k - 1; i++) {
				j = k + i;
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/abhij/Desktop/resultHKR.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] A = new int[n];

		String[] AItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int AItem = Integer.parseInt(AItems[i]);
			A[i] = AItem;
		}

		long result = solve(A, bufferedWriter);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
