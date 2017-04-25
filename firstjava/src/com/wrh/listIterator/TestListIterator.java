package com.wrh.listIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	public class TestListIterator {
		
		public static void main(String[] args){
			
			List<String> list = new LinkedList<String> ();
			inits(list);
			//Iterator迭代器
			System.out.println("1、Iterator迭代器的正向遍历输出=======================");
			Iterator<String> it = list.iterator();
			//1、正向输出
			while(it.hasNext()){
				System.out.print(it.next()+" ");
			}
			//1、正向输出,迭代器只能一次性使用，例如，当上面已经遍历输出一遍之后，下面的遍历就将没有任何输出
	//		while(it.hasNext()){
	//			System.out.print(it.next()+" ");
	//		}
			//换行
			System.out.println();
			System.out.println("=======================");
			
			System.out.println("2、ListIterator迭代器的正向遍历输出=======================");
			//ListIterator迭代器
			ListIterator<String> lIt = list.listIterator();
			//此时在迭代器的最前面添加的，lIt.hasNext还访问不了
			lIt.add("C");
			lIt.add("Python");
			
			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i)+"  ");
			}
			//换行
			System.out.println();
			//2、正向输出
			while(lIt.hasNext()){
				System.out.print(lIt.next()+" ");
			}
			//换行
			System.out.println();
			System.out.println("3、ListIterator迭代器的反向遍历输出=======================");
			//3、反相输出
			while(lIt.hasPrevious()){
				System.out.print(lIt.previous()+" ");
			}
			//换行
			System.out.println();
			System.out.println("4、ListIterator迭代器的修改元素的应用=======================");
			//4、ListIteraor迭代器可以修改元素
			for(;lIt.hasNext();){
				String str = lIt.next();		
				lIt.set(str+"heihei");
			}
			while(lIt.hasPrevious()){
				System.out.print(lIt.previous()+" ");
			}
			//换行
			System.out.println();
			System.out.println("5、ListIterator迭代器的nextIndex的应用=======================");
			//5、测试ListIterator中nextIndex的功能
			while(lIt.hasNext()){
				int index = lIt.nextIndex();
				System.out.println("  "+index);
				String str = lIt.next();
				if(index == 1){
					lIt.set(str+"wuranghao");
				}
			}
			System.out.println("-----------------------");
			//输出
			while(lIt.hasPrevious()){
				String str = lIt.previous();
				System.out.print( str + ",");
			}
			System.out.println();

			
		}
	
		private static void inits(List<String> list) {
			list.add("1、Java");
			list.add("2、C++");
			list.add("3、C#");
		}
	}
