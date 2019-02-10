package com.core.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(System.out::print);
		System.out.println();
		// skip will skip the first 7 elements
		IntStream.range(0, 10).skip(7).forEach(System.out::print);
		System.out.println();

		// sum will return the sum of all elements
		System.out.println(IntStream.range(0, 10).sum());
		System.out.println();

		// stream Of
		System.out.println(Stream.of("Ahd", "Ae", "Aaa", "aaa").sorted().findFirst());
		System.out.println();

		// Arrays Of
		String[] names = { "Ahd", "Ae", "Aaa", "aaa", "shlkjdd", "dkjasd", "bdhddda", "ram" };
		Arrays.stream(names).filter(n -> n.startsWith("D")).forEach(System.out::print);
		System.out.println();

		// averaging squares of streams of int array
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 }).map(i -> i * i).average().ifPresent(System.out::print);
		System.out.println();

		// getting data from text files
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 }).map(i -> i * i).average().ifPresent(System.out::print);
		System.out.println();

		// reading from a fileData
		try {
			Stream<String> bands = Files.lines(Paths.get("bands.txt"));
			Stream<String> bands2 = Files.lines(Paths.get("bands.txt"));

			List<String> bandList = bands.collect(Collectors.toList());
			System.out.println(bandList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
