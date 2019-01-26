package com.geeksforgeeks.practice;

import java.util.Scanner;

public class GFGALL {

	/* package whatever //do not write package name here */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Long[] array = new Long[n];

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextLong();
		}
		for (int i = 0; i < n; i++) {
			chackBalancedNumber(array[i]);
		}

	}

	static void chackBalancedNumber(Long num) {
		String str = String.valueOf(num);
		int left = 0, right = 0;
		if (str.length() % 2 == 0) {
			System.out.println(0);
		} else {
			int len = str.length();
			for (int j = 0; j < str.length() / 2; j++) {
				left = (int) (left + Long.parseLong(String.valueOf(str.charAt(j))));
				right = (int) (right + Long.parseLong(String.valueOf(str.charAt(len - 1 - j))));
			}
			if (left == right)
				System.out.println(1);
			else
				System.out.println(0);

		}
	}

	public static long findDiffernce(Integer integer) {
		long squaresOfNums = 0, numsSum = 0;

		for (int i = 1; i <= integer; i++) {
			squaresOfNums = (long) (squaresOfNums + Math.pow(i, 2));
			numsSum = numsSum + i;
		}
		return (long) Math.pow(numsSum, 2) - squaresOfNums;
	}

	public static int checkDifference(int num1, int num2) {
		int count = 0;
		String num1str = "num1  ", num2str = "num2  ";
		while (num1 > 0|| num2 > 0) {
			num1str = num1str + num1 % 2;
			num2str = num2str + num2 % 2;
			if (num1 % 2 != num2 % 2) {
				count++;
			}
			num1 = num1 / 2;
			num2 = num2 / 2;
		}
		System.out.println(num1str);
		System.out.println(num2str);
		return count > 1 ? 0 : 1;
	}
}
