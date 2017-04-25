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
				//����Ϣ�ٿ����߳�
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
			System.out.println(Thread.currentThread().getName() + "  ��ʼ����ʼ������");
			try {
				Thread.sleep(2000);//ģ���ʼ��
				System.out.println(Thread.currentThread().getName() + "  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�");
				barrier.await(3, TimeUnit.SECONDS);//�ȴ�3�룬��������߳�3���û�е���barrier��������쳣Ȼ���������������
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " ����task��ʼ����������ʼ���У�");
			
		}
		
	}

}

/*
Thread-1  ��ʼ����ʼ������
Thread-0  ��ʼ����ʼ������
Thread-1  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-0  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-2  ��ʼ����ʼ������
java.util.concurrent.TimeoutException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:257)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-0 ����task��ʼ����������ʼ���У�
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-1 ����task��ʼ����������ʼ���У�
Thread-2  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:207)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.wrh.readwritelock.CyclicBarrierDemo3$Task.run(CyclicBarrierDemo3.java:45)
Thread-2 ����task��ʼ����������ʼ���У�


���ۣ����ʹ��await(time,unit);������ʱ��󣬻����������߳�û�е���ȴ��㣬���Ѿ�����ȴ�����߳̾ͻ�ֱ�����쳣��������������

 * */
