package com.wrh.threadlocal;


import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo {

	private static AtomicInteger ai = new AtomicInteger(0);
	private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer> (){

		@Override
		protected Integer initialValue() {
			return ai.getAndIncrement();
		}
		
	};
	public static void main(String[] args) {
		int threadNum = 5;
		Thread[] threads = new Thread[threadNum];
		for(int i=0;i<threadNum;i++){
			threads[i] = new Thread(){

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
				}
				
			};
		}
		//Æô¶¯Ïß³Ì
		for(int i=0;i<threadNum;i++){
			threads[i].start();
		}
	}

}
