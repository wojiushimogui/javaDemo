package com.wrh.testsynchronized;

public class SyncCodeBlock2 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt,"Thread1").start();
		new Thread(mt,"Thread2").start();
	}

}

class MyThread implements Runnable{
	private static final int NUM = 3;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Thread1")){
			synMethod();
		}
		else if(name.equals("Thread2")){
			notSynMethod();
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
	private int [] value = new int[0];
	public void notSynMethod(){
		synchronized(value){
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
	
}
