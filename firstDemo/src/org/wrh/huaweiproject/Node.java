package org.wrh.huaweiproject;
/*
 * 节点类
 * */
public class Node {
	/*
	 * 存储数据信息
	 * */
	public int info;
	/*
	 * 节点的引用，用来指向下一个节点
	 * */
	public Node next;
	public Node(){
	}
	public Node(int info){
		this(info,null);
		
	}
	public Node(int info,Node next){
		this.info=info;
		this.next=next;
	}
	
	

}
