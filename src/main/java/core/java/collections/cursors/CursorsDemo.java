/**
 * 
 */
package core.java.collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author abhijeet
 *
 */
public class CursorsDemo {

	static Enumeration<?> elements;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> arrayList=new Vector<>();
		elements=arrayList.elements();
	}

}
