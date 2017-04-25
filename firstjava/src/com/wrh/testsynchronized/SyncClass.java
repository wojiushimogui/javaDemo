package com.wrh.testsynchronized;

public class SyncClass {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		new Thread(mt,"Thread1").start();
		new Thread(mt2,"Thread2").start();
	}

}

class MyThread3 implements Runnable{

	private static final int NUM = 3;
	@Override
	public void run() {
		synchronized(MyThread3.class){
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
	
}
