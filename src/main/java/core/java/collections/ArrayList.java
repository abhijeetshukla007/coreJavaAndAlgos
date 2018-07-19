/**
 * 
 */
package core.java.collections;

import java.util.Collections;
import java.util.List;

/**
 * @author abhijeet
 *
 */
public class ArrayList {

	public ArrayList() {

	}

	public static void main(String[] args) {
		List<Integer> intList = new java.util.ArrayList<>();
		List<Integer> list2 = Collections.synchronizedList(intList);
		System.out.println(4 >> 1);
	}
}
