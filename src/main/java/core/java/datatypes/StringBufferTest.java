/**
 * 
 */
package core.java.datatypes;

/**
 * @author M1034403
 *
 */
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abhijeet");
		StringBuffer buffer2 = buffer;
		buffer2.append("shukla");
		System.out.println(buffer.toString());
		System.out.println(buffer2.toString());
	}
}
