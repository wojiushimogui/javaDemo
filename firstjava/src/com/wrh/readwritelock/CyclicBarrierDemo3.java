package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierDemo3 {
	private final static int NUM = 3;
	public static void main(String[] args){
		final CyclicBarrier barrier = new CyclicBarrier(NUM);
		
		for(int i=0;i<NUM;i++){
			if(i==NUM-1){
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//先休息再开启线程
				new Task(barrier).start();
				
			}
			else{
				new Task(barrier).start();
			}
			
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
				Thread.sleep(2000);//模拟初始化
				System.out.println(Thread.currentThread().getName() + "  初始化结束，等待其他task初始化结束，然后再继续运行！");
				barrier.await(3, TimeUnit.SECONDS);//等待3秒，如果所有线程3秒后还没有到达barrier，则会抛异常然后继续往下面运行
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " 其他task初始化结束，开始运行！");
			
		}
		
	}

}

/*
Thread-1  初始化开始。。。
Thread-0  初始化开始。。。
Thread-1  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-0  初始化结束，等待其他task初始化结束，然后再继续运行！
Thread-2  初始化开始。。。
java.util.concurrent.TimeoutException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:257)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-0 其他task初始化结束，开始运行！
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-1 其他task初始化结束，开始运行！
Thread-2  初始化结束，等待其他task初始化结束，然后再继续运行！
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:207)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-2 其他task初始化结束，开始运行！


结论：如果使用await(time,unit);当到达时间后，还存在其他线程没有到达等待点，则已经到达等待点的线程就会直接抛异常继续往下面运行

 * */
