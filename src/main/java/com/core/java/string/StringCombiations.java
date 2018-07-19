/**
 * 
 */
package com.core.java.string;

/**
 * @author abhijeet
 *
 */
public class StringCombiations {

	public static void main(String[] args) {
		getAllCombiations("tests");
	}

	/**
	 * @param string
	 */
	private static void getAllCombiations(String string) {
		for (int i = 0; i < string.length(); i++) {
			for (int j = i+1; j < string.length(); j++) {
				System.out.println(string.substring(i, j));
			}
		}
	}
}
