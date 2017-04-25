package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	private final static int NUM = 3;
	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(NUM);
		
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
Thread-0  初始化开始。。。
Thread-1  初始化开始。。。
Thread-2  初始化开始。。。
Thread-0  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-2  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-1  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-2 其他task初始化结束，开始运行！
Thread-1 其他task初始化结束，开始运行！
Thread-0 其他task初始化结束，开始运行！
 * */
