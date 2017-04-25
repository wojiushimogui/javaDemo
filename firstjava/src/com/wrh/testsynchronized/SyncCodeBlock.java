//package com.wrh.testsynchronized;
//
//public class SyncCodeBlock {
//
////	public static void main(String[] args) {
////		MyThread mt = new MyThread();
////		new Thread(mt,"Thread1").start();
////		new Thread(mt,"Thread2").start();
////	}
//	public static void main(String[] args){
//		MyThread mt = new MyThread();
//		MyThread mt2 = new MyThread();
//		new Thread(mt,"Thread1").start();
//		new Thread(mt2,"Thread2").start();
//	}
//
//}
//
//class MyThread implements Runnable{
//	private static final int NUM = 3;
//	@Override
//	public void run() {
//		synchronized(this){
//			for(int i =0;i<NUM;i++){
//				System.out.println(Thread.currentThread().getName()+"  running .....");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			
//		}
//	}
//	
//}
