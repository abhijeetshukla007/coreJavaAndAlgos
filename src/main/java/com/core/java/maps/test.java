package com.core.java.maps;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] temp = new int[101];
		Arrays.fill(temp, 0);

		for (int i = 1; i < temp.length; i++) {
			for (int j = i; j < temp.length; j = j + i) {
				temp[j] =~ temp[j];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
