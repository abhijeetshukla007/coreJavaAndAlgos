package com.core.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class AdvancedOperationsStreams {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		// Statistics demo
		IntSummaryStatistics statistics = persons.stream().collect(Collectors.summarizingInt(s -> s.age));
		System.out.println(statistics);

		// Averaging int
		Double average = persons.stream().collect(Collectors.averagingInt(s -> s.age));
		System.out.println(average);

		// Grouping by
		Map<Integer, List<Person>> groupedByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));
		System.out.println(groupedByAge);

		// 
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}

}