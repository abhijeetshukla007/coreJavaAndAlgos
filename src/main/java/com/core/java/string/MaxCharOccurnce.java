/**
 * 
 */
package com.core.java.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author M1034403
 * 
 *         // Java program to output the maximum occurring character // in a
 *         string *
 */
public class MaxCharOccurnce {

	// Driver Method
	public static void main(String[] args) {

		String str = "sample string";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}

	/**
	 * @param str
	 * @return
	 */
	private static char getMaxOccuringChar(String str) {
		int[] array = new int[256];
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			array[charArr[i]]++;
		}

		int max = -1;
		char charVal = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (max < array[str.charAt(i)]) {
				max = array[str.charAt(i)];
				charVal = str.charAt(i);
			}
		}
		return charVal;
	}

	/**
	 * @param str
	 * @return
	 */
	private static char getMaxOccuringCharTreeMap(String str) {
		char charVal = ' ';

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char [] temp=str.toCharArray();
		for (int i = 0; i < str.toCharArray().length; i++) {
			map.put(temp[i], map.get(temp[i]) != null ? map.get(temp[i]) + 1 : 1);
		}
		Map<Character, Integer> sortedByValue = map.entrySet().stream().sorted()
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		
		
		return 0;
	}
}
