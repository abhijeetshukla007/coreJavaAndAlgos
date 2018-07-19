package com.core.java.hiring.challenges;

/*You are given an array A of length N. You have to choose a subset S from given array A, such that average of S is less than K. You need to print the maximum possible length of S.

Input format : 

The first line of each input contains  N, length of array A.
Next line contains N space separated elements of array A.
Next line of input contains an integer Q, Number of queries.
Each following Q  lines contains a single integer K.
Output format :

For each query, print single integer denoting the maximum possible length of the subset.*/
import java.util.Arrays;
import java.util.Scanner;

public class HeighestAveraget {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int[] array = new int[len];
		int[] avg = new int[len];

		for (int i = 0; i < avg.length; i++) {
			array[i] = scanner.nextInt();
		}

		int Q = scanner.nextInt();
		Arrays.sort(array);
		int avgerage = 0, sum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum = sum + array[i];
			avgerage = (sum) / (i + 1);
			avg[i] = avgerage;
		}

		for (int i = 0; i < Q; i++) {
			int query = scanner.nextInt();
			boolean flag = false;
			for (int j = 0; j < avg.length; j++) {
				if (query <= avg[j]) {
					System.out.println(j);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(avg.length);
			}
		}
		scanner.close();
	}

}
