package org.wrh.kruskalalg;
//边的类
public class Edge {
	/*
	 * 边的始点
	 * */
	private int src;
	/*
	 * 边的终点
	 * */
	private int dest;
	
	public Edge(int src, int dest) {
		super();
		this.src = src;
		this.dest = dest;
	}
	public int getSrc() {
		return src;
	}
	public void setSrc(int src) {
		this.src = src;
	}
	public int getDest() {
		return dest;
	}
	public void setDest(int dest) {
		this.dest = dest;
	}
	
	

}
