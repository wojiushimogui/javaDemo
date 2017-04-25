package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierDemo6 {
	private final static int NUM = 3;
	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(NUM,new Runnable(){

			@Override
			public void run() {
				
				System.out.println(Thread.currentThread().getName() + "  执行barrier自带的任务！此任务会抛异常");
				int a = 1/0;//故意抛异常
			}
			
		});
		
		for(int i=0;i<NUM;i++){
			new Task(barrier).start();
		}
		
	}
	
	static class Task extends Thread{
		
		private CyclicBarrier barrier;
		public Task(CyclicBarrier barrier){
			this.barrier = barrier;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "  初始化开始。。。");
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "  初始化结束，等待其他task初始化结束，然后再继续运行！");
				barrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " 其他task初始化结束，开始运行！");
			
		}
		
	}

}

/*
Thread-1  初始化开始。。。
Thread-0  初始化开始。。。
Thread-2  初始化开始。。。
Thread-1  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-0  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-2  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-0  执行barrier自带的任务！此任务会抛异常
Thread-2 其他task初始化结束，开始运行！
Thread-1 其他task初始化结束，开始运行！
Exception in thread "Thread-0" java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.wrh.readwritelock.CyclicBarrierDemo6$Task.run(CyclicBarrierDemo6.java:42)
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.wrh.readwritelock.CyclicBarrierDemo6$Task.run(CyclicBarrierDemo6.java:42)
java.lang.ArithmeticException: / by zero
	at com.wrh.readwritelock.CyclicBarrierDemo6$1.run(CyclicBarrierDemo6.java:16)
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:220)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.wrh.readwritelock.CyclicBarrierDemo6$Task.run(CyclicBarrierDemo6.java:42)


当所有线程都到达barrier之后，然后调用CyclicBarrier自带的Runnable里面的run方法。
最后才是所有线程等待结束开始继续运行。当barrier 的任务抛异常，则会在当前线程中传播。


 * */
