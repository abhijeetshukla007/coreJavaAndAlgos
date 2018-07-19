package core.java.datastructures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashCodeAndMap {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Hash table based implementation of the <tt>Map</tt> interface. This
		 * implementation provides all of the optional map operations, and
		 * permits <tt>null</tt> values and the <tt>null</tt> key. (The
		 * <tt>HashMap</tt> class is roughly equivalent to <tt>Hashtable</tt>,
		 * except that it is unsynchronized and permits nulls.) This class makes
		 * no guarantees as to the order of the map; in particular, it does not
		 * guarantee that the order will remain constant over time.
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		Object object = new Object();
		System.out.println(object.hashCode());
		System.out.println(System.identityHashCode(object));
		hashMap.put("key1", "val1");
		hashMap.put("key2", "val2");
		hashMap.put("key3", "val3");
		hashMap.put("key4", "val4");
		try {
			hashMap.values().stream().forEach(v -> {
				if (v == "val3") {
					hashMap.remove("key3");
				}
			});
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("mnbvcx");
		}
		System.gc();
		Thread.sleep(4000);
		System.out.println(hashMap);
		try {

			Map<String, String> synchronizedhashMap = Collections.synchronizedMap(new HashMap<String, String>());

			synchronizedhashMap.put("key1", "val1");
			synchronizedhashMap.put("key2", "val2");
			synchronizedhashMap.put("key3", "val3");
			synchronizedhashMap.put("key4", "val4");
			synchronizedhashMap.values().stream().forEach(v -> {
				if (v == "val3") {
					synchronizedhashMap.remove("key3");
					System.out.println("No ConcurrentModificationException");
				}
			});
			System.gc();

			Thread.sleep(4000);
			System.out.println(synchronizedhashMap);
		} catch (Exception e) {
			
		}

		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("key1", "val1");
		concurrentHashMap.put("key2", "val2");
		concurrentHashMap.put("key3", "val3");
		concurrentHashMap.put("key4", "val4");
		concurrentHashMap.values().stream().forEach(v -> {
			if (v == "val3") {
				concurrentHashMap.remove("key3");
				System.out.println("No ConcurrentModificationException");
			}
		});

		WeakHashMap<HashTableTest, String> weakHashMap = new WeakHashMap<>();
		HashTableTest hashTableTest=new HashTableTest();
		weakHashMap.put(hashTableTest, "val1");
		hashTableTest=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("weak hash map" + weakHashMap);
	}

	static class Node<K, V> implements Map.Entry<K, V> {
		final int hash;
		final K key;
		V value;
		Node<K, V> next;

		Node(int hash, K key, V value, Node<K, V> next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		@Override
		public final K getKey() {
			return key;
		}

		@Override
		public final V getValue() {
			return value;
		}

		@Override
		public final String toString() {
			return key + "=" + value;
		}

		@Override
		public final int hashCode() {
			return Objects.hashCode(key) ^ Objects.hashCode(value);
		}

		@Override
		public final V setValue(V newValue) {
			V oldValue = value;
			value = newValue;
			return oldValue;
		}

		@Override
		public final boolean equals(Object o) {
			if (o == this)
				return true;
			if (o instanceof Map.Entry) {
				Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
				if (Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue()))
					return true;
			}
			return false;
		}
	}
}
