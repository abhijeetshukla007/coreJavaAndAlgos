/**
 * 
 */
package core.java.datatypes;

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
	}
}
