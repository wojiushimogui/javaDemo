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
Thread-0  ��ʼ����ʼ������
Thread-1  ��ʼ����ʼ������
Thread-2  ��ʼ����ʼ������
Thread-0  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-2  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-1  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-2 ����task��ʼ����������ʼ���У�
Thread-1 ����task��ʼ����������ʼ���У�
Thread-0 ����task��ʼ����������ʼ���У�
 * */
