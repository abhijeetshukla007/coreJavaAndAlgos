package com.core.java.hackerrank.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class MaxTransformLatest {
	/**
	 * @author abhij
	 *
	 */
	// Complete the solve function below.
	static long solve(long[] A) {
		long sum = 0;
		long[] result = new long[((A.length * (A.length + 1))) / 2];
		System.arraycopy(A, 0, result, 0, A.length);
		long[] arr = maxTransformWithRecursionm(A, result, A.length);
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		sum = sum+maxTransformRecursion2(arr, true);
		System.out.println(sum);
		System.out.println(sum%1000000007);
		return sum;
	}

	/**
	 * @param A
	 */
	private static long[] maxTransformWithRecursionm(long[] A, long[] result, int n) {
		if (A.length == 1) {
			return result;
		}
		long[] temp = new long[A.length - 1];
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] < A[i + 1]) {
				temp[i] = A[i + 1];
				result[n + i] = A[i + 1];
			} else {
				result[n + i] = A[i];
				temp[i] = A[i];
			}

		}
		n = n + temp.length;
		result = maxTransformWithRecursionm(temp, result, n);
		return result;
	}

	/**
	 * @param A
	 * 
	 */
	private static long maxTransformRecursion(long[] A, boolean allEqual) {
		long sum=0;
		if (A.length == 1) {
			return A[0];
		}
		try {
			long[] temp = new long[A.length - 1];
			allEqual = true;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] < A[i + 1]) {
					sum = sum+A[i + 1];
					temp[i] = A[i + 1];
					allEqual = false;
				} else if (A[i] > A[i + 1]) {
					sum = sum+A[i];
					temp[i] = A[i];
					allEqual = false;
				}else {
					sum = sum+A[i];
					temp[i] = A[i];
				}
			}
			//System.out.println(Arrays.toString(temp));
			if (allEqual) {
				//System.out.println(Arrays.toString(temp));
				BigInteger bigInteger = new BigInteger(String.valueOf(temp.length));
				bigInteger=bigInteger.multiply(BigInteger.valueOf((temp.length-1)/2));
				bigInteger=bigInteger.multiply(BigInteger.valueOf(A[0]));				
				sum = sum+bigInteger.mod(BigInteger.valueOf(1000000007)).longValue();
				return sum%1000000007;
			}
			sum = sum+maxTransformRecursion(temp, allEqual);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		// System.out.print(sum + " ");
		return sum%1000000007;
	}

	/**
	 * @param A
	 * 
	 */
	private static long maxTransformRecursion2(long[] A, boolean allEqual) {
		long sum=0;
		if (A.length == 1) {
			return A[0];
		}else if(A.length==0)
			return 0;
		try {
			long[] temp = new long[A.length - 1];
			allEqual = true;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] < A[i + 1]) {
					sum = sum+A[i + 1];
					temp[i] = A[i + 1];
					allEqual = false;
				} else if (A[i] > A[i + 1]) {
					sum = sum+A[i];
					temp[i] = A[i];
					allEqual = false;
				}else {
					sum = sum+A[i];
					temp[i] = A[i];
				}
			}
			//System.out.println(Arrays.toString(temp));
			if (allEqual) {
				//System.out.println(Arrays.toString(temp));
				BigInteger bigInteger = new BigInteger(String.valueOf(temp.length));
				bigInteger=bigInteger.multiply(BigInteger.valueOf((temp.length-1)/2));
				bigInteger=bigInteger.multiply(BigInteger.valueOf(A[0]));				
				sum = sum+bigInteger.mod(BigInteger.valueOf(1000000007)).longValue();
				return sum%1000000007;
			}
//			sum=sum+maxTransformRecursion(Arrays.copyOfRange(temp, 0, (temp.length)/2+1), allEqual);
//			System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, (temp.length)/2)));
//
//			sum=sum+maxTransformRecursion(Arrays.copyOfRange(temp, (temp.length)/2-1,temp.length), allEqual);
//			System.out.println(Arrays.toString(Arrays.copyOfRange(temp, (temp.length)/2,temp.length)));

			sum = sum+maxTransformRecursion(temp, allEqual);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		// System.out.print(sum + " ");
		return sum%1000000007;
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/abhij/Desktop/resultHKR.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long[] A = new long[n];

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
