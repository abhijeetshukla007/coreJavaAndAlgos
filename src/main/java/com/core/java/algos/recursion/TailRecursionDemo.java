package com.core.java.algos.recursion;

public class TailRecursionDemo {
	public static void main(String[] args) {
		TailRecursionDemo demo = new TailRecursionDemo();
		System.out.println(demo.factorial(5));
	}

	int factorial(int n, int result/* accumulator */) {
		if (n == 0)
			return result;
		return factorial(n - 1, n * result);
	}

	private int factorial(int n) {
		return factorial(n, 1);
	}
}
