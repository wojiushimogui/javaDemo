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
				System.out.println(Thread.currentThread().getName() + "  ִ��barrier�Դ�������");
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
				barrier.await(2,TimeUnit.SECONDS);//�ȴ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " ����task��ʼ����������ʼ���У�");
			
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
 * �����뻻��barrier.await(2,TimeUnit.SECONDS);��Ȼ��ʱCyclicBarrier�����е�Runnable��ִ��ʱ��Ϊ20s�����ǲ������κ��쳣��
 * ��˵��barrier.await(time,TimeUnit)�����ȴ�����������barrier��ʱ�䣬��������ִ��CyclicBarrier�����е�Runnable��ʱ��
Thread-1  ��ʼ����ʼ������
Thread-0  ��ʼ����ʼ������
Thread-2  ��ʼ����ʼ������
Thread-1  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-0  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-2  ��ʼ���������ȴ�����task��ʼ��������Ȼ���ټ������У�
Thread-0  ִ��barrier�Դ������� 
Thread-0 ����task��ʼ����������ʼ���У�
Thread-1 ����task��ʼ����������ʼ���У�
Thread-2 ����task��ʼ����������ʼ���У�

 * */
