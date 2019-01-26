package com.geeksforgeeks.practice;
/*package whatever //do not write package name here */

import java.util.Scanner;
/*package whatever //do not write package name here */

class GFG {

	public static boolean isPowerOf2(int num) {
		return (num > 0) && ((num & (num - 1)) == 0);
	}

	public static int grayCheck_OPTIMIISED(int term1, int term2) {
		// Time O(1)
		return (isPowerOf2(term1 ^ term2) ? 1 : 0);
	}

	public static int grayCheck(int term1, int term2) {

		// Time O(n)
		boolean oneDiff = false;
		// System.out.println(term1&term2);
		while (term1 > 0 || term2 > 0) {
			boolean check_term = ((term1 & 1) == (term2 & 1));
			if (!check_term) {
				if (oneDiff) {
					return 0;
				} else {
					oneDiff = true;
				}
			}
			term1 = term1 >> 1;
			term2 = term2 >> 1;
		}
		return 1;
	}

	public static void main(String[] args) {
		// code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			System.out.println(grayCheck_OPTIMIISED(n1, n2));
		}
	}
}