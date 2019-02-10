package com.core.java.oops;

/**
 * @author abhij
 *
 */
public class OverloadingTest {

	public static void main(String[] args) {
		System.out.println(method1(10000000000000l));
		OverloadingTest obj = new OverloadingTest();
		// obj.sum(20,20);//now ambiguity
		Dog d1 = new Dog();
		System.out.println(d1.getClass().getClassLoader());
		System.out.println(d1.getClass().getClassLoader().getClass().getClassLoader());
		// d1.eat();
	}

	private static String method1(int s) {
		return "int called";
	}

	private static String method1(Integer q) {
		return "Integer called";
	}

	private static String method1(Number q) {
		return "Number called";
	}

	private static String method1(Long q) {
		return "Long called";
	}

	private static String method1(long q) {
		return "long called";
	}

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}
}

class Dog {
	private void eat() {
		System.out.println("dog is eating...");
	}
}
