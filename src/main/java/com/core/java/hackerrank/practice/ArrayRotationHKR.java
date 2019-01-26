package com.core.java.hackerrank.practice;

/**
 * @author abhij
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayRotationHKR {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		rotateArray(a, d);
		scanner.close();
	}

	private static void rotateArray(int[] a, int d) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i + 1 <= d) {
				str1.append(a[i]+" ");
			} else {
				str2.append(a[i]+" ");
			}
		}
		System.out.println(str2.toString()+str1.toString());
	}
}