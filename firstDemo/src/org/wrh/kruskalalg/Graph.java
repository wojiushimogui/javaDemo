package org.wrh.kruskalalg;

import java.util.List;



//ͼ����
public class Graph {
	/*
	 * ͼ�еĶ���ĸ���
	 * */
	private int vertices_number;
	/*
	 * ͼ�еıߵĸ���
	 * */
	private int edges_number;
	/*
	 * ͼ�б߶��������
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
