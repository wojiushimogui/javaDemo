package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierDemo4 {
	private final static int NUM = 3;
	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(NUM,new Runnable(){

			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "  执行barrier自带的任务！");
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
Thread-0  执行barrier自带的任务！
Thread-0 其他task初始化结束，开始运行！
Thread-1 其他task初始化结束，开始运行！
Thread-2 其他task初始化结束，开始运行！

在线程中我故意将CyclicBarrier 中的sleep时间设置的相当长，发现结果是这样的。

当所有线程都到达barrier之后，然后调用CyclicBarrier自带的Runnable里面的run方法。
最后才是所有线程等待结束开始继续运行。

至于是哪个线程来执行CyclicBarrier对象中的任务就需要我们看下源码的实现了，目前在网上看到的说是：随机选取一个
 * */
