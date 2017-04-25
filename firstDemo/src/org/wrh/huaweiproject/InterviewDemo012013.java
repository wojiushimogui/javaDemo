package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * ��Ŀ����������������� 
��Ŀ������   
�������һ�����������������������е�ֵ��
 * */
public class InterviewDemo012013 {

	public static void main(String[] args) {
		/* ����
		 * ������ͷ���
		 * 
		 * */
		Node head=createList();
		System.out.println("����������������Ϣ");
		print(head);
		/*
		 * ���ط�ת���ͷ���
		 * */
		head=reserve(head);
		System.out.println("�����ת����������Ϣ");
		print(head);
		

	}

	private static Node  reserve(Node head) {
		/*
		 * ǰһ�����
		 * */
		Node preNode=null;
		/*
		 * ��ǰ���
		 * */
		Node currentNode=head;
		/*
		 * ��ʱ���
		 * */
		Node tempNode;
		while(currentNode.next!=null){
			tempNode=currentNode.next;
			currentNode.next=preNode;
			preNode=currentNode;
			currentNode=tempNode;
			
		}
		//���˳�whileѭ��֮��
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
		 * ���������
		 * */
		Random r=new Random(47);
		/*
		 * ����ͷ���
		 * */
		Node head=new Node(r.nextInt(100));
		/*
		 * ��ʱ��㣬
		 * */
		Node tempNode;
		/*
		 * ��ǰ���
		 * */
		Node current=head;
		System.out.println("������Ҫ�����Ľ������");
		String m=null;
		try {
			m = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * ��������
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
