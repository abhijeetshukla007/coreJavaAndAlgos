/**
 * 
 */
package core.java.collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author M1034403
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set set = new LinkedHashSet<>();
		set.add(2);
		set.add("sdfg");
		set.add(0b000001100011);
		System.out.println(set);
		Set set2 = Collections.synchronizedSet(set);
	}
}
