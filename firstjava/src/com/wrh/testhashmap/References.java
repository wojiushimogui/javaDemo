package com.wrh.testhashmap;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

	public class References {
	
		private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<VeryBig>();
		public static void checkQueue(){
			Reference<? extends VeryBig> inq = rq.poll();
			if(inq!=null){
				System.out.println("In queue:"+inq.getClass().getSimpleName());
			}
		}
	
		public static void main(String[] args) {
			int size = 10;
			/*
			 * SoftReference:���ڴ治��ʱ�Ż�������������ö���
			 * */
			LinkedList<SoftReference<VeryBig>> sa = new  LinkedList<SoftReference<VeryBig>>();
			for(int i=0;i<size;i++){
				sa.add(new SoftReference(new VeryBig("Soft "+i),rq));
				System.out.println("Just created: "+sa.getLast().get());
				checkQueue();//һֱΪ��
			}
			/*
			 * WeakReference:��GC����ֻ���������õĶ����������������
			 * */
			LinkedList<WeakReference<VeryBig>> wa = new  LinkedList<WeakReference<VeryBig>>();
			for(int i=0;i<size;i++){
				wa.add(new WeakReference(new VeryBig("Weak "+i),rq));
				System.out.println("Just created: "+wa.getLast().get());
				checkQueue();
			}
			
			SoftReference<VeryBig> sf = new SoftReference<VeryBig>(new VeryBig("Soft "));
			WeakReference<VeryBig> wf = new WeakReference<VeryBig>(new VeryBig("Weak"));
			
			System.gc();//��ʾ�Ľ����������գ�ʲôʱ��ִ�о���JVM����
			
			LinkedList<PhantomReference<VeryBig>> pa = new  LinkedList<PhantomReference<VeryBig>>();
			for(int i=0;i<size;i++){
				pa.add(new PhantomReference(new VeryBig("Phantom "+i),rq));
				System.out.println("Just created: "+pa.getLast());
				checkQueue();
			}	
			
//			System.gc();
//			
//			for(int i=0;i<size;i++){
//				checkQueue();
//			}
		}
	
	}
	
	class VeryBig{
		private static final int SIZE = 10000;
		private long[] la = new long[SIZE];
		private String ident;
		public VeryBig(String id){
			ident = id;
		}
		public String toString(){
			return ident;
		}
		
		protected void finalize(){
			System.out.println("Finalizing "+ ident);
		}
		
	}
