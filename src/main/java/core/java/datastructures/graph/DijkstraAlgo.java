package core.java.datastructures.graph;

import java.util.Arrays;

/**
 * @author abhij
 *
 */
public class DijkstraAlgo {
	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

		int[] distance = new int[9];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0] = 0;
		// findShortestPath(graph, distance, 0);
		findShortestPath2102019(graph, distance, 0);

	}

	private static void findShortestPath2102019(int[][] graph, int[] distance, int current) {
		boolean[] spSet = new boolean[graph.length];
		int minValue, min = 0;
	
		while (!spSet[current]) {
			spSet[current] = true;
			minValue = distance[current];
			min = 0;
			for (int j = 0; j < graph[current].length; j++) {
				if (graph[current][j] != 0 && !spSet[j] && j != current) {
					distance[j] = distance[j] > graph[current][j]+distance[current] ? graph[current][j] + distance[current] : distance[j];
				}
			}
			
			current = findMin(distance, spSet);

			System.out.println("sp set " + Arrays.toString(spSet));
			System.out.println("distence " + Arrays.toString(distance));
		}
		System.out.println(Arrays.toString(spSet));
		System.out.println(Arrays.toString(distance));
	}

	private static int findMin(int[] distance, boolean[] spSet) {
		int min = Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < distance.length; i++) {
			if (!spSet[i]) {
				if (min > distance[i]) {
					min = distance[i];
					index=i;
				}
			}
		}

		return index;
	}

	private static void findShortestPath(int[][] graph, int[] distance, int current) {
		boolean[] spSet = new boolean[graph.length];
		int minValue, min = 0;
		while (!spSet[current]) {
			minValue = distance[current];
			for (int j = 0; j < graph[current].length; j++) {
				if (graph[current][j] != 0 && !spSet[j] && j != current) {
					if (minValue == 0) {
						minValue = graph[current][j];
						min = j;
					} else if (minValue > graph[current][j]) {
						minValue = graph[current][j];
						min = j;
					}
					if (j != current) {
						distance[j] = graph[current][j];
					} else if (!spSet[j]) {
						distance[j] = Math.min(graph[current][j], distance[j]);
					}

				}
			}
			System.out.println("minValue" + minValue + "j=" + min);
			spSet[current] = true;
			current = min;
		}
		System.out.println(Arrays.toString(spSet));
		System.out.println(Arrays.toString(distance));
	}
}
