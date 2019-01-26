package com.core.java.hackerrank.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ThoughtWorksAnkesh {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());

		String name = br.readLine(); // Reading input
		System.out.println(countFunc(name));
	}

	private static int countFunc(String s) {
		Map<Character, Integer> hashMap = new ConcurrentHashMap<Character, Integer>();
		char key;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			key = s.charAt(i);
			if (hashMap.containsKey(key))
				hashMap.put(key, hashMap.get(key) + 1);
			else
				hashMap.put(key, 1);
		}
		int count = 0, result = 0;
		while (count < len) {
			Optional<Integer> min = hashMap.values().stream().min(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
			});
			Iterator<Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
			while (iterator.hasNext()) {
				char k = iterator.next().getKey();
				if (hashMap.get(k) - min.get() != 0)
					hashMap.put(k, hashMap.get(k) - min.get());
				else
					hashMap.remove(k);
				count += min.get();
			}
			result++;
		}
		return result;
	}

}
