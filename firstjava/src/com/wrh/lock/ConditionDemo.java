package com.wrh.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
	private static Lock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable(){

			@Override
			public void run() {
				lock.lock();	
				System.out.println(Thread.currentThread().getName()+"�������С�������");
				try {
					System.out.println(Thread.currentThread().getName()+"ֹͣ���У��ȴ�һ��signal");
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���һ��signal������ִ��");
				lock.unlock();
			}
			
		},"waitThread");
		thread1.start();
		
		try {
			Thread.sleep(1000);//��֤�߳�1��ִ�У������߳�1��һֱ�ȴ�signal�ź�
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Thread thread2 = new Thread(new Runnable(){

			@Override
			public void run() {
				lock.lock();	
				System.out.println(Thread.currentThread().getName()+"�������С�������");
				condition.signal();//�����źţ����������߳�
				System.out.println(Thread.currentThread().getName()+"����һ��signal");
				System.out.println(Thread.currentThread().getName()+"����һ��signal�󣬽���");
				lock.unlock();
			}
			
		},"signalThread");
		thread2.start();
		
	}

}
