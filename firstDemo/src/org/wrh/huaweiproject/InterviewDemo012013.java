package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * 题目二：逆序链表输出。 
题目描述：   
将输入的一个单向链表，逆序后输出链表中的值。
 * */
public class InterviewDemo012013 {

	public static void main(String[] args) {
		/* 建表
		 * 并返回头结点
		 * 
		 * */
		Node head=createList();
		System.out.println("输出构造后的链表的信息");
		print(head);
		/*
		 * 返回反转后的头结点
		 * */
		head=reserve(head);
		System.out.println("输出反转后的链表的信息");
		print(head);
		

	}

	private static Node  reserve(Node head) {
		/*
		 * 前一个结点
		 * */
		Node preNode=null;
		/*
		 * 当前结点
		 * */
		Node currentNode=head;
		/*
		 * 临时结点
		 * */
		Node tempNode;
		while(currentNode.next!=null){
			tempNode=currentNode.next;
			currentNode.next=preNode;
			preNode=currentNode;
			currentNode=tempNode;
			
		}
		//当退出while循环之后
		currentNode.next=preNode;
		head=currentNode;
		return head;
		
	}

	private static void print(Node head) {
		while(head.next!=null){
			System.out.print(head.info+"   ");
			head=head.next;
			
		}
		System.out.println(head.info);
	}

	private static Node createList() {
		/*
		 * 产生随机数
		 * */
		Random r=new Random(47);
		/*
		 * 创建头结点
		 * */
		Node head=new Node(r.nextInt(100));
		/*
		 * 临时结点，
		 * */
		Node tempNode;
		/*
		 * 当前结点
		 * */
		Node current=head;
		System.out.println("请输入要创建的结点数：");
		String m=null;
		try {
			m = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 创建链表
		 * */
		if(m!=null){
			for(int i=0;i<Integer.valueOf(m);i++){
				tempNode=new Node(r.nextInt(100));
				current.next=tempNode;
				current=tempNode;
				
			}
		}
		
		return head;
		
	}

}
