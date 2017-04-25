package org.wrh.algorithmdemo;

import java.util.Arrays;
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
	 * ���ܣ���ͼ�е����б߰��ձߵ�Ȩ�ذ��մ�С���������,
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
