package org.wrh.algorithmdemo;
//�ߵ���
public class Edge implements Comparable<Edge> {
	/*
	 * �ߵ�ʼ��
	 * */
	private int src;
	/*
	 * �ߵ��յ�
	 * */
	private int dest;
	/*
	 * �ߵ�Ȩ��
	 * */
	private int weight;
	public Edge(int src, int dest,int weight) {
		super();
		this.src = src;
		this.dest = dest;
		this.weight=weight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		if(this.weight<o.weight)
			return -1;
		else if(this.weight>o.weight)
			return 1;
		else
			return 0;
	}
	public String toString(){
		return "("+src+","+dest+","+weight+")"+"\n";
	}
	
	
	
	

}
