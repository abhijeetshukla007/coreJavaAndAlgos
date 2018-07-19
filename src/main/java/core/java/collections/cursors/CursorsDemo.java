/**
 * 
 */
package core.java.collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author M1034403
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
