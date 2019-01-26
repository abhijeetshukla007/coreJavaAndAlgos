/**
 * 
 */
package com.core.java.hackerrank.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxTransformHKR {
	
	/**
	 * @author abhij
	 * @param bufferedWriter
	 * @throws IOException
	 *
	 */

	// Complete the solve function below.
	static long solve(int[] A) throws IOException {
		int[] arr = maxTransform(A);
		long sum = maxTransformWithSum(arr);
		System.out.println(sum);
		// long sum = maxTransformWithSum(A);
		return sum;
	}

	/**
	 * @param A
	 */
	private static long maxTransformWithSum(int[] A) {
		long sum = 0;
		int m = 1000000007;

		for (int i = A.length; i > 0; i--) {
			int pos = A.length - i, pos2 = A.length - i, max = A[pos2];
			for (int j = 0; j < i; j++) {
				if (A[pos2 + j] > max) {
					max = A[pos2 + j];
				} else if (A[pos2 + j] < max) {
				}
				sum = sum + max;
				// result[pos] = max;
				pos = pos + A.length - j;
			}
			
		}
		System.out.println(sum);
		return sum % m;
	}

	/**
	 * @param A
	 */
	private static int[] maxTransform(int[] A) {
		int n = A.length;
		long N = (n * (n + 1)) / 2;
		int[] result = new int[(int) N];
		for (int i = A.length; i > 0; i--) {
			int pos = A.length - i, pos2 = A.length - i, max = A[pos2];
			for (int j = 0; j < i; j++) {
				if (A[pos2 + j] > max) {
					max = A[pos2 + j];
				}
				result[pos] = max;
				pos = pos + A.length - j;
			}
		}
		return result;
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

		long result = solve(A);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}
}
