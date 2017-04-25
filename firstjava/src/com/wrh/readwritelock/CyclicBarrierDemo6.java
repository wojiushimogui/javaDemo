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
				
				System.out.println(Thread.currentThread().getName() + "  ִ��barrier�Դ������񣡴���������쳣");
				int a = 1/0;//�������쳣
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
			System.out.println(Thread.currentThread().getName() + "  ��ʼ����ʼ������");
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�");
				barrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " ����task��ʼ����������ʼ���У�");
			
		}
		
	}

}

/*
Thread-1  ��ʼ����ʼ������
Thread-0  ��ʼ����ʼ������
Thread-2  ��ʼ����ʼ������
Thread-1  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-0  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-2  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-0  ִ��barrier�Դ������񣡴���������쳣
Thread-2 ����task��ʼ����������ʼ���У�
Thread-1 ����task��ʼ����������ʼ���У�
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


�������̶߳�����barrier֮��Ȼ�����CyclicBarrier�Դ���Runnable�����run������
�����������̵߳ȴ�������ʼ�������С���barrier ���������쳣������ڵ�ǰ�߳��д�����


 * */
