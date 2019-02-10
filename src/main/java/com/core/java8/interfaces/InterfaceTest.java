package com.core.java8.interfaces;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class InterfaceTest implements Functionality1, Functionality2, Z, X, Y {

	@Override
	public void executeF2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void executeF1() {

	}

	@Override
	public void commonMethod() {
		// TODO Auto-generated method stub
		Functionality2.super.commonMethod();
	}

	public static void main(String[] args) {

		System.out.println(isPrime(47));
		X x = new X() {
			@Override
			public long m(long d) {
				return d - 1;
			}
		};
		System.out.println(x.m(45));
		x = new Z() {

			@Override
			public long m(long d) {
				System.out.println("long value" + d);
				return d - 3;
			}
		};
		System.out.println(x.m(0b00000111));
		Y y = new Z() {

			@Override
			public long m(long d) {
				System.out.println("long value" + d);
				return d - 3;
			}
		};
		System.out.println(y.m(0b00000111));
		Z z = new InterfaceTest();
		System.out.println(z.m(45));
	}

	@Override
	public long m(long d) {
		System.out.println("X method");
		return 0;
	}

	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;

		return number > 1 && IntStream.range(2, number / 2 + 1).noneMatch(isDivisible);
	}
}

interface X {
	long m(long d);
}

interface Y {
	long m(long d);
}

interface Z extends X, Y {

}
