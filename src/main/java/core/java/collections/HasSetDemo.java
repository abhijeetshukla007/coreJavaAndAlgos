/**
 * 
 */
package core.java.collections;

import java.util.HashSet;

/**
 * @author M1034403
 *
 */
public class HasSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(2);
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
	}	

}
