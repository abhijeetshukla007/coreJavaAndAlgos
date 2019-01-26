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

		int[] distance = new int[8];
		distance[0] = 0;
		findShortestPath(graph, distance, 0);

	}

	private static void findShortestPath(int[][] graph, int[] distance, int current) {
		boolean[] spSet = new boolean[graph.length];
		int minValue, min = 0;
		while (!spSet[current]) {
			minValue = distance[current];
			for (int j = 0; j < graph[current].length; j++) {
				if (graph[current][j] != 0) {
					if (minValue == 0) {
						minValue = graph[current][j];
					} else if(minValue > graph[current][j]) {
						minValue =graph[current][j];
						min=j;
					}
					distance[j] = graph[current][j];
				}
			}
			distance[current] = distance[current] + minValue;
			spSet[current] = true;
			current=min;
		}
		System.out.println(Arrays.toString(spSet));
		System.out.println(Arrays.toString(distance));
	}
}
