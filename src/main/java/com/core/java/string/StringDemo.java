/**
 * 
 */
package com.core.java.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author abhijeet Q1: Given a string, return whether string is valid or
 *         invalid. A valid string is one which has each character repeating the
 *         same no of times as any other character. Also, if, at most one
 *         character appears unmatched no of times than rest of the characters,
 *         its also a valid string. All other strings are invalid.
 * 
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		System.out.println(validString("abhijeet"));
	}

	/**
	 * @param string
	 */
	private static Map validString(String string) {
		Map<Character, Integer> map = new HashMap<>();
		char[] temp = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			map.put(temp[i], map.get(temp[i]) != null ? map.get(temp[i]) + 1 : 1);
		}
		int avg = 0, count;
		Map<Character, Integer> sortedByValue = map.entrySet().stream().sorted()
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		// map = map.entrySet().stream().sorted(Map.Entry.<Character,
		// Integer>comparingByValue())
		// .collect(Collectors.toMap(Collectors.toMap(e -> e.getKey(), e ->
		// e.getValue())));

		return map;
	}

}
