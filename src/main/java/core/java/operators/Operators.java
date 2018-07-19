/**
 * 
 */
package core.java.operators;

import java.util.ArrayList;

/**
 * @author abhijeet
 *
 */
class Operators {

	/**
	 * @param args
	 */
	static int b;

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		b = 1;
		int a = 4, c;
		a %= b;
		System.out.println(a);
		a = a & b;
		a >>>= b;
		a |= b;
		System.out.println();
		a = b = c = 20;
		byte bc = (byte) (a > b ? 3 : 4);
		System.out.println(a = ~b);
		a += b *= c;

		/* test for protected modifier */
		/*
		 * abstractTest.m1(); gives compile time error
		 */
		test test = new test();
	}

}

class test {

}
