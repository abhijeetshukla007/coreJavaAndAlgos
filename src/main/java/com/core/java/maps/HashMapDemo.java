/**
 * 
 */
package com.core.java.maps;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author abhijeet
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put(null, 2);
		map.put(null, 4);
		map.put("a", 4);

		map.put("z", 4);
		map.put("c", 4);

		System.out.println(map);
		// String min = Collections.min(map.keySet());
		System.out.println(map.put("null", 2)); // returns previous value
												// associated with the key or
												// returns null

		System.out.println(map.put("null", 3));// different representation
												// showing same key in console
		System.out.println(map);
		map = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(map);

		ConcurrentHashMap<String, Integer> test = new ConcurrentHashMap<String, Integer>();
		Map<String, String> map2 = new HashMap<String, String>();

		Map<String, String> test2 = java.util.Collections.synchronizedMap(map2);

	}

	public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) {
		return null;
	}

	public static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) {
		Iterator<? extends T> i = coll.iterator();
		T candidate = i.next();

		while (i.hasNext()) {
			T next = i.next();
			if (next.compareTo(candidate) < 0)
				candidate = next;
		}
		return candidate;
	}
}
