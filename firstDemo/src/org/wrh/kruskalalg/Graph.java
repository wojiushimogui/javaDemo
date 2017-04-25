package org.wrh.kruskalalg;

import java.util.List;



//图的类
public class Graph {
	/*
	 * 图中的顶点的个数
	 * */
	private int vertices_number;
	/*
	 * 图中的边的个数
	 * */
	private int edges_number;
	/*
	 * 图中边对象的引用
	 * */
	private List<Edge> edge;
	
	public Graph(int vertices_number, int edges_number) {
		super();
		this.vertices_number = vertices_number;
		this.edges_number = edges_number;
	}
	public int getVertices_number() {
		return vertices_number;
	}
	public void setVertices_number(int vertices_number) {
		this.vertices_number = vertices_number;
	}
	public int getEdges_number() {
		return edges_number;
	}
	public void setEdges_number(int edges_number) {
		this.edges_number = edges_number;
	}
	public List<Edge> getEdge() {
		return edge;
	}
	public void setEdge(List<Edge> edge) {
		this.edge = edge;
	}
	
	

}
