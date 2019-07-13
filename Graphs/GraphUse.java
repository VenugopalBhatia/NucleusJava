package Graphs;

public class GraphUse {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addEdge("A", "B");
		g.addEdge("B", "C");
		g.addEdge("C","D");
		g.addEdge("D","E");
		g.print();
		System.out.println(g.havePath("A","E"));

	}
}
