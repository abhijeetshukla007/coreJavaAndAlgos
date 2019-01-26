package com.core.java.hackerrank.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * @author abhij
 *
 */
public class ArrayManipulationHKR {
	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		long[] array = new long[n];
		AtomicLong max = new AtomicLong(0);

		for (int j = 0; j < queries.length; j++) {
			int[] q = queries[j];
			IntStream.range(q[0] - 1, q[1]).parallel().forEach(i -> {
				array[i] = array[i] + q[2];
				if (array[i] > max.get()) {
					max.set(array[i]);
				}
			});
		}

		return max.get();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/abhij/Desktop/resultHKR.txt"));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];
		AtomicLong max = new AtomicLong(0);
		long[] array = new long[n];
		HashMap<Integer, Integer> addtionMap = new HashMap<>();
		HashMap<Integer, Integer> substractionMap = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
				if (j == 2) {
					if (addtionMap.containsKey(queries[i][j - 2])) {
						addtionMap.put(queries[i][j - 2], addtionMap.get(queries[i][j - 2]) + queriesItem);
					} else {
						addtionMap.put(queries[i][j - 2], queriesItem);
					}
					if (substractionMap.containsKey(queries[i][j - 1] + 1)) {
						substractionMap.put(queries[i][j - 1] + 1,
								substractionMap.get(queries[i][j - 1] + 1) + queriesItem);
					} else {
						substractionMap.put(queries[i][j - 1] + 1, queriesItem);
					}

				}
			}
		}
		long result = findMax(addtionMap, substractionMap, n + 1);
		System.out.println(result);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}

	private static long findMax(HashMap<Integer, Integer> addtionMap, HashMap<Integer, Integer> substractionMap,
			int n) {
		long[] array = new long[n];
		long currentVal = 0;
		long max = 0;
		for (int i = 0; i < array.length; i++) {
			if (addtionMap.containsKey(i + 1)) {
				currentVal = currentVal + addtionMap.get(i + 1);
			}
			if (substractionMap.containsKey(i + 1)) {
				currentVal = currentVal - substractionMap.get(i + 1);
			}
			array[i] = currentVal;
			if (array[i] > max) {
				max = array[i];
			}
		}
		// Arrays.sort(array);
		return max;
	}
}
