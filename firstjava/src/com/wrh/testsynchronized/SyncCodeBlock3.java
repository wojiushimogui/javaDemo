package com.wrh.testsynchronized;

public class SyncCodeBlock3 {

	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		new Thread(mt,"Thread1").start();
		new Thread(mt,"Thread2").start();
	}

}

class MyThread5 implements Runnable{
	private static final int NUM = 3;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Thread1")){
			synMethod();
		}
		else if(name.equals("Thread2")){
			synMethod2();
		}
	}
	public void synMethod(){
		synchronized(this){
			for(int i=0;i<NUM;i++){
				System.out.println(Thread.currentThread().getName()+" running ....");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void synMethod2(){
		synchronized(this){
			for(int i=0;i<NUM;i++){
				System.out.println(Thread.currentThread().getName()+" running ...." + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
