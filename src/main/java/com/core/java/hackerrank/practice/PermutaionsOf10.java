package com.core.java.hackerrank.practice;

import java.util.HashMap;

public class PermutaionsOf10 {
	public static void main(String[] args) {
		int[] arr = { 1,1, 2, 3, 4, 5, 6, 7, 8, 9, 0664, 4242, 2 };
		HashMap<Integer, Integer> map = new HashMap<>();
		int combinations = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			for (int j = 0; j < i; j++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			if (map.containsKey(10 - arr[i])) {
				combinations = combinations + map.get(arr[i]) + 1;
			}	
			
		}
		System.out.println(combinations);
	}
}
