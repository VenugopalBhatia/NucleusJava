package Graphs;

import java.util.ArrayList;

public class Vertex {
	String name;
	ArrayList<Edge> edges;

	Vertex(String name){
		this.name = name;
		this.edges = new ArrayList<>();
	}

	public void addEdge(Edge e) {
		edges.add(e);
	}

	public boolean isAdjacent(Vertex second) {
		for(Edge e : edges){
			if(e.first == second || e.second == second){
				return true;
			}
		}
		return false;
	}

	public void removeEdgeWith(Vertex v2) {
		for(int i = 0; i < edges.size(); i++){
			Edge currentEdge = edges.get(i);
			if(currentEdge.first == v2 || currentEdge.second == v2){
				edges.remove(i);
				break;
			}
		}

	}

	public ArrayList<Vertex> getAdjacent() {
		ArrayList<Vertex > adjacentVertices = new ArrayList<>();
		for(Edge e : edges){
			if(e.first == this){
				adjacentVertices.add(e.second);
			}
			else{
				adjacentVertices.add(e.first);
			}
		}

		return adjacentVertices;
	}

	public void print() {
		String toBePrinted = this.name +" : ";
		for(Edge e : edges){
			if(e.first == this){
				toBePrinted += e.second.name+", ";
			}
			else{
				toBePrinted += e.first.name+", ";
			}
		}
		System.out.println(toBePrinted);
	}
	
}
