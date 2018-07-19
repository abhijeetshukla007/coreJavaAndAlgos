package com.core.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinFunctions {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Lokesh", 36));
		emps.add(new Employee(2, "Alex", 52));
		emps.add(new Employee(3, "Alexa", 52));

		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);

		// Get Min or Max Object
		Employee minObject = emps.stream().min(comparator).get();
		Employee maxObject = emps.stream().max(comparator).orElseGet(null);

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);

	}
}

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
		return str.toString();
	}
}