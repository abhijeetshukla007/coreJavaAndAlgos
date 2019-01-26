package com.core.java.oops;

/**
 * @author abhijeet
 *
 */
public class OverridingTest {

	public Number method1() {
		return 1;
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {

	}
}
class ot1 extends OverridingTest
{
	@Override
	public Integer method1() {
		return 1;
	}
}
