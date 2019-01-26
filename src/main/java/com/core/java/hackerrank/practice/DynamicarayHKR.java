/** input 
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
 * 
 */
package com.core.java.hackerrank.practice;

/**
 * @author abhij
 *
 */
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicarayHKR {

	static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		AtomicInteger lastAnswer = new AtomicInteger(0);
		ArrayList<Integer> answers = new ArrayList<>();
		LinkedList<Integer> [] workerList = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			workerList[i]=new LinkedList<>();
		}
		queries.stream().forEach(q -> {
			int x = q.get(1);
			int y = q.get(2);
			int index = (x ^ lastAnswer.get()) % n;
			LinkedList<Integer> seq = workerList[index];
			if (q.get(0) == 1) {				
				seq.add(y);
				System.out.println(workerList.toString());
			} else if (q.get(0) == 2) {
				lastAnswer.set(seq.get(y % seq.size()));
				answers.add(lastAnswer.get());
			}

		});
		return answers;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/abhij/Desktop/resultHKR.txt"));

		String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nq[0]);

		int q = Integer.parseInt(nq[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = dynamicArray(n, queries);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
