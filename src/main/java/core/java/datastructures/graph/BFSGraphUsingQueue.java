package core.java.datastructures.graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author abhij
 *
 */
public class BFSGraphUsingQueue {
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 2, 0);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 3);
		graph.printGraph(graph);
		Queue<Integer> queue = new LinkedList<>();
		queue.add(2);
		boolean[] visited = new boolean[graph.vertices];
		bfsGraph(graph, 2, queue, visited);
		bfsWhileLoopGraph(graph, 2, queue, visited);
	}

	public static void bfsGraph(Graph graph, int source, Queue<Integer> queue, boolean[] visited) {

		if (queue.isEmpty() || source == -1) {
			return;
		}
		int element = queue.poll();
		if (!visited[element]) {
			System.out.println(element);
			visited[element] = true;
		}

		LinkedList<Integer> list = graph.adjacencyListArray[element];
		for (int i = 0; i < list.size(); i++) {
			if (!visited[list.get(i)]) {
				queue.add(list.get(i));
			}
		}

		bfsGraph(graph, !queue.isEmpty() ? queue.peek() : -1, queue, visited);

	}

	public static void bfsWhileLoopGraph(Graph graph, int source, Queue<Integer> queue, boolean[] visited) {
		while (!queue.isEmpty()) {
			int element = queue.poll();
			if (!visited[element]) {
				System.out.println(element);
				visited[element] = true;
			}
			LinkedList<Integer> list = graph.adjacencyListArray[element];
			for (int i = 0; i < list.size(); i++) {
				if (!visited[list.get(i)]) {
					queue.add(list.get(i));
				}
			}
		}
	}
}
