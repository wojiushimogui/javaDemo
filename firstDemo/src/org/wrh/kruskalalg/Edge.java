package org.wrh.kruskalalg;
//�ߵ���
public class Edge {
	/*
	 * �ߵ�ʼ��
	 * */
	private int src;
	/*
	 * �ߵ��յ�
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
