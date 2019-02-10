package com.core.java8.interfaces;

public interface Functionality2 {

	public void executeF2();

	default void commonMethod() {
		System.out.println("commonMethod F2");
	}
}
