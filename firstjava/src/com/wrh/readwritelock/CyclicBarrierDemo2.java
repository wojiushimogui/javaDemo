package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo2 {
	private final static int NUM = 3;
	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(NUM);
		
		for(int i=0;i<NUM;i++){
			new Task(barrier).start();
		}
		
		try {
			Thread.sleep(20000);//等待其他线程执行完毕，当然我们这里可以选择使用CountDownLatch来实现。
			System.out.println("main线程休息结束！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//观察下CyclicBarrier是否可以复用
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
Thread-2 其他task初始化结束，开始运行！
Thread-1 其他task初始化结束，开始运行！
Thread-0 其他task初始化结束，开始运行！
main线程休息结束！
Thread-3  初始化开始。。。
Thread-4  初始化开始。。。
Thread-5  初始化开始。。。
Thread-4  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-3  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-5  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-5 其他task初始化结束，开始运行！
Thread-4 其他task初始化结束，开始运行！
Thread-3 其他task初始化结束，开始运行！

结论：从结果可以看出，CyclicBarrier确实是可以重用的。而CountDownLatch是不可以重用的
 * */
