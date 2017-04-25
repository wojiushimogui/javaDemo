package org.wrh.algorithmdemo;

import java.util.Arrays;
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
	private List<Edge> edges;
	public Graph(){
		
	}
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
		return edges;
	}
	public void setEdge(List<Edge> edge) {
		this.edges = edge;
	}
	/*
	 * 功能：对图中的所有边按照边的权重按照从小到大的排序,
	 * 
	 * */
	public  Edge[] sort(){
		Edge [] arrayEdge=new Edge[edges.size()];
		for(int i=0;i<edges.size();i++){
			arrayEdge[i]=edges.get(i);
			
		}
		Arrays.sort(arrayEdge);
		return arrayEdge  ;
		
	}
	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for(Edge edge:edges){
			sb.append("(").append(edge.getSrc()).append(",").append(edge.getDest()).append(",").append(edge.getWeight()).append(")").append("\n");
			
		}
		return new String(sb);
	}
	

}
