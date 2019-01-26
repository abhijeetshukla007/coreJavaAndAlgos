package com.core.java.hackerrank.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThoughtWorksAbhijeet {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String name = br.readLine(); // Reading input
		System.out.println(countFunc(name));
	}

	private static int countFunc(String test) {
		Map<Character, Integer> hashMap = new ConcurrentHashMap();
		for (int i = 0; i < test.toCharArray().length; i++) {
			if (hashMap.containsKey(test.charAt(i))) {
				hashMap.put(test.charAt(i), hashMap.get(test.charAt(i)) + 1);
			} else {
				hashMap.put(test.charAt(i), 1);
			}
		}
		Set<Integer> set = new HashSet<>();
		Iterator<Entry<Character, Integer>> it = hashMap.entrySet().iterator();
		while (it.hasNext()) { }
		return (int) hashMap.values().parallelStream().distinct().count();
	}
}
