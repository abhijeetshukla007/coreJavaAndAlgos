package com.core.java.hackerrank.practice;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author abhij
 *
 */
public class HourGlassProblem {
	static int maxSum;

	static int hourglassSum(int[][] arr) {
		int sum;
		for (int i = 0; i <= arr.length - 3; i++) {
			for (int j = 0; j <= arr.length - 3; j++) {
				sum = getHourGlassSum(arr, i, j);
				if (i==0&&j==0) {
					maxSum=sum;
				}
				
				 if (maxSum < sum) {
					maxSum = sum;
				}
				System.out.println(maxSum);
			}
			sum = 0;
		}
		return maxSum;
	}

	static int getHourGlassSum(int[][] arr, int i, int j) {
		int sum = 0;
		for (int k = 0; k < 3; k++) {
			sum = sum + arr[i][j + k] + arr[i + 2][j + k];
		}
		sum = sum + arr[i + 1][j + 1];
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[][] arr = { { 0, -4, -6, 0, -7, -6 }, { -1, -2, -6, -8, -3, -1 }, { -8, -4, -2, -8, -8, -6 },
				{ -3, -1, -2, -5, -7, -4 }, { -3, -5, -3, -6, -6, -6 }, { -3, -6, 0, -8, -6, -7 } };

		/*
		 * {{-9, -9 ,-9,13,3,1},{1,2,3,13,3,1},{-9 ,-9
		 * ,-9,13,3,1},{1,2,3,13,3,1},{1,2,3,13,3,1},{1,2,3,13,3,1}};
		 */

		/*
		 * for (int i = 0; i < 6; i++) { String[] arrRowItems =
		 * scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int j = 0; j < 6; j++) { int arrItem = Integer.parseInt(arrRowItems[j]);
		 * arr[i][j] = arrItem; } }
		 */
		System.out.println(arr.length - 2);

		int result = hourglassSum(arr);
		System.out.println(result);

	}
}
