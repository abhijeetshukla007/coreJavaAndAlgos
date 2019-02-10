package com.core.java8.interfaces;

@FunctionalInterface
public interface Functionality1 {

	public void executeF1();

	default void commonMethod() {
		System.out.println("commonMethod F1");
	}
}
