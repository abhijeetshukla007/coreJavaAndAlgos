package com.core.java.objectclass;

import java.util.Objects;

public class TestObjectClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sample sample = new Sample("abhijeet", 3);
		Sample sample2 = (Sample) sample.clone();
		System.out.println(sample.getTemp().equals(sample2.getTemp()));
		System.out.println(sample == sample2);
		System.out.println(sample.clone().equals(sample));
		System.out.println(Objects.requireNonNull(sample));
		sample.test(sample);
		sample.test(null);
	}
}

class Sample implements Cloneable {
	private String temp;
	private int t;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public Sample(String temp, int t) {
		super();
		this.t = t;
		this.temp = temp;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	void test(Sample sample) {
		Objects.requireNonNull(sample);
	}

}
