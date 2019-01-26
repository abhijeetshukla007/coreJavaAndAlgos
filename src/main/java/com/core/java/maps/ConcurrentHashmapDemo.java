package com.core.java.maps;

import java.util.concurrent.ConcurrentHashMap;

/**
 * The primary design goal of this hash table is to maintain concurrent
 * readability (typically method get(), but also iterators and related methods)
 * while minimizing update contention. Secondary goals are to keep space
 * consumption about the same or better than java.util.HashMap, and to support
 * high initial insertion rates on an empty table by many threads
 * 
 * @author abhijeet
 *
 */
public class ConcurrentHashmapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
	}
}
