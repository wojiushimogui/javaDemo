package org.wrh.huaweiproject;
/*
 * �ڵ���
 * */
public class Node {
	/*
	 * �洢������Ϣ
	 * */
	public int info;
	/*
	 * �ڵ�����ã�����ָ����һ���ڵ�
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
