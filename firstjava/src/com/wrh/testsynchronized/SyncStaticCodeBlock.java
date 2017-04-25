package com.wrh.testsynchronized;

public class SyncStaticCodeBlock {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		new Thread(mt,"Thread1").start();
		new Thread(mt2,"Thread2").start();
		
	}

}

class MyThread2 implements Runnable{

	private static final int NUM = 3;
	@Override
	public void run() {
		print();
	}
	
	public synchronized static void print() {
		for(int i=0;i<NUM;i++){
			System.out.println(Thread.currentThread().getName()+" running... "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
