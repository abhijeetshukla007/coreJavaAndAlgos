package core.java.datastructures.graph;

import java.util.LinkedList;

/**
 * @author abhij
 *
 */
public class AdjacencyGraph {
	public static void main(String args[]) {
		// create the graph given in above figure
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);
		graph.printGraph(graph);
	}
}

class Graph {
	public LinkedList<Integer>[] adjacencyListArray;
	int vertices;

	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyListArray = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyListArray[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(Graph graph, int src, int dest) {
		graph.adjacencyListArray[src].add(dest);
		graph.adjacencyListArray[dest].add(src);
	}

	static void printGraph(Graph graph) {
		for (int v = 0; v < graph.vertices; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : graph.adjacencyListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

}
