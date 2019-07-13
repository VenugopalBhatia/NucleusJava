package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {


	ArrayList<Vertex> vertices;

	Graph(){
		vertices = new ArrayList<>();
	}

	public void print(){
		for(Vertex v : vertices){
			v.print();
		}
	}

	public void addVertex(String name){
		if(isVertexPresent(name)){
			return;
		}
		Vertex v = new Vertex(name);
		vertices.add(v);
	}

	public void addEdge(String name1, String name2){
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		if(first == null || second == null){
			return;
		}
		if(areAdjacent(name1,name2)){
			return;
		}
		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}

	public  boolean areAdjacent(String name1, String name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		if(v1 == null || v2 == null){
			return false;
		}

		//			return  v2.isAdjacent(v1);  //v1.isAdjacent(v2);
		return v1.isAdjacent(v2);
	}

	public void removeEdge(String name1, String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		if(v1 == null || v2 == null){
			return ;
		}

		if(!areAdjacent(name1, name2)){
			return;
		}

		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
	}

	private Vertex getVertex(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;
	}


	public void removeVertex(String name){
		Vertex v = getVertex(name);
		if(v == null){
			return;
		}
		ArrayList<Vertex> adjacentVertices = v.getAdjacent();
		for(Vertex adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	private boolean isVertexPresent(String name) {
		//			for(int i = 0; i < vertices.size(); i++){
		//				Vertex currentVertex = vertices.get(i);
		//				if(currentVertex.name.equals(name)){
		//					return true;
		//				}
		//			}
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
	}
	public int CountVertices(){
		return vertices.size();
	}
	public boolean havePath(String name1,String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		HashMap<Vertex,Boolean> visited=new HashMap();
		return havePath(v1,v2,visited);


	}
	public boolean havePath(Vertex v1,Vertex v2,HashMap<Vertex,Boolean> visited){
		if(v1 == null || v2 == null){
			return false;
		}
		if(v1.isAdjacent(v2)){
			return true;
		}
		visited.put(v1,true);
		ArrayList<Vertex> adj=new ArrayList<>();
		adj=v1.getAdjacent();
		for(Vertex v : adj){
			if(!visited.containsKey(v)){
				visited.put(v,true);
			System.out.println(v.name);
        return havePath(v,v2,visited);
		
		}
		}

		return false;

	}





	public boolean search(Vertex v1,Vertex v2){
		for(Vertex v :v1.getAdjacent()){
			if(v.name.equals(v2.name)){
				return true;
			}
		}
		return false;
	}
}




