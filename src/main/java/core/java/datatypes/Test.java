/**
 * 
 */
package core.java.datatypes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author abhijeet
 *
 */
public class Test {
	public static void main(String[] args) {
		long c = 9223372036854775807L;

		int x = 9;
		x = (int) c;
		System.out.println(x);
		System.out.println(Long.MAX_VALUE);
		Queue<Integer> integers = new LinkedList<>();
		integers.add(4);
		integers.add(1);
		integers.add(2);
		integers.add(3);

		System.out.println(integers.poll());
	}
}
