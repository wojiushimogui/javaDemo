package com.wrh.listIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	public class TestListIterator {
		
		public static void main(String[] args){
			
			List<String> list = new LinkedList<String> ();
			inits(list);
			//Iterator������
			System.out.println("1��Iterator������������������=======================");
			Iterator<String> it = list.iterator();
			//1���������
			while(it.hasNext()){
				System.out.print(it.next()+" ");
			}
			//1���������,������ֻ��һ����ʹ�ã����磬�������Ѿ��������һ��֮������ı����ͽ�û���κ����
	//		while(it.hasNext()){
	//			System.out.print(it.next()+" ");
	//		}
			//����
			System.out.println();
			System.out.println("=======================");
			
			System.out.println("2��ListIterator������������������=======================");
			//ListIterator������
			ListIterator<String> lIt = list.listIterator();
			//��ʱ�ڵ���������ǰ����ӵģ�lIt.hasNext�����ʲ���
			lIt.add("C");
			lIt.add("Python");
			
			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i)+"  ");
			}
			//����
			System.out.println();
			//2���������
			while(lIt.hasNext()){
				System.out.print(lIt.next()+" ");
			}
			//����
			System.out.println();
			System.out.println("3��ListIterator�������ķ���������=======================");
			//3���������
			while(lIt.hasPrevious()){
				System.out.print(lIt.previous()+" ");
			}
			//����
			System.out.println();
			System.out.println("4��ListIterator���������޸�Ԫ�ص�Ӧ��=======================");
			//4��ListIteraor�����������޸�Ԫ��
			for(;lIt.hasNext();){
				String str = lIt.next();		
				lIt.set(str+"heihei");
			}
			while(lIt.hasPrevious()){
				System.out.print(lIt.previous()+" ");
			}
			//����
			System.out.println();
			System.out.println("5��ListIterator��������nextIndex��Ӧ��=======================");
			//5������ListIterator��nextIndex�Ĺ���
			while(lIt.hasNext()){
				int index = lIt.nextIndex();
				System.out.println("  "+index);
				String str = lIt.next();
				if(index == 1){
					lIt.set(str+"wuranghao");
				}
			}
			System.out.println("-----------------------");
			//���
			while(lIt.hasPrevious()){
				String str = lIt.previous();
				System.out.print( str + ",");
			}
			System.out.println();

			
		}
	
		private static void inits(List<String> list) {
			list.add("1��Java");
			list.add("2��C++");
			list.add("3��C#");
		}
	}
