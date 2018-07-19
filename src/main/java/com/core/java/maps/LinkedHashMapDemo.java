/**
 * 
 */
package com.core.java.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author M1034403
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "twertet");
		linkedHashMap.put(null, "123456");
		linkedHashMap.put(null, "54321");
		System.out.println(linkedHashMap);
	}
}
