package core.java.datastructures.graph;

import java.util.LinkedList;

/**
 * @author abhij
 *
 */
public class DFSGraph {
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 2, 0);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 3);
		boolean[] visited = new boolean[graph.vertices];
		
		doDFSGraph(graph, 2, visited);
	}

	public static void doDFSGraph(Graph graph, int source, boolean[] visited) {
		if (visited[source]) {
			return;
		}
		System.out.println(source);
		visited[source] = true;
		LinkedList<Integer> adjList = graph.adjacencyListArray[source];
		for (int i = 0; i < adjList.size(); i++) {
			//visited[adjList.get(i)] = true;
			doDFSGraph(graph, adjList.get(i), visited);
		}
	}
}
