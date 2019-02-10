/**
 * 
 */
package com.core.java.string;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author abhijeet
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(java.lang.String[] args) {

		String a = "abhijeeet";
		String b = "abhijeeet";
		System.out.println("equals method inmplemented in String results::::" + a.equals(b));
		System.out.print("same object  created inString pool results::::");
		System.out.println(a == b);
		String c = new String("abhijeeet");
		System.out.println("new string comparison with same value results in::::" + c.equals(a));
		System.out.println(c == a);

		StringBuilder d = new StringBuilder("abhijeeet");
		StringBuffer buffer = new StringBuffer("abhijeeet");

		System.out.println("buffer.equals test" + buffer.equals(b));
		String e = new String("abhijeeet");
		System.out.println(e.equals(c));
		System.out.println(e == c);

		Scanner scanner = new Scanner(System.in);
		String test = scanner.next();
		System.out.println(test == a);// returns false
		String a1 = "9456738572365648932758346782759273576";
		String b1 = "56736823748726353476582734827356545368752365";
		BigInteger bigInteger=new BigInteger(a1);
		System.out.println(bigInteger);
		

	}

}
