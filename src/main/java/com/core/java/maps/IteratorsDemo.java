/**
 * 
 */
package com.core.java.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author abhijeet
 *
 */
public class IteratorsDemo {

	private static HashMap<Integer, String> hashMap;

	public static void main(String[] args) {
		hashMap = new HashMap<>();
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		hashMap.put(4, "four");
		IteratorsDemo.FailSafe.test();
		IteratorsDemo.FailFast.test();
	}

	static class FailFast {
		public static void test() {
			Iterator<Integer> iterator = hashMap.keySet().iterator();
			while (iterator.hasNext()) {
				System.out.println("fail fast" + iterator.next());
				hashMap.remove(1);
			}
		}
	}

	static class FailSafe {
		public static void test() {
			CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
			Iterator<Integer> iterator=list.iterator();
			while (iterator.hasNext()) {
				System.out.println("fail safe executed");
				Integer integer = iterator.next();
				list.add(6);
			}
		}
	}
}
