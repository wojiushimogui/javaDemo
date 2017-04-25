package com.wrh.readwritelock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierDemo5 {
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
				barrier.await(2,TimeUnit.SECONDS);//等待两秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " 其他task初始化结束，开始运行！");
			
		}
		
	}
	
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1.0;
        }
        if(exponent==1){
            return base;
        }
        int val = exponent&0x01;
        if(val==1){
            return base*Power(base*base,exponent);
        }
        else{
             return Power(base*base,exponent);
        }
  }

}

/*
 * 当代码换成barrier.await(2,TimeUnit.SECONDS);虽然此时CyclicBarrier对象中的Runnable的执行时间为20s，但是不会抛任何异常。
 * 这说明barrier.await(time,TimeUnit)方法等待的其它到达barrier的时间，而不包括执行CyclicBarrier对象中的Runnable的时间
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

 * */
